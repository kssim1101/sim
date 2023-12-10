import java.io.*;								//Buffer을 사용하기 위해 java.io를 불러 왔다.

class Exam2 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Buffer를 사용하기 위한 준비 정도 보면 된다.
	int is[] = new int[3];											//여기서는 총합, 평균, 학점을 구하는 데 배열을 추가해보았다.
	void inputKO() {													//국어 점수를 입력하는 매소드 정의. 전체적인 구조는 선생님께서 하신 걸 그냥 복사했다.
		p("국어");
		try{																								//try catch문은 오류가 발생했을 때 실행이 멈추는 것을 막아주는 역할이다.
			String line = br.readLine();										//try 블럭에는 오류가 발생할 수 있는 문장들을 넣어주고, catch 블럭에는 오류가 발생했을 때 어떻게 할지를 입력한다.
			line = line.trim();															//catch 블럭은 여러 개 생성할 수 있다. 그러나 오류 하나당 하나의 catch 블럭만 실행된다 (여기서는 2개의 catch 블럭이 나왔다).
			int x = Integer.parseInt(line);									//아직 몰라도 되겠지만, 혹시 좀 더 자세히 알고 싶다면 책을 보자. p464부터 보면 된다.
			if(x<0 || x>100) {																					
				pln("점수의 범위는 0~100까지입니다.");
				inputKO();
			} else {
				pln("입력한 점수: " + x);
			}
			is[0] = x;																//배열 추가한 것 주의
		} catch(IOException ie) {                                //IOException는 Buffer을 사용할 경우 무조건 발생하는 오류로 try catch문을 사용하거나 throw를 사용하여 해결한다. 여긴선 try catch문을 이용하여 해결했다.
		} catch(NumberFormatException ne) {  //NumberFortmatException은 숫자타입이 아닐 때 발생하는 에러이다.
		pln("숫자만 입력해 주세요.");
		inputKO();
		}
	}
	void inputEN() {							//영어 점수를 입력하는 매소드 정의. inputKO과 동일.
		p("영어");
		try{
			String line = br.readLine();
			line = line.trim();
			int x = Integer.parseInt(line);
			if(x<0 || x>100) {
				pln("점수의 범위는 0~100까지입니다.");
				inputEN();
			} else {
				pln("입력한 점수: " + x);
			}
			is[1] = x;
		} catch(IOException ie) {                                
		} catch(NumberFormatException ne) {  
		pln("숫자만 입력해 주세요.");
		inputEN();
		}
	}
	void inputMA() {						//수학 점수를 입력하는 매소드 정의. inputKO과 동일.
		p("수학");
		try{
			String line = br.readLine();
			line = line.trim();
			int x = Integer.parseInt(line);
			if(x<0 || x>100) {
				pln("점수의 범위는 0~100까지입니다.");
				inputMA();
			} else {
				pln("입력한 점수: " + x);
			}
			is[2] = x;
		} catch(IOException ie) {                               
		} catch(NumberFormatException ne) { 
		pln("숫자만 입력해 주세요.");
		inputMA();
		}
	}
	int total() {         //총합 구하기. 매소드 타입으로 void가 아닌 int를 사용하였다. 바로 밑에 있는 'average 메소드'의 매개변수(파라미터)에 'total 메소드'의 지역변수인 'int t'가 들어가 있는데, 
		int t = 0;			//그것 때문에 타입을 void가 아닌 int라고 썼다고 할 수 있다. void를 쓰면  이런 식으로 쓸 수 없다. 아직 배운 부분이 아니라서 정확한 개념은 잘 모른다.
		for(int n=0; n<is.length; n++) {
			t += is[n];
		}
		pln("총합: " + t);
		return t;							//메소드의 타입이 void가 아닐 경우 무조건 return을 넣어줘야 한다.
	}
	float average(int t) {							//매개변수에 'total 메소드'의 'int t'를 넣어 이 메소드 안에서 변수 t를 자유롭게 사용할 수 있다. 
		float a = (float)t / is.length;		//만약 매개변수를 빈칸으로 남겨뒀다면( ex. float averagae() ) 변수 t를 사용할 수 없다.
		pln("평균: " + a);								// 변수 t를 'average 메소드' 안에 서 새롭게 정의했다면 ( ex. int t = 0;) 변수 t를 쓸 수 있겠지만, 우리가 원하는 건 total 메소드의 t이기 때문에 이렇게 했다.
		return a;												//타입으로 void가 아닌 float을 쓴 이유는 밑에 있는 'garde 메소드'에서 변수 a를 쓰기 위해서이다. 
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
		pln("학점: " + g);
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
		e2.grade(e2.average(e2.total()));    //위에서 average 메소드와 grade 메소드 안에 각각 int t와 float a를 써 주었다. 만약 void m() {} 이런 메소드가 있다고 한다면, 호출할 때  e2.m() 이렇게만 쓰면 된다는 것을 기억할 것이다.
	}																			  //그러나 매개변수 안에 뭔가를 넣었다면, 그 넣은 놈이 어디서 나왔는지 알려줘야 한다. 아직 배운 부분이 아니라서 정확한 개념은 잘 모른다.
}