import java.util.Scanner;

public class search_1{
    public static void main(String[] arg){
        Scanner Sc = new Scanner(System.in);
        int rows = Sc.nextInt();
        int cols = Sc.nextInt();
        
        int[][] numbers = new int[rows][cols];
        
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                numbers[i][j] = Sc.nextInt();
               
            }
        } 
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println(numbers[i][j] + " ");
            }
        }

        System.out.println("enter the number you want to search:");

        //take number from user to search and find its indexes
        int x = Sc.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                //compares array with entered number named X
                if(numbers[i][j]==x){
                    System.out.println("Location of "+ x +" is (" + i +","+ j +")");
                }
            }
        }





        Sc.close();





    }
}