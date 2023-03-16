public class java_sequential_Search {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = 5;
        int index = sequentialSearch(arr, search);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    public static int sequentialSearch(int[] arr, int search) {
        int i = 0;
        while(i < arr.length & arr[i] != search) {
            i++;
        }

        if (i < arr.length) {
            return i;
        } else {
            return -1;
        }
    }
    
}
