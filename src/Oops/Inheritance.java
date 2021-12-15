package Oops;

//["Single - Level" if cls1 extnd cls2 else "Multi-Level"]

class Calc{     //only can add          [Super,parent,Base]
	public void add(int ...n) {
		int sum=0;
		for(int i : n) {
			sum+=i;
		}
		System.out.println("Addition = "+sum);
	}
}

class AdvCalc extends Calc{           //[Sub,Child,Derived]
	/*
	public void add(int ...n) { //Updated wth sub having reducdancy of add
		int sum=0;
		for(int i : n) {
			sum+=i;
		}
		System.out.println("Addition = "+sum);
	}*/
	
	public void sub(int x,int y) {
		System.out.println("Substraction = "+(x - y));
	}
}

class VeryACalc extends AdvCalc{
	public void mul(int x,int y) {
		System.out.println("Multiplication = "+(x * y));
	}
}


public class Inheritance {

	public static void main(String[] args) {
		Calc c = new Calc();
		AdvCalc ac = new AdvCalc();
		VeryACalc vac = new VeryACalc();
        c.add(12,13,14,15,16,17);
        ac.sub(21,32);
        vac.mul(10,8);
	}

}
