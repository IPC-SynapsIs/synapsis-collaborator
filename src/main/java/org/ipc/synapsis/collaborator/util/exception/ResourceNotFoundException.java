package org.ipc.synapsis.collaborator.util.exception;

import java.util.UUID;

/**
 * Created by mbasri on 15/07/2016.
 */
public class ResourceNotFoundException extends Exception {

    private String resourceID;
    private String resourceName;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String resourceID,String resourceName) {
        this.resourceID = resourceID;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String message,String resourceID,String resourceName) {
        super(message);
        this.resourceID = resourceID;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String resourceID,String resourceName, Throwable cause) {
        super(cause);
        this.resourceID = resourceID;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String message,String resourceID,String resourceName, Throwable cause) {
        super(message, cause);
        this.resourceID = resourceID;
        this.resourceName = resourceName;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}