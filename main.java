import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Podaj liczbę przedmiotów: ");
        int liczbaPrzedmiotow = scanner.nextInt();

        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            // Pobranie nazwy przedmiotu
            System.out.printf("Podaj nazwę przedmiotu %d: ", i + 1);
            String nazwaPrzedmiotu = scanner.next();

            
            System.out.printf("Podaj liczbę ocen dla przedmiotu %s: ", nazwaPrzedmiotu);
            int liczbaOcen = scanner.nextInt();

            
            float[] oceny = new float[liczbaOcen];

            // Pobranie ocen
            for (int j = 0; j < liczbaOcen; j++) {
                System.out.printf("Podaj ocenę %d dla przedmiotu %s: ", j + 1, nazwaPrzedmiotu);
                oceny[j] = scanner.nextFloat();
            }

            // Obliczenie średniej
            float suma = 0;
            for (float ocena : oceny) {
                suma += ocena;
            }
            float srednia = suma / oceny.length;

            
            System.out.println("Przedmiot: " + nazwaPrzedmiotu);
            System.out.println("Liczba ocen: " + liczbaOcen);
            System.out.printf("Średnia: %.2f\n", srednia);
        }
    }
}