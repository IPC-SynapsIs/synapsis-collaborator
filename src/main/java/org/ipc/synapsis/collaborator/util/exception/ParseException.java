package org.ipc.synapsis.collaborator.util.exception;

/**
 * Created by mbasri on 07/08/2016.
 */
public class ParseException extends Exception {
    private String source;
    private String target;

    public ParseException() {
    }

    public ParseException(String source, String target) {
        this.source = source;
        this.target = target;
    }

    public ParseException(String message, String source, String target) {
        super(message);
        this.source = source;
        this.target = target;
    }

    public ParseException(String message, Throwable cause, String source, String target) {
        super(message, cause);
        this.source = source;
        this.target = target;
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
}
