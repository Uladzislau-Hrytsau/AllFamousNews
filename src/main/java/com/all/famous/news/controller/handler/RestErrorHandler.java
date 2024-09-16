package com.all.famous.news.controller.handler;

import com.all.famous.news.controller.response.ErrorResponse;
import com.all.famous.news.exception.InternalServerException;
import com.all.famous.news.exception.ValidationException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Collections;

/**
 * The type Rest error handler.
 */
@ControllerAdvice
@ResponseBody
public class RestErrorHandler {

    /**
     * Handle validation exception error response.
     *
     * @param exc the exc
     * @return the error response
     */
    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidationException(ValidationException exc) {
        return new ErrorResponse().builder()
                .messages(Collections.singletonList(exc.getMessage()))
                .build();
    }

    /**
     * Handle internal server exception error response.
     *
     * @param exc the exc
     * @return the error response
     */
    @ExceptionHandler(InternalServerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleInternalServerException(InternalServerException exc) {
        return new ErrorResponse().builder()
                .messages(Collections.singletonList(exc.getMessage()))
                .build();
    }

    /**
     * Handle data access exception error response.
     *
     * @param exc the exc
     * @return the error response
     */
    @ExceptionHandler(DataAccessException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleDataAccessException(DataAccessException exc) {



        return new ErrorResponse().builder()
                .messages(Collections.singletonList(exc.getMessage()))
                .build();
    }

    /**
     * Handle data access exception error response.
     *
     * @param exc the exc
     * @return the error response
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleDataAccessException(Exception exc) {
        return new ErrorResponse().builder()
                .messages(Collections.singletonList(exc.getMessage()))
                .build();
    }

}
