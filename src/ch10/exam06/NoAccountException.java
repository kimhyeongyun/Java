package ch10.exam06;

public class NoAccountException extends RuntimeException/*�����Ϸ��� üũ���� ����*/ {
	public NoAccountException() {}
	public NoAccountException(String message) {
		super(message);
	}
}
