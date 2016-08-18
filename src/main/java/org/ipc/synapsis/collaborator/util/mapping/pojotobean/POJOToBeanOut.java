package org.ipc.synapsis.collaborator.util.mapping.pojotobean;

import org.ipc.synapsis.collaborator.bean.out.CollaboratorOut;
import org.ipc.synapsis.collaborator.entity.Collaborator;

/**
 * Created by mbasri on 03/07/2016.
 */
public class POJOToBeanOut {

    public static CollaboratorOut getCollaboratorOut(Collaborator collaborator){
        CollaboratorOut collaboratorOut = new CollaboratorOut();
        collaboratorOut.setRefCollaborator(collaborator.getRefCollaborator());
        collaboratorOut.setStatus(collaborator.getStatus());
        collaboratorOut.setPhone(collaborator.getPhone());
        collaboratorOut.setLastName(collaborator.getLastName());
        collaboratorOut.setBirthDate(collaborator.getBirthDate());
        collaboratorOut.setDateOfEntry(collaborator.getDateOfEntry());
        collaboratorOut.setEmail(collaborator.getEmail());
        collaboratorOut.setId(collaborator.getId());
        collaboratorOut.setFirstName(collaborator.getFirstName());
        return collaboratorOut;
    }

}
