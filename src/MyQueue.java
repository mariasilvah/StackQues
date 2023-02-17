
public class MyQueue {//es como un pop(?)
	int tail;
	int max;
	public char[]colas;
	int top;
	
	public MyQueue (int qsize) {
		this.colas = new char[qsize];
		this.max= this.colas.length;
		this.tail=0;
		this.top=0;
	}
	
	//public void Push(char valor) {
		//colas[top]=valor;
		//top++;
	//}
	
	public void Pushs(char valor) {
		colas[top]=valor;
		top++;
	}
	
	public char delete() {
		if(tail==0) {
			System.out.println("empty");
		return '#';
		}
		else {
			char el;
			el=colas[top];
			for(int x=0; x<colas.length-1; x++) {
				colas[x]=colas[(x+1)];
			}
		return el;
		}
	}
	
}
