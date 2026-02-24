import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Program to add two matrics of (2*3) size   ");
        int [][] marks = {{12, 13, 14},
                         {15, 16, 17}
            };
        int [][] marks1= {{16, 17, 17},
                {17, 18, 19}};

        int [][] result= new int[2][3];

for(int i = 0 ; i < 2; i++){
    for(int j = 0 ; j < 3 ; j++){
        result[i][j] = marks[i][j]+marks1[i][j];
    }
}
        System.out.println("Sum of matrices is ");
for(int i = 0 ; i< 2 ; i++){
    for(int j = 0 ; j< 3 ; j++){
        System.out.print(result[i][j]+ " ");
    }
    System.out.println();
}




    }
}




