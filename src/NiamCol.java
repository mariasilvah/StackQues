
public class NiamCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue myQueue = new MyQueue(8);
		myQueue.Pushs('e');
		myQueue.Pushs('d');
		myQueue.Pushs('r');
		myQueue.Pushs('o');
		myQueue.Pushs('m');
		myQueue.Pushs('j');
		myQueue.Pushs('s');
		myQueue.Pushs('h');
		
		for(int x=0;x<myQueue.colas.length; x++) {
			System.out.println(myQueue.delete());
		}

	}

}
