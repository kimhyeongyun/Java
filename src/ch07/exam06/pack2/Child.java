package ch07.exam06.pack2;

import ch07.exam06.pack1.Parent;

public class Child extends Parent {
	//필드
	
	public void method() {
		field1 = 10; // 자식안에서는 다 사용이 가능함.
	}
	// 상속만 하면 다른 패키지여도 쓸 수 있음.
	
	
	
}
