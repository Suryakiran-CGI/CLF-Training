package constructor;


class PrintTable{
	int i;
	static int n;
	
	public PrintTable(int n) {
		this.n= n;
	}
	
	public void show() { //Method - 0 parameters
		for(i=1;i<11;i++) {
		    System.out.println(n+" x "+i+" = "+n*i);
		}
	}
	public void show(int x) {//Method - 1 parameter
		for(i=1;i<x;i++) {
		    System.out.println(n+" x "+i+" = "+n*i);
		}
	}
}

public class MethodOvr {
	public static void main(String[] args) {
		PrintTable pt = new PrintTable(3);
		pt.show();
		pt.show(16);
	}

}
