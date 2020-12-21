package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.FWFile;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-12-21T05:28:40.081Z")
public class FileApiServiceImpl extends FileApiService {
    @Override
    public Response getFileById(String fileId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        System.out.println(">>>FileApiServiceImpl#getFileById fileId=" + fileId);

        if ("1".equals(fileId)) {
            FWFile file = new FWFile();
            file.setId("20201220001");
            file.setName("file_sample");
            file.setStatus(FWFile.StatusEnum.AVAILABLE);
            
            System.out.println(">>>FileApiServiceImpl#getFileById simulate file is generated.");

            return Response.ok().entity(file).build();
        } else if ("2".equals(fileId)) {
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.WARNING, "file is not found.")).build();
        } else {
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "some error is raised.")).build();
        }
    }
}
