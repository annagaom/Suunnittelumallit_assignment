package Strategy;
import java.util.List;

public class QuickSort {
    // Päämetodi, joka laittaa numerot järjestykseen
    public void sort(List<Integer> numbers) {
        quickSort(numbers, 0, numbers.size() - 1); // Kutsutaan rekursiivista quickSort-metodia
    }

    // Rekursiivinen quickSort-metodi, joka jakaa listan osiin
    private void quickSort(List<Integer> numbers, int low, int high) {
        if (low < high) {
            // Erota lista osiin ja saa pivotin indeksi
            int pi = partition(numbers, low, high);

            // Jatka lajittelua vasemmalle ja oikealle puolelle pivotia
            quickSort(numbers, low, pi - 1); // Lajittele vasen puoli
            quickSort(numbers, pi + 1, high); // Lajittele oikea puoli
        }
    }

    // Metodi, joka jakaa listan ja järjestää sen pivotin ympärille
    private int partition(List<Integer> numbers, int low, int high) {
        int pivot = numbers.get(high); // Valitse pivot (tässä tapauksessa oikean reunan alkio)
        int i = (low - 1); // Indeksi, johon suuremmat alkiot siirretään

        // Käy läpi lista ja vertaile alkioita pivotin kanssa
        for (int j = low; j < high; j++) {
            if (numbers.get(j) <= pivot) {
                i++;

                // Vaihda nykyinen alkio ja alkio, johon i viittaa
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j, temp);
            }
        }

        // Siirrä pivot oikeaan paikkaan
        int temp = numbers.get(i + 1);
        numbers.set(i + 1, numbers.get(high));
        numbers.set(high, temp);

        return i + 1; // Palauta pivotin uusi indeksi
    }
}
