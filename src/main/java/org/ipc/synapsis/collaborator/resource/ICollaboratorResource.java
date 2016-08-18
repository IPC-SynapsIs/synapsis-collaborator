package org.ipc.synapsis.collaborator.resource;

import org.ipc.synapsis.collaborator.bean.in.CollaboratorIn;
import org.ipc.synapsis.collaborator.util.exception.ResourceNotFoundException;
import org.ipc.synapsis.collaborator.util.exception.http.HttpParseException;
import org.springframework.http.ResponseEntity;


/**
 * Created by mbasri on 19/06/2016.
 */
public interface ICollaboratorResource {
    ResponseEntity add(final CollaboratorIn collaboratorIn);
    ResponseEntity update(final String id,final CollaboratorIn collaboratorIn);
    ResponseEntity get(final String id) throws ResourceNotFoundException, HttpParseException;
    ResponseEntity getAll();
    ResponseEntity remove(final String id) throws HttpParseException;
}
