package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TryWithResources {

	public static void main(String[] args) throws Exception {

		int num =  0;
		System.out.print("Enter the number : ");
		InputStreamReader obj = new InputStreamReader(System.in);
		
		try(BufferedReader br = new BufferedReader(obj)){  //Syntax available for >1.7 version
			num = Integer.parseInt(br.readLine());
		}
		
		System.out.println(num);
	}

}
