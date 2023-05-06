package counter.flow.exceptions;

/**
 * This class represents a custom exception that is thrown if the input parameters are invalid.
 */
public class InvalidParametersException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Constructor for the InvalidParametersException class.
     * @param message The error message to display when the exception is thrown.
     */
    public InvalidParametersException(String message) {
        super(message);
    }
}