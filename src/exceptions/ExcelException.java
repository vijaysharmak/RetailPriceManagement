package exceptions;

@SuppressWarnings("serial")
public class ExcelException extends RuntimeException {
	public ExcelException(String msg) {
		System.out.println(msg);
	}
}
