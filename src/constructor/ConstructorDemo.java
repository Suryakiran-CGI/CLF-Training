package constructor;


class  CalculatorNew{
	int x;
	int y;
	int res;
	public CalculatorNew(int x,int y) {
		this.x = x;
		this.y = y;
		//this.res = res;
	}
	
	public void disp() {
		res = x + y;
		System.out.println("Constructor has "+res);
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		CalculatorNew calc = new CalculatorNew(10,20);
		//calc.x = 10;
		//calc.y = 12;
		calc.disp();
	}
}

