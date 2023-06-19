import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        //task4();
        //task5();
    }

    private static void task5() {
        String str = "Добро пожаловать на курс по Java";
        String[] Arr = str.split(" ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = Arr[-(i + 1)];
        }
        System.out.println(Arr);

    }



    private static void task4() {
        System.out.println("\n\nЗадано выражение: 3? + ?5 = 69. Восстановить выражение до верного равенства.");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    count += 1;
                    System.out.println(count + ") 2" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {System.out.println("Решений нет\n");}
    }



    private static void task3() {
        double num1;
        double num2;
        double res;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\n Введите действие (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.printf("Неверное действие!");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + res);
    }



    private static void task2() {
        int number = 1000;
        for (int i = 3; i <= number; i++) {
            Boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime)
                System.out.println(i);
        }
    }



    private static void task1() {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
