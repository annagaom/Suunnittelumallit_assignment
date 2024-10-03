package Strategy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(1, 5, 7, 9, 3, 6, 2, 4, 8);

        while (true) {
            System.out.println("Choose a sorting algorithm: 1-Heap sort, 2-Quick sort, 3-Merge sort");
            System.out.println("1. Heap sort: ");
            System.out.println("2. Quick sort: ");
            System.out.println("3. Merge sort: ");

            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {

                case 1:

                    HeapSort heapSort = new HeapSort();
                    heapSort.sort(numbers);
                    System.out.println("Heap sort: " + numbers);
                    break;
                case 2:
                    QuickSort quickSort = new QuickSort();
                    quickSort.sort(numbers);
                    System.out.println("Quick sort: " + numbers);
                    break;
                case 3:
                    MergeSort mergeSort = new MergeSort();
                    mergeSort.sort(numbers);
                    System.out.println("Merge sort: " + numbers);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }
            System.out.println("=========================================");
        }
    }

}
