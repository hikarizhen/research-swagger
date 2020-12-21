package io.swagger.api.factories;

import io.swagger.api.FileApiService;
import io.swagger.api.impl.FileApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-12-21T05:28:40.081Z")
public class FileApiServiceFactory {
    private final static FileApiService service = new FileApiServiceImpl();

    public static FileApiService getFileApi() {
        return service;
    }
}
