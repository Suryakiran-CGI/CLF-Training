package ExceptionHandling;


public class UserDefinedException {

	public static void main(String[] args) {
		
		int i=8,j=9;
		
		try {
			
			int k = i / j;
			
			if(k==0) {
				throw new DefinedException("0 can't be accepted...");
			}
			
			System.out.println(k);
		}
		
		catch(Exception e) {
			System.err.println("Error Occured : "+e.getMessage());
		}
		
		finally {
			System.out.println("Code Compiled!");
		}
	}

}
