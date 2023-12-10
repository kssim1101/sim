class Input1 {
	void m(String[] args){
		if(args.length != 4){
			System.out.println("4개점수만입력(예: java Input1 50 60 70 80)");
			return;
		}

		for(int i=0; i<args.length; i++){
			System.out.println("args["+i+"]: " + args[i]);
		}
	}
	public static void main(String[] args) {
		new Input1().m(args);
	}
}
