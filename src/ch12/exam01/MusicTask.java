package ch12.exam01;

public class MusicTask implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("음악을 연주합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
