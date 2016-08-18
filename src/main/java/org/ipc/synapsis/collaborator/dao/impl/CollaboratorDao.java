package org.ipc.synapsis.collaborator.dao.impl;

import org.ipc.synapsis.collaborator.entity.Collaborator;
import org.ipc.synapsis.collaborator.repository.ICollaboratorRepository;
import org.ipc.synapsis.collaborator.dao.ICollaboratorDao;
import org.ipc.synapsis.collaborator.util.exception.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by mbasri on 09/07/2016.
 */
@Component
public class CollaboratorDao implements ICollaboratorDao {

    private static Logger LOGGER = LoggerFactory.getLogger(CollaboratorDao.class);

    @Autowired
    ICollaboratorRepository curriculumVitaeRepository;

    @Override
    public Collaborator get(final String id) throws ParseException {
        LOGGER.debug("Start call Dao layer get a 'Collaborator',id:{}",id);
        Collaborator collaborator = null;
        try {
            collaborator = curriculumVitaeRepository.findOne(UUID.fromString(id));
        }catch (IllegalArgumentException e){
            LOGGER.error("Dao layer Cannot parse String:{} to UUID",id);
            throw new ParseException(String.class.toString(),UUID.class.toString());
        }
        LOGGER.debug("End call Dao layer get a 'Collaborator',id:{}",id);
        return collaborator;
    }

    @Override
    public Iterable<Collaborator> getAll() {
        LOGGER.debug("Start call Dao layer get all 'Collaborator'");
        Iterable<Collaborator> curriculumVitaeList = curriculumVitaeRepository.findAll();
        LOGGER.debug("End call Dao layer get all 'Collaborator'");
        return curriculumVitaeList;
    }

    @Override
    public Collaborator add(final Collaborator collaborator) {
        LOGGER.debug("Start call Dao layer add new 'Collaborator',{}", collaborator);
        Collaborator collaborator1 = curriculumVitaeRepository.save(collaborator);
        LOGGER.debug("End call Dao layer add new 'Collaborator',{}", collaborator1);
        return collaborator1;
    }

    @Override
    public Collaborator update(Collaborator collaborator) {
        LOGGER.debug("End call Dao layer update 'Collaborator',{}", collaborator);
        Collaborator collaborator1 = curriculumVitaeRepository.save(collaborator);
        LOGGER.debug("End call Dao layer update 'Collaborator',{}", collaborator1);
        return collaborator1;
    }

    @Override
    public void remove(String id) throws ParseException {
        LOGGER.debug("Start call Dao layer remove 'Collaborator',id:{}",id);
        try {
        curriculumVitaeRepository.delete(UUID.fromString(id));
        }catch (IllegalArgumentException e){
            LOGGER.error("Dao layer Cannot parse String:{} to UUID",id);
            throw new ParseException(String.class.toString(),UUID.class.toString());
        }
        LOGGER.debug("End call Dao layer remove 'Collaborator',id:{}",id);
    }
}
