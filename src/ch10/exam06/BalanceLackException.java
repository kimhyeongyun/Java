package ch10.exam06;

public class BalanceLackException extends Exception/*컴파일러가 체크*/{
	public BalanceLackException() {}
	public BalanceLackException(String message) {
		super(message);
	}
}
