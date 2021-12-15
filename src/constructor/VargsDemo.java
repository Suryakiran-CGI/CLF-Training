package constructor;


class Calc{
	/*2 arg method
	public void add(int x ,int y) {
		System.out.println(x + y);
	}
	*/
	public int add(int ... n) {  //n - args method
		int sum=0;
		for(int i : n) {        // variables array or array args
			sum+=i;
		}
		return sum;
	}
}

public class VargsDemo {

	public static void main(String[] args) {
		Calc c = new Calc();
        System.out.println(c.add(3, 4));
	}

}
