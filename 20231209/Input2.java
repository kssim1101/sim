import java.io.*;

class Input2 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void input(){
		p("국어: ");
		try{
			String line = br.readLine();
			line = line.trim();
			int i = Integer.parseInt(line);
			if(i<0 || i>100){
				pln("점수의 범위는 0~100점까지예요. 다시 입력 부탁요~");
				input();
			}else{
				pln("입력받은점수: " + i);
			}
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			pln("헉.. 숫자가 아니네요. 다시 입력 부탁요~");
			input();
		}
	}
	void p(String str){
		System.out.print(str);
	}
	void pln(String str){
		System.out.println(str);
	}
	public static void main(String[] args) 
	{
		new Input2().input();
	}
}
