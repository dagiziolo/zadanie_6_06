import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;

//        do {
//            System.out.println("Podaj liczbę");
//            x = scan.nextInt();
//            if (x < 100) {
//                System.out.println("Podana liczba jest za mała");
//            } else if (x > 200) {
//                System.out.println("Podana liczba jest za duża");
//            } else if (x % 3 != 0) {
//                System.out.println("Podana liczba nie jest podzielna przez 3");
//            } else {
//                System.out.println("Twoja liczba jest ok");
//                break;
//            }
//        } while (1==1); 

        System.out.println("Podaj liczbę");
        x = scan.nextInt();
        while (x < 100 || x > 200 || x % 3 != 0) {

            if (x < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (x > 200) {
                System.out.println("Podana liczba jest za duża");
            } else {
                System.out.println("Podana liczba nie jest podzielna przez 3");
            }
            System.out.println("Podaj liczbę");
            x = scan.nextInt();
        }
        System.out.println("Twoja liczba jest ok");
    }

}

