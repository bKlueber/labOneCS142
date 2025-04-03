import java.util.Scanner;

public class labOne{

    Scanner userInput = new Scanner(System.in); //intializes a new scanner for user input, stored as userInput

    public static void main(String[] args) {

        System.out.println("Welcome to the 2d Matrice Calculator\nPlease choose from the following options:");
        System.out.println("1.View current Matrices\n2.Edit Matrice Value\n3.Perform Matrice Calculation\n4.Exit System");
        
        int menuSelection = userInput.nextInt(); //stores the user menu selection as menuSelection
        boolean userContinue = true;

        switch(menuSelection) {
            case 1:
                //add code to call method that will print Matrices
                break;

            case 2:
                while(userContinue == true){
                    System.out.println("NOTICE! Entering Matrice values will override any previous inputs! This cannot be undone.");
                    System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no\n>>>");
                    
                    int userProceed = userInput.nextInt();

                        if (userProceed == 1) {
                            System.out.println("Enter new menu for user to select between + - and * the matrices");
                        } 
                        else if (userProceed == 2) {
                            userContinue = false;
                            System.out.println("Returning to main menu");
                            break;
                        }



                }
                // add code for method that first confirms user wants to change values, this will clear previous entries, then takes 2d array values 2x
                break;

            case 3:
                // add method that displays options for what calculations to perform and then functions for menu to execute
                break;

            case 4:
                userInput.close();
                System.exit(0);
                break;   
        }
    }

}