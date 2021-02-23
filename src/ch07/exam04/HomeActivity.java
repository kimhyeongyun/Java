package ch07.exam04;

public class HomeActivity extends Activity {
	// 필드
	
	// 생성자
	public HomeActivity() {
		super();
	}
	// 메서드
	
	
	@Override
	public void onCreate() {
		super.onCreate(); // 부모에 있는 코드를 실행해.
		System.out.println("자식이 UI 요소를 생성합니다.");
		System.out.println("자식이 UI 요소의 이벤트를 처리합니다.");
	}
}
