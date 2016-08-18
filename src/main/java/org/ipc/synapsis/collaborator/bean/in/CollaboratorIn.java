package org.ipc.synapsis.collaborator.bean.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

/**
 * Created by mbasri on 02/07/2016.
 */
@ApiModel(value = "'Curriculum Vitae'", description = "The 'Curriculum Vitae' IN model")
public class CollaboratorIn {

    @NotNull
    @ApiModelProperty(value = "'Collaborator' IN refCollaborator property", dataType = "java.lang.String")
    private String refCollaborator;


    @ApiModelProperty(value = "'Collaborator' IN status property", dataType = "java.lang.String")
    private String status;


    @ApiModelProperty(value = "'Collaborator' IN lastName property", dataType = "java.lang.String")
    private String lastName;


    @ApiModelProperty(value = "'Collaborator' IN firstName property", dataType = "java.lang.String")
    private String firstName;


    @ApiModelProperty(value = "'Collaborator' IN birthDate property", dataType = "java.lang.Date")
    private Date birthDate;


    @ApiModelProperty(value = "'Collaborator' IN email property", dataType = "java.lang.String")
    private String email;


    @ApiModelProperty(value = "'Collaborator' IN phone property", dataType = "java.lang.String")
    private String phone;


    @ApiModelProperty(value = "'Collaborator' IN dateOfEntry property", dataType = "java.lang.Date")
    private Date dateOfEntry;

    public CollaboratorIn() {
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
        return "CollaboratorIn{" +
                "refCollaborator='" + refCollaborator + '\'' +
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