package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		// ��ü ����
		list.add("ȫ�浿");
		list.add(3); // �̰� �������� ������ �� ���� auto boxing�� �Ǿ ��ü�� �����.
		list.add(new Board()); // �̰͵� ����.
		System.out.println(list.size());
		
		// ��ü ���
		String name = (String) list.get(0); // type mismatch�� ���Ƿ� ���� Ÿ�Ժ�ȯ�� �ǽ��Ѵ�.
		int/*���� ��ڽ�*/ value = (Integer) list.get(1);
		Board board = (Board) list.get(2); // �̷��� �� ������ ����.
		
		
		// ��ü ����
		list.remove(0);
		list.remove(0); // �ڵ����� ������ ������
		System.out.println(list.size());
	}

}
