import java.io.*;								//Buffer�� ����ϱ� ���� java.io�� �ҷ� �Դ�.

class Exam2 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Buffer�� ����ϱ� ���� �غ� ���� ���� �ȴ�.
	int is[] = new int[3];											//���⼭�� ����, ���, ������ ���ϴ� �� �迭�� �߰��غ��Ҵ�.
	void inputKO() {													//���� ������ �Է��ϴ� �żҵ� ����. ��ü���� ������ �����Բ��� �Ͻ� �� �׳� �����ߴ�.
		p("����");
		try{																								//try catch���� ������ �߻����� �� ������ ���ߴ� ���� �����ִ� �����̴�.
			String line = br.readLine();										//try ������ ������ �߻��� �� �ִ� ������� �־��ְ�, catch ������ ������ �߻����� �� ��� ������ �Է��Ѵ�.
			line = line.trim();															//catch ���� ���� �� ������ �� �ִ�. �׷��� ���� �ϳ��� �ϳ��� catch ���� ����ȴ� (���⼭�� 2���� catch ���� ���Դ�).
			int x = Integer.parseInt(line);									//���� ���� �ǰ�����, Ȥ�� �� �� �ڼ��� �˰� �ʹٸ� å�� ����. p464���� ���� �ȴ�.
			if(x<0 || x>100) {																					
				pln("������ ������ 0~100�����Դϴ�.");
				inputKO();
			} else {
				pln("�Է��� ����: " + x);
			}
			is[0] = x;																//�迭 �߰��� �� ����
		} catch(IOException ie) {                                //IOException�� Buffer�� ����� ��� ������ �߻��ϴ� ������ try catch���� ����ϰų� throw�� ����Ͽ� �ذ��Ѵ�. ���伱 try catch���� �̿��Ͽ� �ذ��ߴ�.
		} catch(NumberFormatException ne) {  //NumberFortmatException�� ����Ÿ���� �ƴ� �� �߻��ϴ� �����̴�.
		pln("���ڸ� �Է��� �ּ���.");
		inputKO();
		}
	}
	void inputEN() {							//���� ������ �Է��ϴ� �żҵ� ����. inputKO�� ����.
		p("����");
		try{
			String line = br.readLine();
			line = line.trim();
			int x = Integer.parseInt(line);
			if(x<0 || x>100) {
				pln("������ ������ 0~100�����Դϴ�.");
				inputEN();
			} else {
				pln("�Է��� ����: " + x);
			}
			is[1] = x;
		} catch(IOException ie) {                                
		} catch(NumberFormatException ne) {  
		pln("���ڸ� �Է��� �ּ���.");
		inputEN();
		}
	}
	void inputMA() {						//���� ������ �Է��ϴ� �żҵ� ����. inputKO�� ����.
		p("����");
		try{
			String line = br.readLine();
			line = line.trim();
			int x = Integer.parseInt(line);
			if(x<0 || x>100) {
				pln("������ ������ 0~100�����Դϴ�.");
				inputMA();
			} else {
				pln("�Է��� ����: " + x);
			}
			is[2] = x;
		} catch(IOException ie) {                               
		} catch(NumberFormatException ne) { 
		pln("���ڸ� �Է��� �ּ���.");
		inputMA();
		}
	}
	int total() {         //���� ���ϱ�. �żҵ� Ÿ������ void�� �ƴ� int�� ����Ͽ���. �ٷ� �ؿ� �ִ� 'average �޼ҵ�'�� �Ű�����(�Ķ����)�� 'total �޼ҵ�'�� ���������� 'int t'�� �� �ִµ�, 
		int t = 0;			//�װ� ������ Ÿ���� void�� �ƴ� int��� ��ٰ� �� �� �ִ�. void�� ����  �̷� ������ �� �� ����. ���� ��� �κ��� �ƴ϶� ��Ȯ�� ������ �� �𸥴�.
		for(int n=0; n<is.length; n++) {
			t += is[n];
		}
		pln("����: " + t);
		return t;							//�޼ҵ��� Ÿ���� void�� �ƴ� ��� ������ return�� �־���� �Ѵ�.
	}
	float average(int t) {							//�Ű������� 'total �޼ҵ�'�� 'int t'�� �־� �� �޼ҵ� �ȿ��� ���� t�� �����Ӱ� ����� �� �ִ�. 
		float a = (float)t / is.length;		//���� �Ű������� ��ĭ���� ���ܵ״ٸ�( ex. float averagae() ) ���� t�� ����� �� ����.
		pln("���: " + a);								// ���� t�� 'average �޼ҵ�' �ȿ� �� ���Ӱ� �����ߴٸ� ( ex. int t = 0;) ���� t�� �� �� �ְ�����, �츮�� ���ϴ� �� total �޼ҵ��� t�̱� ������ �̷��� �ߴ�.
		return a;												//Ÿ������ void�� �ƴ� float�� �� ������ �ؿ� �ִ� 'garde �޼ҵ�'���� ���� a�� ���� ���ؼ��̴�. 
	}
	void grade(float a) {
		String g = "S";
		if (a>90) {
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
		pln("����: " + g);
	}
	void p(String str) {
		System.out.print(str);
	}
	void pln(String str) {
		System.out.println(str);
	}
	public static void main(String args[]) {
		Exam2 e2 = new Exam2();
		e2.inputKO();
		e2.inputEN();
		e2.inputMA();
		e2.grade(e2.average(e2.total()));    //������ average �޼ҵ�� grade �޼ҵ� �ȿ� ���� int t�� float a�� �� �־���. ���� void m() {} �̷� �޼ҵ尡 �ִٰ� �Ѵٸ�, ȣ���� ��  e2.m() �̷��Ը� ���� �ȴٴ� ���� ����� ���̴�.
	}																			  //�׷��� �Ű����� �ȿ� ������ �־��ٸ�, �� ���� ���� ��� ���Դ��� �˷���� �Ѵ�. ���� ��� �κ��� �ƴ϶� ��Ȯ�� ������ �� �𸥴�.
}