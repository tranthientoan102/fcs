// import Student;
import java.util.Scanner;

public class CreateStudent{
    public static void main(String[] args) throws InterruptedException{

        Scanner input = new Scanner(System.in);

        Student newStudent = new Student();

        // mark successful step for avoiding repeat
        int currentStep = 0;
        // generic display message
        String displayMessageFormat = "input Student's %s as %s:\n";
        String displayMessage ="";

        // keep looping until all student's data is successfull converted
        while (true){

            // collect input and parse them into Student's data
            try{
                switch (currentStep) {
                    case 0:
                        displayMessage = String.format(displayMessageFormat, "name", "String");
                        myPrint(displayMessage);
                        newStudent.name = input.nextLine();
                        currentStep += 1;
                    case 1:
                        displayMessage = String.format(displayMessageFormat, "age", "integer");
                        myPrint(displayMessage);
                        newStudent.age = Integer.parseInt(input.nextLine());
                        currentStep += 1;
                    case 2:
                        displayMessage = String.format(displayMessageFormat, "favorite food", "String");
                        myPrint(displayMessage);
                        newStudent.favoriteFood = input.nextLine();
                        currentStep += 1;
                    case 3:
                        displayMessage = String.format(displayMessageFormat, "grade", "String");
                        myPrint(displayMessage);
                        newStudent.grade = input.nextLine();
                        currentStep += 1;
                    case 4:
                        displayMessage = String.format(displayMessageFormat, "height", "double");
                        myPrint(displayMessage);
                        newStudent.height = Double.parseDouble(input.nextLine());
                        currentStep += 1;
                    case 5:
                        displayMessage = String.format(displayMessageFormat, "weight", "double");
                        myPrint(displayMessage);
                        newStudent.weight = Double.parseDouble(input.nextLine());
                        currentStep += 1;
                    case 6:
                        displayMessage = String.format(displayMessageFormat, "numberOfSubject", "integer");
                        myPrint(displayMessage);
                        newStudent.numberOfSubject = Integer.parseInt(input.nextLine());
                        currentStep += 1;
                }


                // finish input
                myPrint("New student record is created: \n" + newStudent.toString(), true);
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