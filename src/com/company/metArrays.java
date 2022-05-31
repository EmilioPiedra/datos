package com.company;
import java.util.Scanner;
public class metArrays {
    Scanner entrada;
    int [][] myMatriz;

    public metArrays( int n) {
        this.myMatriz = new int[n][n];
    }
    public  void showMatriz(){
        for (int i=0; i < myMatriz.length; i++) {
            System.out.print("|");
            for (int j=0; j < myMatriz[0].length; j++) {
                System.out.print (myMatriz[i][j]);
                if (j!=myMatriz[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}
