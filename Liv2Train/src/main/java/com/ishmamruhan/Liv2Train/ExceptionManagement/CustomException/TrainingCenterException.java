package com.ishmamruhan.Liv2Train.ExceptionManagement.CustomException;

/**
 *  This is our custom exception class to handle "Internal Server Error"
 *
 */

public class TrainingCenterException extends Exception{

    public TrainingCenterException(String message) {
        super(message);
    }
}
