package constructor;

class Employe{
	String name;
	int EmpId;
	int Salary;
    static String Ceo; //static memory
    
    static {Ceo = "Ajay";}
    
    public Employe(String name) {
    	this.name = name;
    }
    public Employe() {
    	this.EmpId = EmpId;
    	this.Salary = Salary;
    	this.Ceo = Ceo;
    }
	
	public void show() {
		System.out.println(EmpId+" "+Salary+" "+Ceo);
	}
}

public class StaticDemo {
	static String mnc="CAPGEMINI";
	//static short k=111;
	public static void main(String[] args) {
        //int k;
        
		
        Employe Kalyan = new Employe("Kalyan");
        Kalyan.EmpId = 4321;
        Kalyan.Salary = 40000;
        //Kalyan.Ceo = "Mahesh";
        
        Employe Surya = new Employe();
        Surya.EmpId = 1234;
        Surya.Salary = 50000;
        //Surya.Ceo = "Mahesh";
        //Surya.Ceo = "Manoj";
        
        Kalyan.show();
        Surya.show();
        System.out.println(mnc);
	}


}
