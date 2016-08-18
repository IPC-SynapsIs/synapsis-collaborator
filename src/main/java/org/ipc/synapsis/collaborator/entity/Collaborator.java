package org.ipc.synapsis.collaborator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

/**
 * Created by mbasri on 19/06/2016.
 */
@Entity
public class Collaborator {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column
    private String refCollaborator;

    @Column
    private String status;

    @Column
    private String lastName;

    @Column
    private String firstName;

    @Column
    private Date birthDate;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private Date dateOfEntry;



    public Collaborator() {
    }

    public Collaborator(String refCollaborator, String status, String lastName, String firstName, Date birthDate, String email, String phone, Date dateOfEntry) {
        this.refCollaborator = refCollaborator;
        this.status = status;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.dateOfEntry = dateOfEntry;
    }

    public Collaborator(UUID id, String refCollaborator, String status, String lastName, String firstName, Date birthDate, String email, String phone, Date dateOfEntry) {
        this.id = id;
        this.refCollaborator = refCollaborator;
        this.status = status;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.dateOfEntry = dateOfEntry;
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
}
