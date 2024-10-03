package Strategy;

import java.util.List;

public class BubbleSort {
    public void sort(List<Integer> numbers) {
        // Loop through the list and compare adjacent elements
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                // Swap if the element is greater than the next element
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }
}
