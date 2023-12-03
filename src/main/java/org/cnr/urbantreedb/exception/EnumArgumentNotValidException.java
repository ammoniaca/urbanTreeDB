package org.cnr.urbantreedb.exception;

import java.io.Serial;

public class EnumArgumentNotValidException extends RuntimeException{


    @Serial
    private static final long serialVersionUID = 1L;

    private String field;


    public EnumArgumentNotValidException() {
        super();

    }

    public EnumArgumentNotValidException(String message, Throwable cause) {

        super(message, cause);

    }

    public EnumArgumentNotValidException(String message) {

        super(message);
    }

    public EnumArgumentNotValidException(Throwable cause) {

        super(cause);
    }


    public EnumArgumentNotValidException(String message, Throwable cause, String field) {

        super(message, cause);
        this.field = field;

    }

    public EnumArgumentNotValidException(String message, String field) {

        super(message);
        this.field = field;
    }

    public EnumArgumentNotValidException(Throwable cause, String field) {

        super(cause);
        this.field = field;
    }

    public String getField(){
        return this.field;
    }


}
