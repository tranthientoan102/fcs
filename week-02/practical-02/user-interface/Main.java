import java.util.Scanner;

public class Main{
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[]args){

		System.out.print("Welcome dear user!");
		char c = 'c';
		
		while (c != 'b'){
			System.out.print("Would you like to:\n");
			System.out.print("a) sum again\n");
			System.out.print("b) exit\n");
			c = Main.scanner.next().charAt(0);
			switch (c){
				case 'a':
					caclSum();
					break;
				case 'b':
					System.out.print("Thank you! Have a good day.\n\n");
					break;
				default:
					System.out.print("Unknow input\n\n");
			}
		}

	}
	public static void caclSum(){
		try{
			int a, b;
			System.out.print("Please, insert the first number: ");
			a = Main.scanner.nextInt();
			System.out.print("Please, insert the second number: ");
			b = Main.scanner.nextInt();
			System.out.print(String.format("----\nThank you for your enquiry, the sum between %d and %d is %d.\n\n", a, b, a+b));
		}catch (Exception ex){
				System.out.print("!!!Error: data type is not supported\n\n");
		}
	}
}