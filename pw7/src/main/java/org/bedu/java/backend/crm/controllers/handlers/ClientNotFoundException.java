package org.bedu.java.backend.crm.controllers.handlers;

/**
 * @author Francisco Javier Camas Tec  francisco_Camas@hotmail.com
 */

public class ClientNotFoundException extends RuntimeException{

    public ClientNotFoundException(String msg) {
        super(msg);
    }

}

