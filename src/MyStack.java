public class MyStack {
	public int top;
	public char[]stack;
	public int max;
	//////////
	public char[]Strinv;
	public String strastri;
	public int maxs;
	
	//public int max=stack.length;
	
	public MyStack(int size) {
		this.stack = new char[size];
		this.max=this.stack.length;
		this.top=0;
	}
	
	public void Push(char valor) {
		if(top==max) {
			System.out.println("Stack is full");
		}
		else {
			stack[top]=valor;
			top++;
		}
	}
	
	public char Popo() {
		if(top==0) {//
			//System.out.println("aqui");
			System.out.println("Stack is empty");
		return '#';
		}
		else {
			char eli;
			//System.out.println(top);
			eli= stack[top-1];
			top--;
			return eli;
		}
	}
	
	//public MyStri(Strinv.lenght) {
		//this.strastri= new String();
		//this.Strinv=new char[];
		//this.maxs=this.
	//}
	
	//public void LleCad(String Strinv) {
		//String[]niu = Strinv.split("");
		
		//public void Al()
		
	//}
	
	//public String Inv() {
		
	//}
	
	//public char dele() {
		//if(top==max) {
			//System.out.println("Empty");
		//return '#';
		//}
		//else {
			//char el;
			//el=stack[top];
			//top--;
			//for(int g=0; g<stack.length-1; g++) {
				//stack[g]=stack[(g+1)];
			//}
		//return el;
		//}
	//}
	
	
	
}
