import java.util.Scanner;

public class BasicMath2 {
    //find two greater number

	public static void main(String[] args) {

		int input1;
		int input2;

		System.out.println("Enter two numbers:");

		Scanner in = new Scanner(System.in);
		input1 = in.nextInt();
		input2 = in.nextInt();

		if (input1 == input2) {
			System.out.println(input1 + " is equal to " + input2);

		} else if (input1 > input2) {
			System.out.println(input1 + " is larger than " + input2);

		} else {
			System.out.println(input1 + " is lesser than " + input2);

		}
	}
}