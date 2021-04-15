/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_dan_searching;

/**
 *
 * @author Prisma Alamsyah
 */
public class kelas_2a_insertion_sort {
    public static void insertionsort(int[] A) {
        for (int i =1 ; i < A.length; i++){
            int key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)){
                
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
        
    }
    
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int A[] = {3, 10, 4, 2, 8, 13};
        kelas_2a_insertion_sort.tampil(A);
        kelas_2a_insertion_sort.insertionsort(A);
        kelas_2a_insertion_sort.tampil(A);
        
        
    }
}
