/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package quarkiverse.pokedex.client.it;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import quarkiverse.pokedex.client.runtime.PokeClient;
import quarkiverse.pokedex.client.runtime.PokeClientGraphQL;
import quarkiverse.pokedex.client.runtime.ReactivePokeClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("/")
@ApplicationScoped
public class PokedexClientResource {
    // add some rest methods here
    @Inject
    PokeClient pokeClient;
    @Inject
    PokeClientGraphQL graphQL;
    @Inject
    ReactivePokeClient reactivePokeClient;
    @GET
    @Path("berry/{id}")
    public Berry getBerryById(@PathParam("id") Integer id){
        return pokeClient.getBerryById(id);
    }

    @GET
    @Path("reactiveberry/{id}")
    public Uni<Berry> getBerryByID(@PathParam("id") Integer id){
        return reactivePokeClient.getBerryById(id);
    }

    @GET
    @Path("berriez/")
    public JsonObject getBerries() throws Exception {
        return graphQL.getBerries();
    }
    @GET
    @Path("graphql/{id}")
    public JsonObject getBerryByIDZ(@PathParam("id") Integer id) throws Exception {
        return graphQL.getBerryById(id);
    }
}
