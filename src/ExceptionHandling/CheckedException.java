package ExceptionHandling; //compiler knows type of exception so --> checked else "unchecked"

import java.io.*;

public class CheckedException {
	// Way 1 --> Using Throw exception
//	public static void main(String[] args) throws Exception {
//
//		InputStreamReader obj = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(obj);
//
//		int num = Integer.parseInt(br.readLine());// 45
//		br.close();
//
//		System.out.println(num);
//	}

	//Way 2 --> Using Try Catch 
	public static void main(String[] args) throws Exception {

		int num = 0;
		System.out.print("Enter the Number : ");
		
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(obj);
	        num = Integer.parseInt(br.readLine());// 45
		}
		
		catch(Exception e) {
			System.err.println(e);
		}
        
        finally {
        	br.close();
        }
		
		System.out.println(num);
	}

}
