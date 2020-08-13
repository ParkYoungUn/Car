import java.util.Scanner;

public class CarSystem {

	boolean start; // 시동
	int carBreak = 1; // 브레이크
	int speed; // 차량 속도
	int gear; // 차량 기어
	String blink = "< >"; // 깜빡이(비상등)
	
	Scanner Input = new Scanner(System.in);
	
	void BreakDwon() { // 브레이크 상태
		carBreak = 0;
		System.out.println("현재 브레이크 상태: "+carBreak);
	}
	
	void Start() { // 시동 메서드
		if(carBreak == 0) {
			start = !start;
		}
		System.out.println("현재 시동 상태: " +start);
	}
	
	void Accelerator() { // 가속패달 역할
		carBreak = 1;
		System.out.println("현재 기어를 입력해주세요: ");
		int accAmount = Input.nextInt();	// 가속의 정도를 입력
		if (start == true) {
			switch (accAmount) {
				case 1:
					gear += 1;
					speed += 20;
					System.out.println("현재 기어: "+ gear + ", 현재 속도:"+ speed);
					break;
				case 2:
					gear += 2;
					speed += 40;
					System.out.println("현재 기어: "+ gear + ", 현재 속도:"+ speed);
					break;
				case 3:
					gear += 3;
					speed += 80;
					System.out.println("현재 기어: "+ gear + ", 현재 속도:"+ speed);
					break;
				case 4:
					gear += 4;
					speed += 100;
					System.out.println("현재 기어: "+ gear + ", 현재 속도:"+ speed);
					break;
				default: 
					gear += 5;
					speed += 140;
					System.out.println("현재 기어: "+ gear + ", 현재 속도:"+ speed +"\n최대 기어는 5단 까지입니다.");
				}
		} else {
			System.out.println("현재 시동이 "+ start + " 입니다.\n"+"시동을 먼저 걸어주세요.");
		}
	}
	
	void carNumIn() { // 차량 번호 입력
		System.out.println("차량 번호를 입력해 주세요.");
		String CarNum = Input.nextLine();
		System.out.println("차량 번호: "+CarNum);
	}
	
	void blink() { // 비상 깜빡이
		for (int i=0 ; i<10 ; i++) {
			System.out.print(blink +" ");
			try{
			    Thread.sleep(500);
			}catch(InterruptedException e){
			    e.printStackTrace();
			}
		}
	}
}
