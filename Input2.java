import java.io.*;

class Input2 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void input(){
		p("����: ");
		try{
			String line = br.readLine();
			line = line.trim();
			int i = Integer.parseInt(line);
			if(i<0 || i>100){
				pln("������ ������ 0~100����������. �ٽ� �Է� ��Ź��~");
				input();
			}else{
				pln("�Է¹�������: " + i);
			}
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			pln("��.. ���ڰ� �ƴϳ׿�. �ٽ� �Է� ��Ź��~");
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
