package org.ipc.synapsis.collaborator.util.constant;

import java.util.UUID;

/**
 * Created by mbasri on 07/08/2016.
 */
public class ParseExceptionConstant {

    public static String PARSE_ERROR_CODE = "6000";
    public static String PARSE_ERROR_VALUE = "Cannot parse the element";

    public static String PARSE_ERROR_STRING_UUID_CODE = "6001";
    public static String PARSE_ERROR_STRING_UUID_VALUE = "Cannot parse '"+String.class.toString()+"' to '"+ UUID.class.toString()+"'";

}