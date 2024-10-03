package Strategy;

import java.util.List;

// Merge sort is a divide-and-conquer algorithm that divides a list into two halves,
// sorts each half, and then merges the two halves.
public class MergeSort {
    public void sort(List<Integer> numbers) {
        if (numbers.size() > 1) {
            int mid = numbers.size() / 2;

            List<Integer> left = numbers.subList(0, mid);
            List<Integer> right = numbers.subList(mid, numbers.size());
            sort(left);
            sort(right);
            merge(numbers, left, right);
        }
    }

    // Merge the two halves, left and right, into a sorted data.
    private void merge(List<Integer> numbers, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                numbers.set(k++, left.get(i++));
            } else {
                numbers.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            numbers.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            numbers.set(k++, right.get(j++));
        }
    }
}
