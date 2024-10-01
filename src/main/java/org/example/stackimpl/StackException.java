package org.example.stackimpl;

public class StackException extends RuntimeException {
    public StackException(String stackIsFull) {
        super(stackIsFull);
    }
}
