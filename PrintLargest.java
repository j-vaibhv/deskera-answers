package deskera;
// Question No 1.
import java.util.Scanner;

public class PrintLargest {

	public static void main(String[] args) throws Exception {

		new PrintLargest().printLargestValue();
	}

	private void printLargestValue() throws Exception {
		int n; 
		int largest = 0;
		
		try(Scanner s = new Scanner(System.in)){
			System.out.print("Enter no. of elements you want in array:");

			n = s.nextInt();
			if(n < 0 || n > 100)
				throw new Exception("ELEMENTS YOU WANT IN ARRAY IS NOT IN GIVEN RANGE");
			
			int a[] = new int[n];
			System.out.println("Enter all the elements:");

			for(int i = 0; i < n; i++)
			{
				a[i] = s.nextInt();
				if(a[i] < 0 || a[i] > 100)
					throw new Exception("ELEMENTS YOU WANT IN ARRAY IS NOT IN GIVEN RANGE");
				if(largest < a[i])
					largest = a[i];
			}

			System.out.println("largest:"+largest);
		}
	}

}
