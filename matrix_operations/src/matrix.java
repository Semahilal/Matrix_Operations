public class matrix {

    public static int[][] printMatrix(){

        //Creating array
        int array [][] = new int[4][4];

        //assign the values to the array
        for (int i=0;i<4;i++){
            for (int j=0; j<4;j++){

                //Creating random numbers
                array[i][j]=(int) (Math.random()*31);
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        return array;
    }


    public static void transpose(int [][] user){

        for (int i=0; i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(user[j][i] + "\t");
            }
            System.out.print("\n");
        }

    }

    public static void addition (int[][] user1, int [][] user2){
        for (int i =0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(user1[i][j] + user2[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }
    public static void subtraction (int[][] user1, int user2[][]){
        for (int i =0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(user1[i][j]-user2[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    public static void multiplication (int[][] user1, int user2[][]){
        for (int i =0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(user1[i][j]*user2[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        System.out.println("First Matrix : " + "\t");

        int [][] firstMatrix = printMatrix();
        System.out.println(firstMatrix);

        System.out.println("--------------------------");
        System.out.println("Transpose of first matrix :");
        transpose(firstMatrix);

        System.out.println("--------------------------");
        System.out.println("Second Matrix : " + "\t");

        int [][] secondMatrix = printMatrix();
        System.out.println(secondMatrix);

        System.out.println("----------------------------");
        System.out.println("Transpose of Second Matrix :");
        transpose(secondMatrix);

        System.out.println("--------------------------");
        System.out.println("Addition of two Matrices");
        addition(firstMatrix,secondMatrix);

        System.out.println("---------------------------");
        System.out.println("Subtraction of two Matrices");
        subtraction(firstMatrix,secondMatrix);

        System.out.println("---------------------------");
        System.out.println("Multiplication of two Matrices ");
        multiplication(firstMatrix,secondMatrix);

    }
}
