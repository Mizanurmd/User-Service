package microservice.test.exception;

public class ResourseNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException() {
		super("Resouse not found exception !!!");
	}

	public ResourseNotFoundException(String message) {
		super(message);
	}
	
}
