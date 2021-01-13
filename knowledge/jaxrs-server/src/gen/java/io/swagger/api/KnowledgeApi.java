package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.KnowledgeApiService;
import io.swagger.api.factories.KnowledgeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.FWAllKnowledgeInfo;
import io.swagger.model.FWKnowledgeBaseException;
import io.swagger.model.FWKnowledgeInfo;
import java.io.File;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/Knowledge")


@io.swagger.annotations.Api(description = "the Knowledge API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-01-13T06:09:11.378Z")
public class KnowledgeApi  {
   private final KnowledgeApiService delegate;

   public KnowledgeApi(@Context ServletConfig servletContext) {
      KnowledgeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("KnowledgeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (KnowledgeApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = KnowledgeApiServiceFactory.getKnowledgeApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get Knowledge by KnowledgeId", notes = "get Knowledge by KnowledgeId", response = FWAllKnowledgeInfo.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FWAllKnowledgeInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Exception", response = FWKnowledgeBaseException.class) })
    public Response getKnowledgeById(@ApiParam(value = "KnowledgeId in the KnowledgeBase",required=true) @QueryParam("KnowledgeId") String knowledgeId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getKnowledgeById(knowledgeId,securityContext);
    }
    @GET
    @Path("/KnowledgeInfo")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get Knowledge information by KnowledgeId", notes = "get Knowledge information by KnowledgeId", response = FWKnowledgeInfo.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FWKnowledgeInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Exception", response = FWKnowledgeBaseException.class) })
    public Response getKnowledgeInfo(@ApiParam(value = "KnowledgeId in the KnowledgeBase",required=true) @QueryParam("KnowledgeId") String knowledgeId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getKnowledgeInfo(knowledgeId,securityContext);
    }
    @DELETE
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "delete a Knowledge from KnowledgeBase by KnowledgeId", notes = "delete a Knowledge from KnowledgeBase by KnowledgeId", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Exception", response = FWKnowledgeBaseException.class) })
    public Response remove(@ApiParam(value = "KnowledgeId in the KnowledgeBase",required=true) @QueryParam("KnowledgeId") String knowledgeId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.remove(knowledgeId,securityContext);
    }
    @PUT
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "put a Knowledge Knowledge to the KnowledgeBase", notes = "", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "KnowledgeId will be returned.", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Exception", response = FWKnowledgeBaseException.class) })
    public Response uploadKnowledge(@ApiParam(value = "KnowledgeName", required=true)@FormDataParam("KnowledgeName")  String knowledgeName
,@ApiParam(value = "expiredDate", required=true)@FormDataParam("expiredDate")  Integer expiredDate
,@ApiParam(value = "tag")@FormDataParam("tag")  String tag
,@ApiParam(value = "description of Knowledge Node")@FormDataParam("desc")  String desc
,
            @FormDataParam("in") InputStream inInputStream,
            @FormDataParam("in") FormDataContentDisposition inDetail
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadKnowledge(knowledgeName,expiredDate,tag,desc,inInputStream, inDetail,securityContext);
    }
}
