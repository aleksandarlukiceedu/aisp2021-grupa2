package recursion;

import java.util.Random;

public class Program {

    public static int factorial(int n){

        if (n == 0){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static int sumN(int n){

        if(n == 0){
            return 0;
        }

        return n + sumN(n-1);
    }

    public static int sum(int[] array){
        return sumRecursive(array, array.length);
    }

    public static int sum2(int[] array){
        return sumBinaryRecursion(array, 0, array.length-1);
    }


    public static int sumRecursive(int[] array, int n){
        if(n <= 0){
            return 0;
        }

        return array[n-1] + sumRecursive(array, n - 1);
    }

    public static int sumBinaryRecursion(int[] array, int low, int high){
        if(low > high){
            return 0;
        }
        else if (low == high){
            return array[low];
        }
        else{
            int mid = (low + high)/2;
            return sumBinaryRecursion(array, low, mid) + sumBinaryRecursion(array, mid+1, high);
        }
    }

    public static int find(int[] array, int target){
        return binarySearch(array, target, 0, array.length-1);
    }

    public static int binarySearch(int[] array, int target, int low, int high){
        if(low > high){
            return -1;
        }

        int mid = (low + high)/2;

        if(target == array[mid]) {
            return mid;
        }
        else if(target < array[mid]){
            return binarySearch(array, target, low, mid-1);
        }
        else{
            return binarySearch(array, target, mid+1, high);
        }
    }


    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(sumN(10));

//        Random rnd = new Random();
//        int[] niz = new int[1000000000];
//
//        for (int i = 0; i < niz.length; i++) {
//            niz[i] = rnd.nextInt();
//        }
//
//        System.out.println(sum2(niz));

        int[] niz = {1,2,3,4,5,6};

        System.out.println(find(niz, 10));
    }
}
