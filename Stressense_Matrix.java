import java.util.Scanner;

public class Stressense_Matrix {
    int row,col,i,j;
//    int arr[][];
    Scanner sc= new Scanner(System.in);
    int arr[][]=new int[100][100];
//    int arr2[][]=new int[100][100];
    public void Input_Method(){
        System.out.println("Enter Number of Row and Column : ");
        row=sc.nextInt();
        col=sc.nextInt();

        System.out.println("Enter Element of Given matrix: ");
        for (i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public void Output_Method(){
        System.out.println("Matrix of Given Row and Column : ");

        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void Multiplication_Method(){

        System.out.println("Square of Whole Matrix: ");

        for  (i=0; i<row; i++ ){
            for (j=0; i<col; j++ ){
                System.out.print(arr[i][j]*arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stressense_Matrix object = new Stressense_Matrix();
        object.Input_Method();
        object.Output_Method();
        try {
            object.Multiplication_Method();
        }
        catch(Exception e){
//            e.printStackTrace();
            System.err.println("Some Error Ocuure please fix it "+e );
        }
    }
}
