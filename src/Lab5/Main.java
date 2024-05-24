import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("task_1");
        Scanner scan = new Scanner(System.in);
        System.out.print("Сторона а=");
        double  a = scan.nextInt();
        System.out.print("Висота паралелограма b=");
        double  b = scan.nextInt();
        double S = area_of_square(a,b);
        System.out.println("Площа прямокутного трикутника дорівнює " + S + " квадратних одиниць");
    }

    public static double area_of_square(double a, double b) {
        return a * b;
    }

    public static void task2() {
        System.out.println("task_2");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть 1 число: ");
        int  num1 = scan.nextInt();
        System.out.print("Введіть 2 число: ");
        int  num2 = scan.nextInt();
        System.out.print("Введіть 3 число: ");
        int  num3 = scan.nextInt();
        int min = findMin(num1, num2, num3);
        System.out.println("Найменше число: " + min);
    }

    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void task3() {
        int[] arry = {5, 200, 29, -40, 100};
        System.out.println("task_3");
        System.out.print("Числа з масиву:");
        printarr(arry);
    }

    public static void printarr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
    public static void task4() {
        int[] array = {5, 200, 29, -40, 100};
        System.out.println(" ");
        System.out.println("task_4");
        int maxNumber = findMax(array);
        System.out.println("Найбільше число в масиві: " + maxNumber);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}




