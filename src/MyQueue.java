
public class MyQueue {//es como un pop(?)
	int tail;
	int max;
	int head;
	public char[]colas;
	//int top;
	
	public MyQueue (int qsize) {
		this.colas = new char[qsize];
		this.max= this.colas.length;
		this.tail=0;
		this.head=colas[0];
		//this.top=0;
	}
	
	public void fullc (char vale) {
		if(tail==max) {
			System.out.println("Queue is full");
		}
		else {
			colas[tail]=vale;
			tail++;
			//System.out.println(colas[2]+"\n");
		}
	}
	
	public char delete() {
		if(tail==0) {
			System.out.println("empty");
		return '#';
		}
		else {
			char el;
			el=colas[head];
			for(int x=0; x<colas.length-1; x++) {
				colas[x]=colas[(x+1)];
				tail--;
			}
		return el;
		}
	}
	
}
