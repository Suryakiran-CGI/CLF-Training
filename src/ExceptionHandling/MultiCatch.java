package ExceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {

		try {

			//int arr[] = new int[6];
			//arr[4] = 8;  //Array index exception;
			int arr[] = null; //Null point Exception
			arr[4] = 8;
			
			int i = 9;
			int j = 0;
			int k = i / j;   //Arithmetic Exception

		}

		catch (ArithmeticException e) { 
			//catch (ArithmeticException | ArrayIndexOutOfBoundsException e)   plumbing  for avoid multi Catch on 1.7 > versions
			System.err.println("Exception found! Can't divide by Zero");

		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("Index should be in Limit!..");

		}
		
		catch(Exception e) {
			System.err.println("Null Pointer Exception...");
		}

		finally {

			System.out.println("Okay?...");

		}

	}

}
