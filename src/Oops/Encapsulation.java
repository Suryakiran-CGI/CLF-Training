package Oops;

//Binding data with methods
class Student{
	private int rollno;
	private String name;
	
	public void setRollno(int x) {    //setters or mutators
		rollno = x;
	}
	public int getRollno() {         //getters or accessors
		return rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {
	public static void main(String[] args) {
		Student std = new Student();
		std.setRollno(2);//rollno = 121;
		std.setName("Surya");//std.name = "Surya";
		System.out.println(std.getRollno());
        System.out.println(std.getName());	
    }

}
