import java.util.ArrayList;

import daa.InsertionSort;


public class Testmain implements Cloneable {

    public static void main(String[] args) {


        ArrayList<Integer> unsortedArray = new ArrayList<Integer>();

        unsortedArray.add(8);
        unsortedArray.add(7);
        unsortedArray.add(6);
        unsortedArray.add(5);
        unsortedArray.add(4);
        unsortedArray.add(0);
        unsortedArray.add(2);
        InsertionSort is = new InsertionSort(unsortedArray);

        System.out.println("---------Initial Unsorted Array---------");
        for(int i:InsertionSort.getInputArray()){
            System.out.print(i+" ");
        }

        is.sortGivenArray();

        System.out.println("\n------------Sorted Array------------");
        for(int i:InsertionSort.getInputArray()){
            System.out.print(i+" ");
        }
        }
}
