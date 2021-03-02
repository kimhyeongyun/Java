package ch15.exam07;

public class Person implements Comparable { // Áß¿ä!
	public String name;
	public int age;
	
	@Override
	public int compareTo(Object o) {
		Person temp = (Person) o;
		if(age < temp.age) {
			return -1;
		} else if(age == temp.age) {
			return 0;
		} else {
			return 1;			
		}
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
