package Sortings;

public class BubbleSortTEst {
    public static void main(String[] args) {
        int[] arr = {5,9,22,14,4,4,5,3,12,5,6,8,6,66,886,54,86,99};

        print(arr);

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < (arr.length-i-1); j++) {
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("***");
        print(arr);

    }

    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
