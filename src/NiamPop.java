
public class NiamPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack myStack= new MyStack(8);
		myStack.Push('e');
		myStack.Push('d');
		myStack.Push('r');
		myStack.Push('o');
		myStack.Push('m');
		myStack.Push('j');
		myStack.Push('s');
		myStack.Push('h');

		System.out.println("MyStack:\n");
		for(int x=0;x<myStack.stack.length; x++) {
			
			//System.out.println("stack:"+myStack.stack[x]+"\n");
			System.out.println(myStack.Popo());
			//System.out.println("-----");
			//System.out.println(myStack.dele());
		}

	}

}
