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
public class kelas_2d_selection_sort {
    public static void selectionsort(int[] A) {
        int smallindex;
        int pass, j, n = A.length;
        int temp;
        
        for (pass = 0; pass < n - 1; pass++){
            smallindex = pass;
            for (j = pass + 1; j < n; j++){
                if (A[j] < A[smallindex]){
                    smallindex = j;
                }
            }
            
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        kelas_2d_selection_sort.tampil(A);
        kelas_2d_selection_sort.selectionsort(A);
        kelas_2d_selection_sort.tampil(A);
    
}
}
