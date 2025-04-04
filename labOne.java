import java.util.Scanner;

public class labOne{
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //intializes a new scanner for user input, stored as userInput

        System.out.println("Welcome to the 2d Matrice Calculator\nPlease choose from the following options:\n");
        System.out.println("1.View current Matrices\n2.Edit Matrice Value\n3.Perform Matrice Calculation\n4.Exit System");
        System.out.print(">>>");
        
        int menuSelection = userInput.nextInt(); //stores the user menu selection as menuSelection
        boolean userContinue = true;

        int[][] matrixOne = {
        {0,0,0},
        {0,0,0},
        {0,0,0}
        };

        int[][] matrixTwo = {
        {0,0,0},
        {0,0,0},
        {0,0,0}
        };

        switch(menuSelection) {
            case 1:
                for (int i = 0; i<matrixOne.length ;i++) { //iterates through the first matrix
                    for (int j = 0; j<matrixOne[i].length;j++) {
                        System.out.print(matrixOne[i][j] + " ");
                    }
                    System.out.println(); //adds a line inbetween each matrix within the outer matrix
                }

                System.out.println(); //adds a line inbetween matrices being printed

                for (int i = 0; i<matrixTwo.length ;i++) {//iterates through the second matrix
                    for (int j = 0; j<matrixTwo[i].length;j++) {
                        System.out.print(matrixTwo[i][j] + " ");
                    }
                    System.out.println();
                    }
                break;

            case 2:
                while(userContinue == true){
                    System.out.println("NOTICE! Entering Matrice values will override any previous inputs! This cannot be undone.");
                    System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no\n>>>");
                    
                    int userProceed = userInput.nextInt();

                        if (userProceed == 1) {
                            System.out.println("Please enter new values for Matrix 1:");
                            System.out.print(">>>");
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
                System.out.println("Enter new menu for user to select between + - and * the matrices");
                break;

            case 4: //exits and closes system
                userInput.close();
                System.exit(0);
                break;   
        }
    }
}