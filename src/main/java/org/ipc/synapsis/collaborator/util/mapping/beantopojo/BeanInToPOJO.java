package org.ipc.synapsis.collaborator.util.mapping.beantopojo;

import org.ipc.synapsis.collaborator.bean.in.CollaboratorIn;
import org.ipc.synapsis.collaborator.entity.Collaborator;

/**
 * Created by mbasri on 03/07/2016.
 */
public class BeanInToPOJO {

    public static Collaborator getCollaborator(CollaboratorIn collaboratorIn){
        Collaborator collaborator = new Collaborator();
        collaborator.setBirthDate(collaboratorIn.getBirthDate());
        collaborator.setEmail(collaboratorIn.getEmail());
        collaborator.setDateOfEntry(collaboratorIn.getDateOfEntry());
        collaborator.setLastName(collaboratorIn.getLastName());
        collaborator.setFirstName(collaboratorIn.getFirstName());
        collaborator.setPhone(collaboratorIn.getPhone());
        collaborator.setRefCollaborator(collaboratorIn.getRefCollaborator());
        collaborator.setStatus(collaboratorIn.getStatus());
        return collaborator;
    }
}
