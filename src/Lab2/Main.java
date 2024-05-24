import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4_1();
        task4_2();

    }
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("a=");
        int a = scan.nextInt();
        System.out.print("b=");
        int b = scan.nextInt();
        System.out.print("c=");
        int c = scan.nextInt();

        double x1, x2, D, KorD;
        D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Розвязків немає");
        } else {
            KorD = Math.sqrt(D);
            x1 = (-b + KorD) / a;
            x2 = (-b - KorD) / a;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть координату x: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть координату y: ");
        double y = scanner.nextDouble();

        int quadrant;

        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0; // якщо точка знаходиться на одній з координатних вісей або у початковій точці
        }
        if (quadrant != 0) {
            System.out.println("Точка знаходиться в квадранті " + quadrant);
        } else {
            System.out.println("Точка знаходиться на одній з координатних вісей або у початковій точці");
        }
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) { // Перевірка, чи є число двозначним
            if (number % 2 == 0) { // Перевірка, чи є число парним
                System.out.println("Число " + number + " є двозначним і парним.");
            } else {
                System.out.println("Число " + number + " є двозначним, але не парним.");
            }
        } else {
            System.out.println("Число не є двозначним.");
        }
    }
    public static void task4_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення x= ");
        double x = scanner.nextDouble();
        double f;
        if (x < -2) {
            f = 1 / Math.tan(x);
        } else if (x >= -2 && x <= 2) {
            f = 9 * Math.pow(x, 2);
        } else {
            f = Math.pow(Math.sin(x), 2);
        }
        System.out.println("f(x) = " + f);
    }

    public static void task4_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер місяця від 1 до 12 : ");
        AtomicInteger m_nomber = new AtomicInteger(scanner.nextInt());

        if ( m_nomber.get() == 1 || m_nomber.get() == 3 || m_nomber.get() == 5 || m_nomber.get() == 7 || m_nomber.get() == 8 || m_nomber.get() == 10 || m_nomber.get() == 12 ){
            System.out.println("у цьому місяці 31 день");
        }
        else if (m_nomber.get() == 4 || m_nomber.get() == 6 || m_nomber.get() == 9 || m_nomber.get() == 11) {
            System.out.println("у цьому місяці 30 днів");
        }
        else if (m_nomber.get() == 2) {
            System.out.println("у цьому місяці 29 днів");
        }

        else   {
            System.out.println("не коректне число");
        }

    }
}

