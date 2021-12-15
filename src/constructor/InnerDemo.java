package constructor;


class Outer{
	public void show() {
		System.out.println("Hey! Im Outer Class");
	}
	static class Inner{       //Static class 
		public void show() {
			System.out.println("Oops! Im Inner Class");
		}
	} // For static inner class obj == OuterClass.InnerClass refernce =  new OuterClass.InnerConstruct()
}// For Member inner class obj == OuterClass.InnerClass refernce =  OuterClassObject.new InnerConstruct()


public class InnerDemo {
	public static void main(String[] args) {
		Outer obj = new Outer();
		Outer.Inner obj1 = new Outer.Inner();
		
		//obj.show();
		obj1.show();

	}

}
