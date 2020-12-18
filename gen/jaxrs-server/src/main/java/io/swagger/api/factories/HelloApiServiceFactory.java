package io.swagger.api.factories;

import io.swagger.api.HelloApiService;
import io.swagger.api.impl.HelloApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-12-18T01:39:40.716Z")
public class HelloApiServiceFactory {
    private final static HelloApiService service = new HelloApiServiceImpl();

    public static HelloApiService getHelloApi() {
        return service;
    }
}
