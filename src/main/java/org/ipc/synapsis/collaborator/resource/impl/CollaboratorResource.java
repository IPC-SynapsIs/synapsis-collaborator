package org.ipc.synapsis.collaborator.resource.impl;

import io.swagger.annotations.*;
import org.ipc.synapsis.collaborator.bean.exception.ResourceNotFound;
import org.ipc.synapsis.collaborator.bean.in.CollaboratorIn;
import org.ipc.synapsis.collaborator.bean.out.CollaboratorOut;
import org.ipc.synapsis.collaborator.resource.ICollaboratorResource;
import org.ipc.synapsis.collaborator.util.constant.ParseExceptionConstant;
import org.ipc.synapsis.collaborator.util.constant.ResourceExceptionConstant;
import org.ipc.synapsis.collaborator.util.exception.ParseException;
import org.ipc.synapsis.collaborator.util.exception.ResourceNotFoundException;
import org.ipc.synapsis.collaborator.util.exception.http.HttpParseException;
import org.ipc.synapsis.collaborator.util.exception.http.HttpResourceNotFoundException;
import org.ipc.synapsis.collaborator.service.ICollaboratorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.UUID;

/**
 * Created by mbasri on 19/06/2016.
 */
@RestController
@RequestMapping(value = "/api/col")
@Api(value = "Collaborator", description = "'Collaborator' resource base endpoint")
public class CollaboratorResource implements ICollaboratorResource {

    private static Logger LOGGER = LoggerFactory.getLogger(CollaboratorResource.class);

    @Autowired
    ICollaboratorService curriculumVitaeService;

    @Override
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiOperation(value = "Add a new 'Collaborator'")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "New 'Collaborator' successfully created", response = URI.class)
    })
    public ResponseEntity add(@ApiParam(value = "The 'Collaborator' to add", required = true)@RequestBody final CollaboratorIn collaboratorIn) {
        LOGGER.debug("Start call of the web service add new 'Collaborator',{}", collaboratorIn);
        UUID id = curriculumVitaeService.add(collaboratorIn);
        LOGGER.debug("End call of the web service add new 'Collaborator',{}", collaboratorIn);
        return ResponseEntity.created(URI.create("/api/cv/"+id)).build();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiOperation(value = "Updates an existing 'Collaborator'")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Existing 'Collaborator' successfully updated", response = void.class)
    })
    public ResponseEntity update(@ApiParam(value = "Id of the 'Collaborator' to update", required = true) @PathVariable("id") final String id,
                                 @ApiParam(value = "The 'Collaborator' to update", required = true) @RequestBody final CollaboratorIn collaboratorIn) {
        LOGGER.debug("Start call of the web service update 'Collaborator',{}", collaboratorIn);
        curriculumVitaeService.update(id, collaboratorIn);
        LOGGER.debug("End call of the web service update 'Collaborator',{}", collaboratorIn);
        return ResponseEntity.ok().build();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiOperation(value = "Search a 'Collaborator' by its id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The 'Collaborator' was found and is in the response", response = CollaboratorOut.class),
            @ApiResponse(code = 404, message = "The 'Collaborator' cannot be found", response = ResourceNotFound.class)
    })
    public ResponseEntity get(@ApiParam(value = "The given 'Collaborator' id", required = true) @PathVariable("id") final String id) throws ResourceNotFoundException, HttpParseException {
        LOGGER.debug("Start call of the web service get 'Collaborator' by id, id={}",id);
        CollaboratorOut CollaboratorOut = null;
        try {
            CollaboratorOut = curriculumVitaeService.get(id);
        } catch (ResourceNotFoundException e) {
            LOGGER.warn("Resource 'Collaborator' OUT not found, id:{}",id);
            throw  new HttpResourceNotFoundException(e.getResourceID(), e.getResourceName(),
                    ResourceExceptionConstant.CURRICULUM_VITAE_NOT_FOUND_CODE, ResourceExceptionConstant.CURRICULUM_VITAE_NOT_FOUND_VALUE);
        } catch (ParseException e) {
            LOGGER.error("Resource layer Cannot parse Sting to UUID");
            throw new HttpParseException(e.getSource(),e.getTarget(),
                    ParseExceptionConstant.PARSE_ERROR_STRING_UUID_CODE,ParseExceptionConstant.PARSE_ERROR_STRING_UUID_VALUE);
        }
        LOGGER.debug("End call of  the web service get 'Collaborator' by id, id={}",id);
        return ResponseEntity.ok(CollaboratorOut);
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiOperation(value = "Returns all existing 'Collaborator'")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "All existing 'Collaborator' are returned in a potentially empty list", response = Iterable.class)
    })
    public ResponseEntity getAll() {
        LOGGER.debug("Start call of the web service get all 'Collaborator'");
        Iterable<CollaboratorOut> curriculumVitaeOutList = curriculumVitaeService.getAll();
        LOGGER.debug("End call of the web service get all 'Collaborator'");
        return ResponseEntity.ok(curriculumVitaeOutList);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Deletes an existing 'Collaborator'")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Existing 'Collaborator' successfully deleted", response = void.class)
    })
    public ResponseEntity remove(@PathVariable("id") final String id) throws HttpParseException {
        LOGGER.debug("Start call of the web service delete 'Collaborator' by id,id={}",id);
        try {
            curriculumVitaeService.remove(id);
        }catch (ParseException e) {
            LOGGER.error("Resource layer Cannot parse Sting to UUID");
            throw new HttpParseException(e.getSource(),e.getTarget(),
                    ParseExceptionConstant.PARSE_ERROR_STRING_UUID_CODE,ParseExceptionConstant.PARSE_ERROR_STRING_UUID_VALUE);
        }
        LOGGER.debug("End call of the web service delete 'Collaborator' by id,id={}",id);
        return ResponseEntity.ok().build();
    }

}
