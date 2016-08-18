package org.ipc.synapsis.collaborator.bean.out;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

/**
 * Created by mbasri on 02/07/2016.
 */

@ApiModel(value = "'Collaborator'", description = "The 'Collaborator' OUT model")
public class CollaboratorOut {

    @ApiModelProperty(value = "'Collaborator' OUT id property", dataType = "java.util.UUID")
    private UUID id;

    @NotNull
    @ApiModelProperty(value = "'Collaborator' OUT refCollaborator property", dataType = "java.lang.String")
    private String refCollaborator;


    @ApiModelProperty(value = "'Collaborator' OUT status property", dataType = "java.lang.String")
    private String status;


    @ApiModelProperty(value = "'Collaborator' OUT lastName property", dataType = "java.lang.String")
    private String lastName;


    @ApiModelProperty(value = "'Collaborator' OUT firstName property", dataType = "java.lang.String")
    private String firstName;


    @ApiModelProperty(value = "'Collaborator' OUT birthDate property", dataType = "java.lang.Date")
    private Date birthDate;


    @ApiModelProperty(value = "'Collaborator' OUT email property", dataType = "java.lang.String")
    private String email;


    @ApiModelProperty(value = "'Collaborator' OUT phone property", dataType = "java.lang.String")
    private String phone;


    @ApiModelProperty(value = "'Collaborator' OUT dateOfEntry property", dataType = "java.lang.Date")
    private Date dateOfEntry;


    public CollaboratorOut() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRefCollaborator() {
        return refCollaborator;
    }

    public void setRefCollaborator(String refCollaborator) {
        this.refCollaborator = refCollaborator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    @Override
    public String toString() {
        return "CollaboratorOut{" +
                "id=" + id +
                ", refCollaborator='" + refCollaborator + '\'' +
                ", status='" + status + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfEntry=" + dateOfEntry +
                '}';
    }
}