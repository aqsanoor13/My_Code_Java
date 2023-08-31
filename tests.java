import java.util.Scanner;

public class tests {
    public static void main (String[] args) {

        // Scanner scanner = new Scanner(System.in);   //Scanner object
        //  System.out.print("Please enter a number: ");   //Prompt the user to enter a number
        //  int number = scanner.nextInt();                //Read the input
        //  System.out.println("You entered: " + number);
        //  scanner.close();     //Close the scanner to release resources

         
        //Array
        // String[] fruits = {"apple", "graps", "mango"};
        //  for(int i = 0; i<=3; i++){
        //     System.out.println(fruits[i]);
        //  }

        // int[] numbers = {1,2,3,4,4,5,5};
        //  for(int v = 0; v<=3; v++){
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.print("Please enter a number: ");
        //     int number = scanner.nextInt(); 
        //     System.out.println("You entered: " + number);
        //     scanner.close();

        //     System.out.println(numbers[v]);
        //  };
        //  //System.out.println(" ");

        

        //////////////////////////////////////
        //array that take input from users

        // Scanner arr_len = new Scanner(System.in);
        // System.out.println(" Enter length of array: ");
        // int number = arr_len.nextInt();

        // int my_array[] = new int[number];
        // System.out.println("{");
        // for(int i = 0; i<number; i++){

        //     my_array[i] = arr_len.nextInt();
        // }
        //   System.out.println("}");


        // System.out.println("Array elements are: ");

        // System.out.println("{");
        // for(int x = 0; x<number; x++){

        //     System.out.println(my_array[x]);  
        // }
        // System.out.println("}");

        ////////////////////////////////
        //multi-dimensional array
        //Scanner arr_len = new Scanner(System.in);
        //System.out.println(" Enter 2D Array length: ");
        //int n = arr_len.nextInt();
        
        // int[][] number = {{1,2,3,4,5}, {6,7,8,9,10}};
        // for(int i=0; i<=number.length;i++){
        //     for(int j=0; j<=number.length; j++){
        //         System.out.println(number[i][j]);
                
        //     }
        //     System.out.println(" ");
        // }

        ///////////////////////

        //create object 
        Scanner Sc = new Scanner(System.in);

        //take numbers of rows and cols from user
        System.out.println("Enter Number of Rows:");
        int rows = Sc.nextInt();
         System.out.println("Enter Number of Cols:");
        int cols = Sc.nextInt();

        //declare array

        int[][] my_array = new int[rows][cols];

        //loops for input
        //for rows
        for(int i =0; i<rows; i++){
            //for cols
            for(int j =0; j<cols; j++){
                my_array[i][j] = Sc.nextInt();
            }  
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                 System.out.println(my_array[i][j] + " ");
            }
            System.out.println();
        }
        Sc.close();
        
        




        } 
    }


    