package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.HelloApiService;
import io.swagger.api.factories.HelloApiServiceFactory;

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

@Path("/hello")


@io.swagger.annotations.Api(description = "the hello API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-12-17T02:58:24.328Z")
public class HelloApi  {
   private final HelloApiService delegate;

   public HelloApi(@Context ServletConfig servletContext) {
      HelloApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("HelloApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (HelloApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = HelloApiServiceFactory.getHelloApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "returns a greeting", response = String.class) })
    public Response getGreeting(@ApiParam(value = "defaults to World if not given") @QueryParam("name") String name
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getGreeting(name,securityContext);
    }
}
