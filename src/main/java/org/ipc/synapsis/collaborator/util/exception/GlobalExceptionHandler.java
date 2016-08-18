package org.ipc.synapsis.collaborator.util.exception;

import org.ipc.synapsis.collaborator.bean.exception.ParseError;
import org.ipc.synapsis.collaborator.bean.exception.ResourceNotFound;
import org.ipc.synapsis.collaborator.util.exception.http.HttpParseException;
import org.ipc.synapsis.collaborator.util.exception.http.HttpResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mbasri on 16/07/2016.
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = HttpResourceNotFoundException.class)
    public ResponseEntity handleHttpResourceNotFoundException(HttpResourceNotFoundException e){
        ResourceNotFound resourceNotFound = null;
        resourceNotFound = new ResourceNotFound(e.getCode(), e.getLabel(), e.getResourceID(), e.getResourceName());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resourceNotFound);
    }

    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler(value = HttpParseException.class)
    public ResponseEntity handleHttpParseExceptionException(HttpParseException e){
        ParseError parseError = null;
        parseError = new ParseError(e.getCode(), e.getLabel(), e.getSource(), e.getTarget());
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(parseError);
    }

}
