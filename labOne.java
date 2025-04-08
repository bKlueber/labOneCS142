import java.util.Scanner;

public class labOne{
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //intializes a new scanner for user input, stored as userInput
        boolean keepRunning = true;

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

        while(keepRunning == true) {
            System.out.println("Welcome to the 2d Matrice Calculator\nPlease choose from the following options:\n");
            System.out.println("1.View current Matrices\n2.Edit Matrice Value\n3.Perform Matrice Calculation\n4.Exit System");
            System.out.print(">>>");
        
            int menuSelection = userInput.nextInt(); //stores the user menu selection as menuSelection
            boolean userContinue = true;

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
                                System.out.println("Please enter the size of matrix youd like to build (L x W):");
                                int L = 0;
                                int W = 0; //declaring these variables w/empty values

                               while(true) { //ensures only integers are accepted
                                    System.out.println("Please enter L\n>>>");
                                    if (userInput.hasNextInt()) { //ensures only int data types accepted
                                    L = userInput.nextInt(); 
                                    break;
                                    } 
                                else {
                                    System.out.println("Invalid input, please enter only integers");
                                    userInput.next(); //had issues w/program not reprompting, this clears input
                                }
                            }

                             while(true) { //ensures only integers are accepted
                                System.out.println("Please enter W\n>>>");
                                if (userInput.hasNextInt()) {
                                W = userInput.nextInt(); 
                                break;
                                } 
                                else {
                                    System.out.println("Invalid input, please enter only integers");
                                     userInput.next();
                                }
                            
                             }
                            matrixOne = new int[L][W];
                            matrixTwo = new int[L][W];
                            
                            
                            System.out.println("Filling first matrix. Matrix is filled from left to right, top to bottom.\n");

                            for (int i = 0; i<matrixOne.length; i++) {
                            System.out.println("Please enter values for row " + (i + 1) + " for Matrix One\n");

                                for (int j = 0; j <matrixOne[i].length; j++) {
                                    System.out.println("First Matrix Row " + (i + 1) + ": " + "Enter value for column " + (j + 1) + ".\n>>>");
                                    matrixOne[i][j] = userInput.nextInt();

                                }
                            }

                            System.out.println("Filling second matrix. Matrix is filled from left to right, top to bottom.\n");

                            for (int i = 0; i<matrixTwo.length; i++) {
                            System.out.println("Please enter values for row " + (i + 1) + " for Matrix Two\n");

                                for (int j = 0; j <matrixTwo[i].length; j++) {
                                    System.out.println("Second Matrix Row" + (i + 1) + ": " + "Enter value for column " + (j + 1) + ".\n>>>");
                                    matrixTwo[i][j] = userInput.nextInt();

                                }
                            }

                            System.out.println();
                            break;
                            }
                        
                         if (userProceed == 2) {
                            userContinue = false;
                            System.out.println("Returning to main menu");
                            break;
                        }
                    }
            
                    // add code for method that first confirms user wants to change values, this will clear previous entries, then takes 2d array values 2x
                    break;

                case 3:
                    MatrixCalculator calculator = new MatrixCalculator(); //simply saying to create new instance of class MatrixCalculator
                    // add method that displays options for what calculations to perform and then functions for menu to execute
                    System.out.println("Please choose from the following operations\n");
                    System.out.println("1.Add Matrix Values\n2.Subtract Matrix Values\n3.Multiply Matrix Values\n>>>");

                    int mathInput = userInput.nextInt();
                    int[][] finalMatrix = null; //creates empty matrix for printing final results 

                    switch(mathInput) { //switch nested within switch to allow user more control

                        case 1: //calls each method from within the class based on user input
                            finalMatrix = calculator.add(matrixOne, matrixTwo);
                            break;

                        case 2:
                            finalMatrix = calculator.subtract(matrixOne, matrixTwo);
                            break;

                        case 3: 
                            finalMatrix = calculator.multiply(matrixOne, matrixTwo);
                            break;

                        default:
                            System.out.println("There has been an error, returning to menu.");
                    }

                System.out.println("Computed Matrix:");
                for (int i = 0; i < finalMatrix.length; i++){
                    for (int j = 0 ; j < finalMatrix[i].length; j++) {

                    System.out.print(finalMatrix[i][j] + " ");
                    }

                System.out.println();
            }
                break;

                case 4: //exits and closes system
                    userInput.close();
                    System.exit(0);
                    break;  
            } 
        }
    }
}

public class MatrixCalculator {

    public int[][] add(int[][] matrixOne, int[][] matrixTwo) {
        //creates new array to display sum dynamically
        int[][] sumMatrix = new int[matrixOne.length][matrixOne[0].length]; 

         for (int i = 0; i<matrixOne.length; i++) {
             

             for (int j = 0; j <matrixOne[i].length; j++) {
             sumMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        return sumMatrix;
    }

     public int[][] subtract(int[][] matrixOne, int[][] matrixTwo) {
        //creates new array to display difference dynamically
        int[][] subMatrix = new int[matrixOne.length][matrixOne[0].length]; 

         for (int i = 0; i<matrixOne.length; i++) {
             

             for (int j = 0; j <matrixOne[i].length; j++) {
             subMatrix[i][j] = matrixOne[i][j] - matrixTwo[i][j];
            }
        }
        return subMatrix;
     }
    public int[][] multiply(int[][] matrixOne, int[][] matrixTwo) {
        //creates new array to display product dynamically
        int[][] multMatrix = new int[matrixOne.length][matrixTwo[0].length]; //fills with pairs of rows and columns
        int matchingPair = matrixOne[0].length;

         for (int i = 0; i<matrixOne.length; i++) {  
             for (int j = 0; j <matrixTwo[0].length; j++) { //checks length of array element 1 in matrixTwo
                    for (int k=0; k < matchingPair; k++) { //these 3 loops go through each matching set

                    int multResult = matrixOne[i][k] * matrixTwo[k][j];
                    multMatrix[i][j] = multMatrix[i][j] + multResult;
                    }
            
             
            }
        }
        return multMatrix;
    }
}
    