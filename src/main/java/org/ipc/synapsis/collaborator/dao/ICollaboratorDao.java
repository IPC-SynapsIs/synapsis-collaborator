package org.ipc.synapsis.collaborator.dao;

import org.ipc.synapsis.collaborator.entity.Collaborator;
import org.ipc.synapsis.collaborator.util.exception.ParseException;

/**
 * Created by mbasri on 19/06/2016.
 */
public interface ICollaboratorDao {
    Collaborator get(final String id) throws ParseException;
    Iterable<Collaborator> getAll();
    Collaborator add(final Collaborator collaborator);
    Collaborator update(final Collaborator collaborator);
    void remove(final String id) throws ParseException;
}
