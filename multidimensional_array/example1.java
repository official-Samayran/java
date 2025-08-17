package multidimensional_array;

public class example1 {
    //main Method
    public static void main(String[] args){
        array();
    }

    public static void array(){
        int [][] matrix = new int [3] [2];
        System.out.println(matrix[2][1]);

        int [][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(matrix1 [2][0]);
    }
}
