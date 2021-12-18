




import java.util.Random;
import java.util.Scanner;



public class Solution
{
    public static void main(String[] args)
    {
        // 2. Fer un programa que llegeixi dos números n i m per teclat, crei una matriu d'enters de tamany n files i m columnes, la ompli de números aleatoris i l'escrigui per pantalla.
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce numero de filas");
        int filas =teclado.nextInt();

        System.out.println("Introduce numero de columnas");
        int columnas =teclado.nextInt();

        int[][] a = new int [filas][columnas];

        for (int i =0 ;i<filas;i++){
            for(int j=0;j<columnas;j++) {
                System.out.println("Introduce valores para la matriz["+i+"]["+j+"]");
                a[i][j]= teclado.nextInt();
            }
        }

        for (int i =0 ;i<filas;i++){
            for(int j=0;j<columnas;j++) {
                System.out.print(" " + a[i][j] +" ");

            }
            System.out.println();
        }

    }
}
