package deskera;
// Question No 2.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateNo {

	public static void main(String[] args) throws Exception {

		new PrintDuplicateNo().getAllDuplicate();
	}

	private void getAllDuplicate() throws Exception {

		int n;
		Set<Integer> nonDuplicate = new HashSet<>();
		Set<Integer> duplicateSet = new HashSet<>();
		try(Scanner s = new Scanner(System.in)){
			System.out.print("Enter no. of elements you want in array:");

			n = s.nextInt();
			if(n < 0 || n > 1000)
				throw new Exception("ELEMENTS YOU WANT IN ARRAY IS NOT IN GIVEN RANGE");
			
			int a[] = new int[n];
			System.out.println("Enter all the elements:");

			for(int i = 0; i < n; i++)
			{
				a[i] = s.nextInt();
				if(a[i] < 0 || a[i] > 1000)
					throw new Exception("ELEMENTS YOU WANT IN ARRAY IS NOT IN GIVEN RANGE");
				else if(a[i] > n)
					throw new Exception("Invalid input – elements must be between 1 and N");
				if(nonDuplicate.add(a[i]) == false)				
					duplicateSet.add(a[i]);
			}
			if(duplicateSet.size()>0)
				System.out.println(duplicateSet);
			else
				System.out.println("No Duplicates");
		}
	}

}
