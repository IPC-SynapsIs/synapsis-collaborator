package org.ipc.synapsis.collaborator.bean.exception;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by mbasri on 16/07/2016.
 */

@ApiModel(value = "'Parse error'", description = "The 'Parse error' model")
public class ParseError {

    @ApiModelProperty(value = "'Parse error' code property", dataType = "java.lang.String")
    private String code;

    @ApiModelProperty(value = "'Parse error' label property", dataType = "java.lang.String")
    private String label;

    @ApiModelProperty(value = "'Parse error' source property", dataType = "java.lang.String")
    private String source;

    @ApiModelProperty(value = "'Parse error' target property", dataType = "java.lang.String")
    private String target;


    public ParseError() {
    }

    public ParseError(String code, String label, String source, String target) {
        this.code = code;
        this.label = label;
        this.source = source;
        this.target = target;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "ResourceNotFound{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", source='" + source + '\'' +
                ", target='" + target + '\'' +
                '}';
    }
}