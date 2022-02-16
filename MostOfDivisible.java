import java.util.Scanner;

public class MostOfNumbers(){

	private int[] listOfNums;

	public MostOfNumbers(int[] listOfNums) {
		this.listOfNums = listOfNums;
	}

	public int getMostDivisor() {
		int number_with_most_divisor = listOfNums[0];
		int mostDiv = 0;
		for (int i = 0; i < listOfNums.length; i++) {
			int currentdivisor = 0;
			for (int num : listOfNums) {
				if (listOfNums[i] % num == 0) {
					currentdivisor += 1;
				}

			}
			if (currentdivisor > mostDiv) {
				mostDiv = currentdivisor;

				number_with_most_divisor = listOfNums[i];
			}

		}
		return number_with_most_divisor;

	}

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		// reading the number of elements from the that we want to enter
		n = sc.nextInt();
		// creates an array in the memory of length
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = sc.nextInt();
		}

		System.out.println("Array elements are: ");
		// accessing array elements using the for loop
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

		MostOfNumbers most = new MostOfNumbers(array);
		System.out.println("mostDivisor number: " + most.getMostDivisor());

	}

}