package com.all.famous.news.exception;

/**
 * The type Validation exception.
 */
public class ValidationException extends RuntimeException {

    /**
     * Instantiates a new Validation exception.
     */
    public ValidationException() {
    }

    /**
     * Instantiates a new Validation exception.
     *
     * @param message the message
     */
    public ValidationException(String message) {
        super(message);
    }
}
