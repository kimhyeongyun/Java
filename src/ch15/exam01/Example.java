package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		// 객체 저장
		list.add("홍길동");
		list.add(3); // 이건 값이지만 저장이 될 때는 auto boxing이 되어서 객체로 저장됨.
		list.add(new Board()); // 이것도 가능.
		System.out.println(list.size());
		
		// 객체 얻기
		String name = (String) list.get(0); // type mismatch가 나므로 강제 타입변환을 실시한다.
		int/*오토 언박싱*/ value = (Integer) list.get(1);
		Board board = (Board) list.get(2); // 이렇게 잘 쓰지는 않음.
		
		
		// 객체 제거
		list.remove(0);
		list.remove(0); // 자동으로 앞으로 땡겨짐
		System.out.println(list.size());
	}

}
