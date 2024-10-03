package Strategy;

import java.util.List;

public class SelectionSort {

    public void sort(List<Integer> numbers) {
        // Loop through the list find minimum element and swap it with the first element
        for (int i = 0; i < numbers.size() - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the list
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j) < numbers.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element
            int temp = numbers.get(minIndex);
            numbers.set(minIndex, numbers.get(i));
            // Set the first element to the minimum element
            numbers.set(i, temp);
        }
    }
}
