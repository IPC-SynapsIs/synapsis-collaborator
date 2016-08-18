package org.ipc.synapsis.collaborator.service.impl;

import org.ipc.synapsis.collaborator.bean.in.CollaboratorIn;
import org.ipc.synapsis.collaborator.bean.out.CollaboratorOut;
import org.ipc.synapsis.collaborator.entity.Collaborator;
import org.ipc.synapsis.collaborator.proxy.ICollaboratorProxy;
import org.ipc.synapsis.collaborator.util.exception.ParseException;
import org.ipc.synapsis.collaborator.util.exception.ResourceNotFoundException;
import org.ipc.synapsis.collaborator.util.mapping.beantopojo.BeanInToPOJO;
import org.ipc.synapsis.collaborator.util.mapping.pojotobean.POJOToBeanOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.ipc.synapsis.collaborator.service.ICollaboratorService;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by mbasri on 19/06/2016.
 */
@Component
public class CollaboratorService implements ICollaboratorService {

    private static Logger LOGGER = LoggerFactory.getLogger(CollaboratorService.class);

    @Autowired
    ICollaboratorProxy curriculumVitaeProxy;

    @Override
    public CollaboratorOut get(final String id) throws ResourceNotFoundException, ParseException {
        LOGGER.debug("Start call Service layer get a 'Collaborator OUT',id:{}",id);
        CollaboratorOut CollaboratorOut = null;
        Collaborator collaborator = curriculumVitaeProxy.get(id);
        if (collaborator == null){
            LOGGER.warn("Resource 'Collaborator' not found, id:{}",id);
            throw new ResourceNotFoundException(id,"Collaborator");
        }
        CollaboratorOut = POJOToBeanOut.getCollaboratorOut(collaborator);
        LOGGER.debug("End call Service layer get a 'Collaborator OUT',{}", CollaboratorOut);
        return CollaboratorOut;
    }

    @Override
    public Iterable<CollaboratorOut> getAll() {
        LOGGER.debug("Start call Service layer get all 'Collaborator OUT'");
        ArrayList<Collaborator> curriculumVitaesOutList = new ArrayList<>();
        Iterable<Collaborator> curriculumVitaeList = curriculumVitaeProxy.getAll();
        for (Collaborator collaborator : curriculumVitaeList){
            CollaboratorOut CollaboratorOut = POJOToBeanOut.getCollaboratorOut(collaborator);
            curriculumVitaesOutList.add(collaborator);
        }
        LOGGER.debug("End call Service layer get all 'Collaborator OUT'");
        return (Iterable) curriculumVitaesOutList;
    }

    @Override
    public UUID add(final CollaboratorIn collaboratorIn) {
        LOGGER.debug("Start call Service layer add new 'Collaborator IN',{}", collaboratorIn);
        UUID id= UUID.randomUUID();
        Collaborator collaborator = BeanInToPOJO.getCollaborator(collaboratorIn);
        collaborator.setId(id);
        curriculumVitaeProxy.add(collaborator);
        LOGGER.debug("End call Service layer add new 'Collaborator',{}", collaborator);
        return id;
    }

    @Override
    public void update(final String id,final CollaboratorIn collaboratorIn) {
        LOGGER.debug("End call Service layer update 'Collaborator IN',{}", collaboratorIn);
        Collaborator collaborator = BeanInToPOJO.getCollaborator(collaboratorIn);
        collaborator.setId(UUID.fromString(id));
        curriculumVitaeProxy.update(collaborator);
        LOGGER.debug("End call Service layer update 'Collaborator',{}", collaborator);
    }

    @Override
    public void remove(final String id) throws ParseException {
        LOGGER.debug("Start call Service layer remove 'Collaborator',id:{}",id);
        curriculumVitaeProxy.remove(id);
        LOGGER.debug("Start call Service layer remove 'Collaborator',id:{}",id);
    }
}
