package io.swagger.api.factories;

import io.swagger.api.VersionApiService;
import io.swagger.api.impl.VersionApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-01-13T06:09:11.378Z")
public class VersionApiServiceFactory {
    private final static VersionApiService service = new VersionApiServiceImpl();

    public static VersionApiService getVersionApi() {
        return service;
    }
}
