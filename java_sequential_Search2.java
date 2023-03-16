public class java_sequential_Search2 {

    //Sequential Search Through Recursion


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = 10;
        int index = sequentialSearch(arr, search, 0);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    public static int sequentialSearch(int[] arr, int search, int i) {
        if (i < arr.length) {
            if (arr[i] == search) {
                return i;
            } else {
                return sequentialSearch(arr, search, i + 1);
            }
        } else {
            return -1;
        }
    }
    
}
