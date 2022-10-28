//Реализовать алгоритм сортировки вставками

package Homework2;

public class work{
    public static void sorting(int[] arrSort) {
        int j;
        for (int i = 1; i < arrSort.length; i++) {
            int change = arrSort[i];
            for (j = i; j > 0 && change < arrSort[j - 1]; j--) {
                arrSort[j] = arrSort[j - 1];
            }
            arrSort[j] = change;
        }
    }

public static void main(String args[]) {
    int[] arrSort = {34, 0, 31, 5, -13, 7};
    sorting(arrSort);
    for(int i = 0; i < arrSort.length; i++){
        System.out.print(arrSort[i] + "\n");
    }
}
}