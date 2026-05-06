package LabArrays;



public class TesteArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = array1;

        array2[0] = 0;
        array2[2] = 2;
        array2[4] = 4;
        array2[6] = 6;

        System.out.print("<");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if ((i + 1) < array1.length) {
                System.out.print(", ");
            }
        }
        System.out.println(">");

        int[][] matriz = new int[5][];
        for(int i = 0; i < 5; i++){
            matriz[i] = new int[i];
        }

        for(int i = 0; i < 5; i++){
            System.out.print("<");
            for(int j = 0; j < i; j++){
                matriz[i][j] = (i * j);
                System.out.print(matriz[i][j]);
                if((j+1) < i){
                    System.out.print(", ");
                }
            }
            System.out.print(">");
            System.out.println();
        }
    }
}
