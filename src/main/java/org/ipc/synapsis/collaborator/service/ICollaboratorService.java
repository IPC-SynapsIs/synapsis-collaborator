package org.ipc.synapsis.collaborator.service;

import org.ipc.synapsis.collaborator.bean.out.CollaboratorOut;
import org.ipc.synapsis.collaborator.util.exception.ParseException;
import org.ipc.synapsis.collaborator.util.exception.ResourceNotFoundException;
import org.ipc.synapsis.collaborator.bean.in.CollaboratorIn;

import java.util.UUID;


/**
 * Created by mbasri on 19/06/2016.
 */
public interface ICollaboratorService {
    CollaboratorOut get(final String id) throws ResourceNotFoundException, ParseException;
    Iterable<CollaboratorOut> getAll();
    UUID add(final CollaboratorIn collaboratorIn);
    void update(final String id, final CollaboratorIn collaboratorIn);
    void remove(final String id) throws ParseException;
}
