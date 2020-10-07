package com.carrier.scc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClientIntrouvableException extends RuntimeException {
    public ClientIntrouvableException(String s) {
        super(s);
    }
}
