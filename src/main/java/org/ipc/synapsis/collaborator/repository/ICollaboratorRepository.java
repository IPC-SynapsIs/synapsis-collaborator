package org.ipc.synapsis.collaborator.repository;

import org.springframework.data.repository.CrudRepository;
import org.ipc.synapsis.collaborator.entity.Collaborator;

import java.util.UUID;

/**
 * Created by mbasri on 19/06/2016.
 */
public interface ICollaboratorRepository extends CrudRepository<Collaborator, UUID> {
}
