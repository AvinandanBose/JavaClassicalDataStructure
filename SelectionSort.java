public class SelectionSort {
    void selectionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int min = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[]args){
        int arr[]={25,30,1,2,5,4,6,20,31,36};
        SelectionSort s = new SelectionSort();
        s.selectionSort(arr);
        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
