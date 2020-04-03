class IfElse {
    public static void main(String[] args) {     
        int number = -10;
         
        if (number > 0) {
            System.out.println("Number is positive.");
        }
        else if (number < 0){
            System.out.println("Number is not positive.");
        }
        else {
            System.out.println("Number is 0.");
        } 
     
        System.out.println("This statement is always executed.");
    }
}
