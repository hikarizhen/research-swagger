package io.swagger.api.factories;

import io.swagger.api.KnowledgeApiService;
import io.swagger.api.impl.KnowledgeApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-01-13T06:09:11.378Z")
public class KnowledgeApiServiceFactory {
    private final static KnowledgeApiService service = new KnowledgeApiServiceImpl();

    public static KnowledgeApiService getKnowledgeApi() {
        return service;
    }
}
