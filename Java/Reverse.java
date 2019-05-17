package deskera;

// Question no. 5.
public class Reverse {

	public static void main(String[] args) {
		//Driver Code
		System.out.println(new Reverse().reverseOrder("my name is earl"));
	}

	private String reverseOrder(String string) {
		String reverse = "";
		String[] arr = string.split(" ");
		for(int i = arr.length-1;i>=0;i--){
			if(i == arr.length-1)
				reverse += arr[i];
			else
				reverse = reverse +" " + arr[i];
		}
		return reverse;
	}
}
