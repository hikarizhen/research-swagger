package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.VersionApiService;
import io.swagger.api.factories.VersionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


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

@Path("/version")


@io.swagger.annotations.Api(description = "the version API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-01-13T06:09:11.378Z")
public class VersionApi  {
   private final VersionApiService delegate;

   public VersionApi(@Context ServletConfig servletContext) {
      VersionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("VersionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (VersionApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = VersionApiServiceFactory.getVersionApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "returns KnowledgeBase version", response = String.class) })
    public Response version(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.version(securityContext);
    }
}
