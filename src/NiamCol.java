
public class NiamCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue myQueue = new MyQueue(8);
		myQueue.fullc('e');
		myQueue.fullc('d');
		myQueue.fullc('r');
		myQueue.fullc('o');
		myQueue.fullc('m');
		myQueue.fullc('j');
		myQueue.fullc('s');
		myQueue.fullc('h');
		
		for(int x=0;x<myQueue.colas.length; x++) {
			//System.out.println(myQueue);
			System.out.println(myQueue.delete());
		}

	}

}
