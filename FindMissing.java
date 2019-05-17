package deskera;

public class FindMissing {

	// Question No. 4. 
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,4,5};
		int missing = new FindMissing().getMissing(arr);
		System.out.println(missing);
	}

	private int getMissing(int[] n) {
		int N = n.length+1;
		int sumOfN = (N*(N+1))/2;
		int sum = 0;
		for(int i = 0; i< n.length;i++){
			sumOfN = sumOfN - n[i];
		}
		return sumOfN;
	}
}
