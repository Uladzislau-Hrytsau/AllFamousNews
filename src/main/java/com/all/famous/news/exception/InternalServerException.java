package com.all.famous.news.exception;

/**
 * The type Internal server exception.
 */
public class InternalServerException extends RuntimeException {

    /**
     * Instantiates a new Internal server exception.
     */
    public InternalServerException() {
    }

    /**
     * Instantiates a new Internal server exception.
     *
     * @param message the message
     */
    public InternalServerException(String message) {
        super(message);
    }
}
