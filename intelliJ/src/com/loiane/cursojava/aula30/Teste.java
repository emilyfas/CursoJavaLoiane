package com.loiane.cursojava.aula30;

public class Teste {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Rodando");
        System.out.println("ans: " + search(arr, target));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int searchLeft = binarySearch(nums, target, 0, pivot);
        if (searchLeft >= 0) {
            return searchLeft;
        }

        return binarySearch(nums, target, (pivot + 1), (nums.length - 1));
    }

    static int findPivot(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(mid != 0 && array[mid] > array[mid + 1]){
                return mid;
            }else if(array[mid] > start){
                start = mid;
            }else if(array[mid] < start){
                end = mid-1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
