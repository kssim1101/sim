class Exam1 {
	void m(String[] args){        //�����Բ��� �ϼ̴� �� �״��
		if(args.length != 4){
			System.out.println("4���������Է�(��: java Input1 50 60 70 80)");
			return;
		}
		for(int i=0; i<args.length; i++){
			System.out.println("args["+i+"]: " + args[i]);
		}
	                                    //����, ���, ���� ���ϱ�
		int t = 0;             //��������t ���� �� �ʱ�ȭ
		for(int i=0; i<args.length; i++) {  //for���� �̿��Ͽ� ���� ���ϱ� 
			int k = Integer.parseInt(args[i]);  //args[i]�� ���ڿ� �������̱� ������ ������ ��ȯ
			t += k;
		}
		float a = t / args.length;  //��պ���a ���� �� ��հ� ���ϱ�(�Ҽ��� �Ʒ����� ���ϰ� �; float ���)
		String g = "S";		//��������g ���� �� �ʱ�ȭ
		if (a>90) {				//if������ ����� ���� ���� ���� ���ϱ�
			g = "A";
		} else if (a>80) {
			g = "B";
		} else if(a>70) {
			g = "C";
		} else if(a>60) {
			g = "D";
		} else {
			g = "F";
		}
		System.out.println("����: " + t + ", ���: "  + a + ", ����: " + g);  //���
	}
	public static void main(String[] args) {
		Exam1 e1 = new Exam1();
		e1.m(args);
	}
}
