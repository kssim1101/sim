class Exam1 {
	void m(String[] args){        //선생님께서 하셨던 것 그대로
		if(args.length != 4){
			System.out.println("4개점수만입력(예: java Input1 50 60 70 80)");
			return;
		}
		for(int i=0; i<args.length; i++){
			System.out.println("args["+i+"]: " + args[i]);
		}
	                                    //총점, 평균, 학점 구하기
		int t = 0;             //총점변수t 생성 및 초기화
		for(int i=0; i<args.length; i++) {  //for문을 이용하여 총점 구하기 
			int k = Integer.parseInt(args[i]);  //args[i]가 문자열 데이터이기 떄문에 정수로 변환
			t += k;
		}
		float a = t / args.length;  //평균변수a 생성 및 평균값 구하기(소수점 아래까지 구하고 싶어서 float 사용)
		String g = "S";		//학점변수g 생성 및 초기화
		if (a>90) {				//if문으로 경우의 수를 나눠 학점 구하기
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
		System.out.println("총점: " + t + ", 평균: "  + a + ", 학점: " + g);  //출력
	}
	public static void main(String[] args) {
		Exam1 e1 = new Exam1();
		e1.m(args);
	}
}
