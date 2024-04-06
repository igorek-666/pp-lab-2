import java.util.Scanner;

public class main {

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

        // wyswietla srednie ocen z poszczegolnych przedmiotow
        System.out.println("Średnia ocen z chemii: " + sredniaChemia);
        System.out.println("Średnia ocen z biologii: " + sredniaBiologia);
        System.out.println("Średnia ocen z elektroniki: " + sredniaElektronika);
        System.out.println("Średnia ocen z fizyki: " + sredniaFizyka);

        scanner.close();
    }


    public static float[] ocenaDodaj(Scanner scanner) {
        System.out.println("Ile ocen chcesz wprowadzić?");
        int liczbaOcen = scanner.nextInt();

        float[] oceny = new float[liczbaOcen];

        for (int i = 0; i < liczbaOcen; i++) {
            System.out.println("Podaj ocenę " + (i + 1) + ":");
            oceny[i] = scanner.nextFloat();
        }

        return oceny;
    }
//
    public static float sredniaOblicz(float[] oceny) {
        float suma = 0;

        for (float ocena : oceny) {
            suma += ocena;
        }

        return suma / oceny.length;
    }
}