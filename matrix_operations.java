import java.util.Scanner;;

public class matrix_operations{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu;
        
        do{
        System.out.println("---------- MATRIX MENU ----------");
        System.out.println("1. Addition \n2. Subtraction \n3. multiplication \n4. Exit");
        System.out.println("---------------------------------\n");
        System.out.print("Enter the matrix operation to be performed: ");
        menu = s.nextInt();

        switch(menu){
            case 1: 
            addition();
            break;
            case 2: 
            subtraction();
            break;
            case 3:
            multiplication();
            break;
            case 4:
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice. Try again");
            break;
        }

        }while(menu !=4);
    }

    public static int addition() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of matrix 1: ");
        int row1 = s.nextInt();
        int col1 = s.nextInt();

        System.out.print("Enter the number of rows and columns of matrix 2: ");
        int row2 = s.nextInt();
        int col2 = s.nextInt();

        if(row1 != row2 || col1 != col2) {
            System.out.println("invalid");
            return 0;
        }

        int [][] mat1 = new int [row1][col1];
        int [][] mat2 = new int [row2][col2];
        int [][] result = new int [row1][col1];

        System.out.println("Enter elements of matrix 1: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1 [i][j] = s.nextInt();                
            }
        }

        System.out.println("Enter elements of matrix 2: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2 [i][j] = s.nextInt();                
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("result: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        return 1;
    }

    public static int subtraction(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of matrix 1: ");
        int row1 = s.nextInt();
        int col1 = s.nextInt();

        System.out.print("Enter the number of rows and columns of matrix 2: ");
        int row2 = s.nextInt();
        int col2 = s.nextInt();

        if(row1 != row2 || col1 != col2) {
            System.out.println("invalid");
            return 0;
        }

        int [][] mat1 = new int [row1][col1];
        int [][] mat2 = new int [row2][col2];
        int [][] result = new int [row1][col1];

        System.out.println("Enter elements of matrix 1: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1 [i][j] = s.nextInt();                
            }
        }

        System.out.println("Enter elements of matrix 2: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2 [i][j] = s.nextInt();                
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }

        System.out.println("result: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        return 1;
    }

    public static int multiplication(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of matrix 1: ");
        int row1 = s.nextInt();
        int col1 = s.nextInt();

        System.out.print("Enter the number of rows and columns of matrix 2: ");
        int row2 = s.nextInt();
        int col2 = s.nextInt();

        if(row1 != col2) {
            System.out.println("invalid");
            return 0;
        }

        int [][] mat1 = new int [row1][col1];
        int [][] mat2 = new int [row2][col2];
        int [][] result = new int [row1][col2];

        System.out.println("Enter elements of matrix 1: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1 [i][j] = s.nextInt();                
            }
        }

        System.out.println("Enter elements of matrix 2: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2 [i][j] = s.nextInt();                
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("result: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        return 1;
    }
}