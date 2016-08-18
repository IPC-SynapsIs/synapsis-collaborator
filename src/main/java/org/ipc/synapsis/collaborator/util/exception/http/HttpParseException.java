package org.ipc.synapsis.collaborator.util.exception.http;

import org.ipc.synapsis.collaborator.util.exception.ParseException;

/**
 * Created by mbasri on 07/08/2016.
 */
public class HttpParseException extends ParseException {

    private String code;
    private String label;

    public HttpParseException() {
        super();
    }

    public HttpParseException(String source, String target, String code, String label) {
        super(source, target);
        this.code = code;
        this.label = label;
    }

    public HttpParseException(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public HttpParseException(String message, Throwable cause, String source, String target, String code, String label) {
        super(message, cause, source, target);
        this.code = code;
        this.label = label;
    }

    public HttpParseException(String message, String source, String target, String code, String label) {
        super(message, source, target);
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
