import java.util.*;  //Scanner를 이용하기 위해 java.util를 불러옴

class Exam3 {
	Scanner s = new Scanner(System.in); //Scanner를 사용하는 데 필요한 문장. s가 Scanner 변수임.
	void input() {
		p("국어");
		int x = s.nextInt(); // (Scanner 변수).nextInt()를 쓰면 명령 프롬프트에 정수값을 입력할 수 있음.  입력한 정수값은 x에 담김.
		pln("입력 받은 점수: " + x);
		p("영어");
		int y = s.nextInt();
		pln("입력 받은 점수: " + y);
		p("수학");
		int z = s.nextInt();
		pln("입력 받은 점수: " + z);

		int total = x + y +z;  //국영수 점수의 총점

		int average = total / 3; //국영수 점수의 평균

		String grade =  "F";  //국영수 점수의 평균을 기준으로 학점을 나눔
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
		pln("총점: " + total + ", 평균: " + average + ", 학점: " + grade); //계산한 총점, 평균, 학점 출력
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