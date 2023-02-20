
public class Queued {
	//Implementa un queue básico, usando un arreglo debes ser capaz de
	//añadir elementos al final de una cola y eliminar elementos de la parte
	//delantera.
	int top;
	int maxq;
	int h;
	public char[]quebas;
	
	public Queued (int siz) {
		this.quebas=new char[siz];
		this.maxq=this.quebas.length;
		this.top=0;
		this.h=quebas[0];
	}
	
	public void Ful(char vall) {
		if(top==maxq) {
			System.out.println("Nuevo Queue lleno :o");
		}
		else {
			quebas[top]=vall;
			top++;
			//System.out.println("quebas 2:"+quebas[2]+"\n");
		}
	}
	public char Nuevdele() {
		if(top==0) {
			System.out.println("Nuevo Queue vacio");
		return '#';
		}
		else {
			char lima;
			lima=quebas[top-1];
			top--;
			return lima;
			}
		}
	}	

	
