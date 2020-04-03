// import Student;
import java.util.Scanner;

public class CreatePoopy{
    public static void main(String[] args) throws InterruptedException{

        Scanner input = new Scanner(System.in);

        Poopy newPoopy = new Poopy();

        // mark successful step for avoiding repeat
        int currentStep = 0;
        // generic display message
        String displayMessageFormat = "input Poopy's %s as %s:\n";
        String displayMessage ="";

        // keep looping until all student's data is successfull converted
        while (true){

            // collect input and parse them into Student's data
            try{
                switch (currentStep) {
                    case 0:
                        displayMessage = String.format(displayMessageFormat, "name", "String");
                        myPrint(displayMessage);
                        newPoopy.name = input.nextLine();
                        currentStep += 1;
                    case 1:
                        displayMessage = String.format(displayMessageFormat, "age", "integer");
                        myPrint(displayMessage);
                        newPoopy.age = Integer.parseInt(input.nextLine());
                        currentStep += 1;
                    case 2:
                        displayMessage = String.format(displayMessageFormat, "favorite food", "String");
                        myPrint(displayMessage);
                        newPoopy.favoriteFood = input.nextLine();
                        currentStep += 1;
                    case 3:
                        displayMessage = String.format(displayMessageFormat, "height", "double");
                        myPrint(displayMessage);
                        newPoopy.height = Double.parseDouble(input.nextLine());
                        currentStep += 1;
                    case 4:
                        displayMessage = String.format(displayMessageFormat, "weight", "double");
                        myPrint(displayMessage);
                        newPoopy.weight = Double.parseDouble(input.nextLine());
                        currentStep += 1;
                    case 5:
                        displayMessage = String.format(displayMessageFormat, "favoriteToy", "String");
                        myPrint(displayMessage);
                        newPoopy.favoriteToy = input.nextLine();
                        currentStep += 1;
                    case 6:
                        displayMessage = String.format(displayMessageFormat, "ownerName", "String");
                        myPrint(displayMessage);
                        newPoopy.ownerName = input.nextLine();
                        currentStep += 1;
                }


                // finish input
                myPrint("New poopy record is created: \n" + newPoopy.toString(), true);
                break;
            } catch (Exception ex){
                myPrint("!!!Error: data type is not supported",true);
                Thread.sleep(500);

            }
        }




    }

    public static void myPrint(String display){
        myPrint(display, false);
    }
    public static void myPrint(String display, boolean makeNewLine){
        if (makeNewLine) System.out.println(display);
        else System.out.print(display);
    }

}