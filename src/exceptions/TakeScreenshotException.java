package exceptions;

@SuppressWarnings("serial")
public class TakeScreenshotException extends RuntimeException {
	public TakeScreenshotException(String msg) {
		System.out.println(msg);
	}
}
