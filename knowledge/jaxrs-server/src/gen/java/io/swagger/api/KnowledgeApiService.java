package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.FWAllKnowledgeInfo;
import io.swagger.model.FWKnowledgeBaseException;
import io.swagger.model.FWKnowledgeInfo;
import java.io.File;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-01-13T06:09:11.378Z")
public abstract class KnowledgeApiService {
    public abstract Response getKnowledgeById( @NotNull String knowledgeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getKnowledgeInfo( @NotNull String knowledgeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response remove( @NotNull String knowledgeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadKnowledge(String knowledgeName,Integer expiredDate,String tag,String desc,InputStream inInputStream, FormDataContentDisposition inDetail,SecurityContext securityContext) throws NotFoundException;
}
