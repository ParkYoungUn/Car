
public class CarMain {
    public static void main(String[] args) throws Exception {
       
    	CarSystem tivoli = new CarSystem();
    	
    	tivoli.carNumIn();
    	Thread.sleep(1000);
    	tivoli.BreakDwon();
    	Thread.sleep(1000);
    	tivoli.Start();
    	tivoli.Accelerator();
    	tivoli.BreakDwon();
    	tivoli.blink();
        //�Ӽ� 5�� �̻�
        //�޼��� 5�� �̻�
        // ���ϴ°� ��������
    	
    }
}