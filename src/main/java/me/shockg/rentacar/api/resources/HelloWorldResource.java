package me.shockg.rentacar.api.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello-world")
public class HelloWorldResource {

    @GET
    public String geHelloWorld() {
        return "Hello World!";
    }
}
