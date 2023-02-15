
public class MyStack {
	int max;
	int top;
	public char[]stack;
		
	public MyStack(int stackSize) {
		this.stack=new char[stackSize];
		this.max=this.stack.length;
		this.top=max;
	}
		
	public void Popo(char val) {//void no va
		//char[]stackm = new char[max-1];
		if(top==0) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println(stack[top-1]);
			stack[top-1]=0;
			top--;
		}
			//vale=
			//stack[top]=val;// el val se elimina
			//top--;
			//return value;
		}
	
}
