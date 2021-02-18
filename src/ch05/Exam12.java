package ch05;

public class Exam12 {

	public static void main(String[] args) { // main method라 부름
		
		Season nowSeason = Season.WINTER;
		if(nowSeason == Season.SUMMER) { // 이런 식으로 비교할 때 사용.
			System.out.println("맞습니다.");
		} else {
			System.out.println("아닙니다.");
		}
		System.out.println(nowSeason); // 이런 식으로 쓰지는 않음.
		
		
		// String loginResult = "ID가 없음" // 이렇게 하지 말자, 이런 거는 가독성이 안좋아요.
		
		LoginResult loginResult = LoginResult.FAILURE_ID;
		
		if(loginResult == LoginResult.SUCCESS) { // 이렇게 하면 오타도 줄고 가독성이 좋아집니다.
			System.out.println("로그인 성공했군요.");
		} else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("아이디를 다시 입력하세요.");
		} else {
			System.out.println("패스워드가 틀립니다.");
		}
		
	}
	
}
