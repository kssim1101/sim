import java.util.*;  //Scanner�� �̿��ϱ� ���� java.util�� �ҷ���

class Exam3 {
	Scanner s = new Scanner(System.in); //Scanner�� ����ϴ� �� �ʿ��� ����. s�� Scanner ������.
	void input() {
		p("����");
		int x = s.nextInt(); // (Scanner ����).nextInt()�� ���� ��� ������Ʈ�� �������� �Է��� �� ����.  �Է��� �������� x�� ���.
		pln("�Է� ���� ����: " + x);
		p("����");
		int y = s.nextInt();
		pln("�Է� ���� ����: " + y);
		p("����");
		int z = s.nextInt();
		pln("�Է� ���� ����: " + z);

		int total = x + y +z;  //������ ������ ����

		int average = total / 3; //������ ������ ���

		String grade =  "F";  //������ ������ ����� �������� ������ ����
		if (average>90) {
			grade = "A";
		} else if (average>80) {
			grade = "B";
		} else if(average>70) {
			grade = "C";
		} else if(average>60) {
			grade = "D";
		} else {
			grade = "F";
		}
		pln("����: " + total + ", ���: " + average + ", ����: " + grade); //����� ����, ���, ���� ���
	}
	void p(String str) {
		System.out.print(str);
	}
	void pln(String str) {
		System.out.println(str);
	}
	public static void main(String args[]) {
		Input3 i3 = new Input3();
		i3.input();
	}
}