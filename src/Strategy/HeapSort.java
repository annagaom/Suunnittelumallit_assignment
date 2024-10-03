package Strategy;

import java.util.List;

public class HeapSort {
    // Metodi, joka lajittelee annetun listan käyttäen kekolajittelua
    public void sort(List<Integer> numbers) {
        int n = numbers.size(); // Listan koko

        // Rakenna kekojärjestelmä (rakennetaan max-heap)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(numbers, n, i); // Kutsutaan heapify jokaiselle puun osalle

        // Yksi kerrallaan poimitaan elementti keosta
        for (int i = n - 1; i >= 0; i--) {
            // Vaihdetaan nykyinen juuri (suurin arvo) loppuun
            int temp = numbers.get(0); // Juuri (suurin)
            numbers.set(0, numbers.get(i)); // Siirretään loppupäähän
            numbers.set(i, temp); // Laitetaan suurin loppuun

            // Kutsutaan max-heapify jäljellä olevaan osaan kekoa
            heapify(numbers, i, 0);
        }
    }

    // Metodi, joka järjestää annetun osapuun niin, että se täyttää max-heapin ehdot
    // i on juurisolmu, n on keon koko
    void heapify(List<Integer> numbers, int n, int i) {
        int largest = i; // Oletetaan, että juurisolmu on suurin
        int left = 2 * i + 1; // Vasen lapsi = 2*i + 1
        int right = 2 * i + 2; // Oikea lapsi = 2*i + 2

        // Jos vasen lapsi on suurempi kuin juurisolmu
        if (left < n && numbers.get(left) > numbers.get(largest))
            largest = left;

        // Jos oikea lapsi on suurempi kuin suurin tähän mennessä
        if (right < n && numbers.get(right) > numbers.get(largest))
            largest = right;

        // Jos suurin ei ole juurisolmu, vaihdetaan suurin juuren kanssa
        if (largest != i) {
            int swap = numbers.get(i);
            numbers.set(i, numbers.get(largest));
            numbers.set(largest, swap);

            // Kutsutaan rekursiivisesti heapify, jotta varmistetaan, että alipuukin täyttää keon ehdot
            heapify(numbers, n, largest);
        }
    }
}
