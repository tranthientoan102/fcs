import java.util.Scanner;

public class AtmMain{
	public static void main(String[]args){
		// Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner (System.in);
		ATM atm = new ATM();

		double money = 0.0;
		while(true) {
			System.out.print("How much money you want to withdraw? ( 0 for quit )\t");
			try {
				money = Double.parseDouble(scanner.nextLine());
				if (money == 0.0) break;
				System.out.println(atm.run(money));


			} catch (Exception ex){
				System.out.println("!!!!!Invalid input!!!!!\n");
			}
		}

		System.out.println("Thank you for using our serivce\n");
	}
}
