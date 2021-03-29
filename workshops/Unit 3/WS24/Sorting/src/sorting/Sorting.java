package sorting;

public class Sorting {

    public static void main(String[] args) {

        System.out.println("===== Kevin Andres Guairacaja ======");

        int[] integersToSort = {9, 7, 1, 6, 2, 3};
        System.out.println("Unsorted integers");
        printArray(integersToSort);
        BubbleSort.sortByBubbleSort(integersToSort);
        System.out.println("");
        printArray(integersToSort);

        int[] integersToSort2 = {8, 1, 7, 2, 5};
        System.out.println("\nUnsorted integers");
        printArray(integersToSort2);
        BubbleSort.sortByBubbleSort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);

        integersToSort2 = new int[]{5, -5, -6, 1, 7};
        System.out.println("\nUnsorted integers");
        printArray(integersToSort2);
        BubbleSort.sortByBubbleSort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);

        SelectionSort selectionSort = new SelectionSort();
        integersToSort2 = new int[]{42, 30, -5, 7, 1, 50};
        System.out.println("\nSorting integers by SELECTION SORT");
        printArray(integersToSort2);
        int[] sortedArray = selectionSort.sort(integersToSort2);
        System.out.println("");
        printArray(sortedArray);

    }


    public static void printArray(int[] integers) {
        int n = integers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }

}