package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		
		set.add("가길동");
		set.add("방돌이");
		set.add("감자바");
		set.add("박길순");
		
		for(String item : set ) {
			System.out.println(item); // 원래 set은 순서가 없는데 사전순으로 나오는 이유는? TreeSet으로 만들면 저절로 정렬됨
		}
		System.out.println();
		
		NavigableSet<String> nset = set.descendingSet();
		for(String item : nset ) {
			System.out.println(item); // 원래 set은 순서가 없는데 사전순으로 나오는 이유는? TreeSet으로 만들면 저절로 정렬됨
		}
		System.out.println();
		
		NavigableSet<String> sset = set.subSet("방",false,"방돌이",true);
		for(String item : sset ) {
			System.out.println(item); // 원래 set은 순서가 없는데 사전순으로 나오는 이유는? TreeSet으로 만들면 저절로 정렬됨
		}
		
		
	}

}
