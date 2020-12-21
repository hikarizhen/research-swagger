package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FileApiService;
import io.swagger.api.factories.FileApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.FWFile;

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

@Path("/file")


@io.swagger.annotations.Api(description = "the file API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-12-21T05:28:40.081Z")
public class FileApi  {
   private final FileApiService delegate;

   public FileApi(@Context ServletConfig servletContext) {
      FileApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FileApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FileApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = FileApiServiceFactory.getFileApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{fileId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find file by ID", notes = "Returns a file information", response = FWFile.class, tags={ "file", })
    @io.swagger.annotations.ApiResponses(value = { 
    @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FWFile.class),
    @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
    @io.swagger.annotations.ApiResponse(code = 404, message = "File not found", response = Void.class) })
    public Response getFileById(@ApiParam(value = "ID of file to return",required=true) @PathParam("fileId") String fileId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        System.out.println(">>>FileApi#getFileById fileId=" + fileId);
        return delegate.getFileById(fileId,securityContext);
    }
}
