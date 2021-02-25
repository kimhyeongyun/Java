package ch11.exam02;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
		// super(); ��������
		this.id = id;
		this.name = name;
	}
	
	// equals() ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member ) { // ����� Ŭ������ �����������
			Member m = (Member) obj;
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	
}
