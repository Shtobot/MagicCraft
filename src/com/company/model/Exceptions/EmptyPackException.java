package com.company.model.Exceptions;

/**
 * Created by hugo_obrien on 09.01.2016.
 */
public class EmptyPackException extends Exception {

    public EmptyPackException() {
        super();
    }

    public EmptyPackException(String s) {
        super(s);
    }
}
