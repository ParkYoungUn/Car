import java.util.Scanner;

public class CarSystem {

	boolean start; // �õ�
	int carBreak = 1; // �극��ũ
	int speed; // ���� �ӵ�
	int gear; // ���� ���
	String blink = "< >"; // ������(����)
	
	Scanner Input = new Scanner(System.in);
	
	void BreakDwon() { // �극��ũ ����
		carBreak = 0;
		System.out.println("���� �극��ũ ����: "+carBreak);
	}
	
	void Start() { // �õ� �޼���
		if(carBreak == 0) {
			start = !start;
		}
		System.out.println("���� �õ� ����: " +start);
	}
	
	void Accelerator() { // �����д� ����
		carBreak = 1;
		System.out.println("���� �� �Է����ּ���: ");
		int accAmount = Input.nextInt();	// ������ ������ �Է�
		if (start == true) {
			switch (accAmount) {
				case 1:
					gear += 1;
					speed += 20;
					System.out.println("���� ���: "+ gear + ", ���� �ӵ�:"+ speed);
					break;
				case 2:
					gear += 2;
					speed += 40;
					System.out.println("���� ���: "+ gear + ", ���� �ӵ�:"+ speed);
					break;
				case 3:
					gear += 3;
					speed += 80;
					System.out.println("���� ���: "+ gear + ", ���� �ӵ�:"+ speed);
					break;
				case 4:
					gear += 4;
					speed += 100;
					System.out.println("���� ���: "+ gear + ", ���� �ӵ�:"+ speed);
					break;
				default: 
					gear += 5;
					speed += 140;
					System.out.println("���� ���: "+ gear + ", ���� �ӵ�:"+ speed +"\n�ִ� ���� 5�� �����Դϴ�.");
				}
		} else {
			System.out.println("���� �õ��� "+ start + " �Դϴ�.\n"+"�õ��� ���� �ɾ��ּ���.");
		}
	}
	
	void carNumIn() { // ���� ��ȣ �Է�
		System.out.println("���� ��ȣ�� �Է��� �ּ���.");
		String CarNum = Input.nextLine();
		System.out.println("���� ��ȣ: "+CarNum);
	}
	
	void blink() { // ��� ������
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
