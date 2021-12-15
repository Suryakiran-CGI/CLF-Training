package ExceptionHandling;



public class ExceptionDemo {

	public static void main(String[] args) {
		
        try {
        	int i = 7;
        	int j = 0;
        	int k = i / j;
        	System.out.println("No Error ! "+k);
        }
        catch(ArithmeticException e){
        	System.err.println("Error ! ");
        }
        finally {
        	System.out.println("Done...");
        }
       
	}

	
	/*AVOID CODE REDUCDANCY---> final block
	 * public static void main(String[] args) {
		
        try {
        	int i = 7;
        	int j = 0;
        	int k = i / j;
        	System.out.println("No Error ! "+k);
        	System.out.println("Done...");
        }
        catch(ArithmeticException e){
        	System.err.println("Error ! ");
        	System.out.println("Done...");
        }
       
       
	}

	 * */
}
