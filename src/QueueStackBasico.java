import java.util.*;
public class QueueStackBasico {
	int tail;
	int head;
	int maxs;
	public char[]staba;
	
	public QueueStackBasico(int size){
		//Implementa un stack básico, usando un arreglo debes ser capaz de 
		//introducir elementos en el inicio del stack y sacar (pop) elementos del
		//inicio del mismo. 
		this.staba=new char[size];
		this.maxs=this.staba.length;
		this.head=0;
		this.tail=staba[0];
	//this.head=staba[0];
	}

	public void Pu(char valo) {
		if(tail==maxs) {
			System.out.println("Nuevo Stack lleno :o");
		}
		else {
			staba[tail]=valo;
			tail++;
		//System.out.println(staba[2]+"\n");
		}
	}
	public char Nuevpopo() {
	//for(tail=0; tail<staba.length; tail++) {
	//System.out.println(staba[tail]+"\n");
	//}	
		char elim=0;
		if(tail==0) {
		//elim=0;
			System.out.println("Nuevo Stack vacio");
		}
		else {
			elim=staba[head];
			for(int x=0; x<staba.length-1; x++) {
				staba[x]=staba[(x+1)];
				tail--;
		}
		//System.out.println("Elim: "+elim+"\n");
		}
	return elim;
	}

}
