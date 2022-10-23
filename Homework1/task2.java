// Реализовать алгоритм пирамидальной сортировки (HeapSort) 
public class task2 {
    public void heapSort(int arr[]){
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            fold(arr, n, i);
 
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            fold(arr, i, 0);
        }
    }
     void fold(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2; 

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            fold(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {7, 18, 12, 0, 5, 5};
        int n = arr.length;

        task2 ob = new task2();
        ob.heapSort(arr);

        System.out.println("Отсортированный массив");
        printArray(arr);
    }
}
