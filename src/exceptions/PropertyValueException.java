package exceptions;

@SuppressWarnings("serial")
public class PropertyValueException extends RuntimeException {
	public PropertyValueException(String msg) {
		System.out.println(msg);
	}
}
