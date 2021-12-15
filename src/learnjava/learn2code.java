package learnjava;


class Calculator{
	
	int x;
	int y;
	//static int z=9;
	int z = 9;
	int result;
	
	public void Add(int x,int y) {
		result = x + y;
		System.out.println(result);
	}
	public void Sub(int x,int y) {
		result = z + x - y;
		System.out.println(result);
	}
	public void disp(int x,int y) {
		
	}
}


class learn2code {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.Sub(10,20);
		calc.z = 32;
		calc.Sub(4,7);
		
	}

}
