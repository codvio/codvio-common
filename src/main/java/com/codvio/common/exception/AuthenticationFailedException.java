
package com.codvio.common.exception;

public class AuthenticationFailedException extends RuntimeException {



    //~ --- [CONSTRUCTORS] ---------------------------------------------------------------------------------------------

    public AuthenticationFailedException(final String message) {

        super(message);
    }
}
