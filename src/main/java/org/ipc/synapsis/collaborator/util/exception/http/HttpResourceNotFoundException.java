package org.ipc.synapsis.collaborator.util.exception.http;

import org.ipc.synapsis.collaborator.util.exception.ResourceNotFoundException;

/**
 * Created by mbasri on 15/07/2016.
 */
public class HttpResourceNotFoundException extends ResourceNotFoundException {

    private String code;
    private String label;


    public HttpResourceNotFoundException() {
        super();
    }

    public HttpResourceNotFoundException(String resourceID, String resourceName) {
        super(resourceID, resourceName);
    }

    public HttpResourceNotFoundException(String resourceID, String resourceName, String code, String label) {
        super(resourceID, resourceName);
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
