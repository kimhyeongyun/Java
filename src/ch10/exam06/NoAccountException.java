package ch10.exam06;

public class NoAccountException extends RuntimeException/*컴파일러가 체크하지 않음*/ {
	public NoAccountException() {}
	public NoAccountException(String message) {
		super(message);
	}
}
