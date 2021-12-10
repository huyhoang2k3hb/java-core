package lesson3;

import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[] B = {2,5,7,8};
        int length = A.length + B.length;
        int[] C  = new int[length];
        int j = 0;
        //Ghép 2 mảng
        for (int i=0; i< A.length; i++){
            C[j] =A[i];
            j++;
        }
        for (int i=0; i< B.length; i++) {
            C[j] = B[i];
            j++;
        }
        //Sắp xếp 2 mảng
        for (int i=0; i< C.length; i++) {
            for (int a = i+1; a< C.length; a++) {
                if (C[i] > C[a]) {
                        int tam = C[i];
                        C[i] = C[a];
                        C[a] = tam;
                }
            }
            System.out.print(C[i]);
        }
    }
}

