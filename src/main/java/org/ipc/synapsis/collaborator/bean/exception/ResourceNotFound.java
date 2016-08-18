package org.ipc.synapsis.collaborator.bean.exception;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by mbasri on 16/07/2016.
 */

@ApiModel(value = "'Resource Not Found'", description = "The 'Resource Not Found' model")
public class ResourceNotFound {

    @ApiModelProperty(value = "'Resource Not Found' code property", dataType = "java.lang.String")
    private String code;

    @ApiModelProperty(value = "'Resource Not Found' label property", dataType = "java.lang.String")
    private String label;

    @ApiModelProperty(value = "'Resource Not Found' ID property", dataType = "java.lang.String")
    private String resourceID;

    @ApiModelProperty(value = "'Resource Not Found' name property", dataType = "java.lang.String")
    private String resourceName;


    public ResourceNotFound() {
    }

    public ResourceNotFound(String code, String label, String resourceID, String resourceName) {
        this.code = code;
        this.label = label;
        this.resourceID = resourceID;
        this.resourceName = resourceName;
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

    @Override
    public String toString() {
        return "ResourceNotFound{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", resourceID='" + resourceID + '\'' +
                ", resourceName='" + resourceName + '\'' +
                '}';
    }
}