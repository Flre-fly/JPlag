package de.jplag.exceptions;

/**
 * Exceptions for problems with the regular submissions that lead to an preemptive exit.
 */
public class SubmissionException extends ExitException {

    private static final long serialVersionUID = 794916053362767596L; // generated

    public SubmissionException(String message) {
        super(message);
    }

}
