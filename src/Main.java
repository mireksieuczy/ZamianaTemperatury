import java.util.Scanner;

//Zamiana temperatury: Napisz program, który zamieni podaną temperaturę w stopniach Celsiusza na stopnie Fahrenheit.
// Program powinien pobierać temperaturę od użytkownika i wyświetlać wynik.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj temperature w stopniach Celsiusza: ");
        double celsiusz = scanner.nextDouble();
        double wynik;
        wynik = (celsiusz * 9/5) + 32;
        System.out.println(wynik);

    }
}