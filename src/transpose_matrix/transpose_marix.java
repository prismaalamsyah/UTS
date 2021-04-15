/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpose_matrix;

import java.util.Scanner;

/**
 *
 * @author Prisma Alamsyah
 */
public class transpose_marix {
    public static void main(String[] args) {
        int i, j, m, n;
        int matrix [][] = new int [10][10];
        int transpose [][] = new int [10][10];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Jumlah Baris Matrix : ");
        m = input.nextInt();
        System.out.println("Masukan Jumlah Kolom Matrix : ");
        n = input.nextInt();
        System.out.println("Masukan Elemen Matrix : ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                matrix[i][j] = input.nextInt(); 
            }
            System.out.println();
        }
        System.out.println("Hasil Matrix : ");
        for(i = 0; i < matrix.length; i++){
            for(j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t"); 
            }
            System.out.println();
        }
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Hasil Transpose Matrix : ");
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}