import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobiera oceny z przedmiotow
        System.out.println("Podaj oceny z chemii:");
        float[] ocenyChemia = ocenaDodaj(scanner);

        System.out.println("Podaj oceny z biologii:");
        float[] ocenyBiologia = ocenaDodaj(scanner);

        System.out.println("Podaj oceny z elektroniki:");
        float[] ocenyElektronika = ocenaDodaj(scanner);

        System.out.println("Podaj oceny z fizyki:");
        float[] ocenyFizyka = ocenaDodaj(scanner);

        // Oblicza srednia ocen ze wszystkich przedmiotow
        float sredniaChemia = sredniaOblicz(ocenyChemia);
        float sredniaBiologia = sredniaOblicz(ocenyBiologia);
        float sredniaElektronika = sredniaOblicz(ocenyElektronika);
        float sredniaFizyka = sredniaOblicz(ocenyFizyka);

        // Wyswietla srednie ocen z poszczegolnych przedmiotow
        System.out.println("Średnia ocen z chemii: " + sredniaChemia);
        System.out.println("Średnia ocen z biologii: " + sredniaBiologia);
        System.out.println("Średnia ocen z elektroniki: " + sredniaElektronika);
        System.out.println("Średnia ocen z fizyki: " + sredniaFizyka);

        // Oblicza medianę ocen z poszczególnych przedmiotów
        float medianaChemia = obliczMedianę(ocenyChemia);
        float medianaBiologia = obliczMedianę(ocenyBiologia);
        float medianaElektronika = obliczMedianę(ocenyElektronika);
        float medianaFizyka = obliczMedianę(ocenyFizyka);

        // Wyswietla medianę ocen z poszczegolnych przedmiotow
        System.out.println("Mediana ocen z chemii: " + medianaChemia);
        System.out.println("Mediana ocen z biologii: " + medianaBiologia);
        System.out.println("Mediana ocen z elektroniki: " + medianaElektronika);
        System.out.println("Mediana ocen z fizyki: " + medianaFizyka);

        scanner.close();
    }


    public static float[] ocenaDodaj(Scanner scanner) {
        System.out.println("Ile ocen chcesz wprowadzić?");
        int liczbaOcen = scanner.nextInt();

        float[] oceny = new float[liczbaOcen];

        for (int i = 0; i < liczbaOcen; i++) {
            float ocena;
            do {
                System.out.println("Podaj ocenę " + (i + 1) + ":");
                ocena = scanner.nextFloat();
                if (ocena <= 0 || ocena >= 6) {
                    System.out.println("Ocena musi być dodatnia i mniejsza od 6.");
                }
            } while (ocena <= 0 || ocena >= 6);
            oceny[i] = ocena;
        }

        // Wyświetla oceny z tablicy oraz ich sumę
        System.out.println("Oceny:");
        float suma = 0;
        for (float ocena : oceny) {
            System.out.print(ocena + " ");
            suma += ocena;
        }
        System.out.println("\nSuma ocen: " + suma);

        return oceny;
    }

    public static float sredniaOblicz(float[] oceny) {
        float suma = 0;

        for (float ocena : oceny) {
            suma += ocena;
        }

        return suma / oceny.length;
    }

    public static float obliczMedianę(float[] oceny) {
        Arrays.sort(oceny);
        int dlugosc = oceny.length;
        if (dlugosc % 2 == 0) {
            return (oceny[dlugosc / 2 - 1] + oceny[dlugosc / 2]) / 2;
        } else {
            return oceny[dlugosc / 2];
        }
    }
}