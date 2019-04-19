import java.io.*;
import java.util.*;
public class Test{
public static void main(String[] args){
    int[] A = {5,6,8,9,1,2,3};
    System.out.println(Arrays.toString(A));
    InsertionSort(A);
    System.out.println(Arrays.toString(A));
}

public static void InsertionSort(int[] A){
    for(int j = 1; j < A.length; j++){
        int key = A[j];
        int i = j - 1;
        while(i > 1 && A[i] > key){
            A[i + 1] = A[i];
            i = i - 1;
        }
        A[i + 1] = key;
    }
}
}
