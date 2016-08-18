package org.ipc.synapsis.collaborator.proxy.impl;

import org.ipc.synapsis.collaborator.entity.Collaborator;
import org.ipc.synapsis.collaborator.proxy.ICollaboratorProxy;
import org.ipc.synapsis.collaborator.dao.ICollaboratorDao;
import org.ipc.synapsis.collaborator.util.exception.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mbasri on 09/07/2016.
 */
@Component
public class CollaboratorProxy implements ICollaboratorProxy {

    private static Logger LOGGER = LoggerFactory.getLogger(CollaboratorProxy.class);

    @Autowired
    ICollaboratorDao curriculumVitaeDao;

    @Override
    public Collaborator get(String id) throws ParseException {
        LOGGER.debug("Start call Proxy layer get a 'Collaborator',id:{}",id);
        Collaborator collaborator = curriculumVitaeDao.get(id);
        LOGGER.debug("End call Proxy layer get a 'Collaborator',id:{}",id);
        return collaborator;
    }

    @Override
    public Iterable<Collaborator> getAll() {
        LOGGER.debug("Start call Proxy layer get all 'Collaborator'");
        Iterable<Collaborator> curriculumVitaeList = curriculumVitaeDao.getAll();
        LOGGER.debug("End call Proxy layer get all 'Collaborator'");
        return curriculumVitaeList;
    }

    @Override
    public Collaborator add(Collaborator collaborator) {
        LOGGER.debug("Start call Proxy layer add new 'Collaborator',{}", collaborator);
        Collaborator collaborator1 = curriculumVitaeDao.add(collaborator);
        LOGGER.debug("End call Proxy layer add new 'Collaborator',{}", collaborator1);
        return collaborator1;
    }

    @Override
    public Collaborator update(Collaborator collaborator) {
        LOGGER.debug("End call Proxy layer update 'Collaborator',{}", collaborator);
        Collaborator collaborator1 = curriculumVitaeDao.update(collaborator);
        LOGGER.debug("End call Proxy layer update 'Collaborator',{}", collaborator1);
        return collaborator1;
    }

    @Override
    public void remove(String id) throws ParseException {
        LOGGER.debug("Start call Proxy layer remove 'Collaborator',id:{}",id);
        curriculumVitaeDao.remove(id);
        LOGGER.debug("End call Proxy layer remove 'Collaborator',id:{}",id);
    }
}
