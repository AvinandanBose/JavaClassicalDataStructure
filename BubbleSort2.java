public class BubbleSort2 {
    int arr[];

    BubbleSort2(int arr[]) {
        this.arr = arr;
        bubbleSort(arr);
        for (int i = 0; i < arr.length - 1; i++){
            System.out.println(arr[i]);
        }
    }

    void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - i) - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 3, 2, 20, 1, 8};
        BubbleSort2 b = new BubbleSort2(arr);
    }
}
