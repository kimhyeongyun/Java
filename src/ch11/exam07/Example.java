package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 10;
		
		Integer var2 = new Integer(10); // var2 : 참조변수
		Integer var3 = 10; // 왜 되는거지...? 이 중간에 머가 있냐면 10을 integer의 객체로 만들어서 집어넣는 걸 뺀 겁니다.
		// Auto-Boxing
		
		double var4 = 3.5;
		Double var5 = new Double(3.5); // 위와는 엄연히 다른 것. 
		Double var6 = 3.5; // 값이 어떻게 참조변수에...? 오토박싱
		
		Integer var7 = new Integer(10);
		int var8 = var7.intValue();
		int var9 = var7; // Auto UnBoxing
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue();
		double var12 = var10; // 번지가 어떻게 들어갈 수 있습니까. Wrapper 포장 클래스 8개만 그럼.
		
		Object[] arr = new Object[5]; // Object는 자식객체 어떤 것이든 들어갈 수 있음.
		arr[0] = "abc"; // 성립한다.
		arr[1] = 10; // 10은 객체가 아니고 겂인데 왜 되는겅미..? 예전에는 안되었엉 자바5 전까지는 / 그냥 들어가는 건 아니고 
		// new Integer(10)이런 식으로 만들어져서 이 번지가 들어가는 것. Auto Boxing
		arr[2] = true; // true도 객체가 아닌데 된겅미. Auto Boxing 
		
		
	}

}
