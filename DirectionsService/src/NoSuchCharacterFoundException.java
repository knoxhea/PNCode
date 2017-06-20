/**
 * Custom runtime Expression for no such character 
 * @author Heather Knox
 */
//TODO FIX 6
public class NoSuchCharacterFoundException extends RuntimeException {

	/**
	 * {@link package.class#member label}
	 */
	public NoSuchCharacterFoundException(){
		super();
	}
	
	/**
	 * {@link package.class#member label}
	 */
	public NoSuchCharacterFoundException(String message){
		super(message);
	}
	
	/**
	 * {@link package.class#member label}
	 */
	public NoSuchCharacterFoundException(String message, Throwable cause){
		super(message, cause);
	}
	
	/**
	 * {@link package.class#member label}
	 */
	public NoSuchCharacterFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	/**
	 * {@link package.class#member label}
	 */
	public NoSuchCharacterFoundException(Throwable cause){
		super(cause);
	}
	
}
