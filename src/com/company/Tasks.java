package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Tasks {
    private static final Logger log = LoggerFactory.getLogger(Tasks.class);

    public void task1(int workingMode) throws FileNotFoundException {
        double x=0;
        double y=0;
        double result;

        System.out.println("Первая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите x ");
            x = scanner.nextInt();
            System.out.println("Введите y ");
            y = scanner.nextInt();
        } else {
            try {
                String path = "src/1taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                x = scanner.nextInt();
                System.out.println("Ввод x из файла, x=" + x);
                y = scanner.nextInt();
                System.out.println("Ввод y из файла, y=" + y);
                scanner.close();

            } catch (IOException e) {
                System.out.println("Файл не найден или не открываается" + e);
            }
        }

        result = ((46 * x + 34 * y + Math.sqrt(x) - Math.sqrt(x) * y + 12) / (Math.sqrt(x) + 35 * x + 34));
        log.debug("~какая-то подробная ифнормация по первой задаче~");
        System.out.println("Результат равен " + result);
    }


    public void task2(int workingMode) throws FileNotFoundException {
        int number = 0;
        int p = 1;

        System.out.println("Вторая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите четырёхзначное число ");
            number = scanner.nextInt();
        } else {
            try {
                String path = "src/2taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                number = scanner.nextInt();
                scanner.close();
                System.out.println("Ввод числа из файла, число равно " + number);

            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
            }
        }
        while (number > 0) {
            p *= number % 10;
            number = number / 10;
        }

        log.info("~какая-то подробная ифнормация по второй задаче~");
        System.out.println("Результат умножения цифр числа равен " + p);

    }

    public void task3(int workingMode) throws FileNotFoundException {
        double x = 0;
        double y = 0;
        double tmp;

        System.out.println("Третья задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите x ");
            x = scanner.nextDouble();
            System.out.println("Введите y ");
            y = scanner.nextDouble();
        } else {
            try {
                String path = "src/3taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                x = scanner.nextDouble();
                System.out.println("Ввод x из файла, x=" + x);
                y = scanner.nextDouble();
                System.out.println("Ввод y из файла, y=" + y);
                scanner.close();

            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
            }
        }
        if (x < y) {
            tmp = (x + y) / 2;
            y = x * y * 2;
            x = tmp;
        } else if (y < x) {
            tmp = (x + y) / 2;
            x = y * x * 2;
            y = tmp;
        } else {
            System.out.println("X и Y одинаковые");
        }
        System.out.println("X равен " + x + " Y равен " + y);
        log.warn("~какое-то предупреждение~");
    }

    public void task4(int workingMode) throws FileNotFoundException {
        double a, b;

        System.out.println("Четвёртая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextDouble();
            System.out.println("Введите b ");
            b = scanner.nextDouble();
        } else {
            try {
                String path = "src/4taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                a = scanner.nextDouble();
                System.out.println("Ввод a из файла, a=" + a);
                b = scanner.nextDouble();
                System.out.println("Ввод b из файла, b=" + b);
                scanner.close();
                // Первый корень уравнения
                System.out.println("x1 = 0");
                // Второй и третий корни уравнения
                scanner.close();
                if ((a != 0) && ((-b / a) > 0)) {
                    System.out.println("x2 = " + -(Math.sqrt(-b / a)));
                    System.out.println("x3 = " + Math.sqrt(-b / a));
                    log.error("~какая-то ошибка~");
                }
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
            }
        }
    }

    public void task5(int workingMode) throws FileNotFoundException {
        int number = 0;

        System.out.println("Пятая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число ");
            number = scanner.nextInt();
        } else {
            try {
                String path = "src/5taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                number = scanner.nextInt();
                System.out.println("Ввод из файла числa " + number);
                scanner.close();

            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
            }
        }
        if (number > -1 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public void task6(int workingMode) throws FileNotFoundException {
        int m = 0;
        int n = 0;
        boolean flag = false;

        String nString;
        String mString;

        System.out.println("Шестая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число m ");
            m = scanner.nextInt();
            System.out.println("Введите число n ");
            n = scanner.nextInt();
        } else {
            try {
                String path = "src/6taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                m = scanner.nextInt();
                System.out.println("Ввод из файла числa " + m);
                n = scanner.nextInt();
                System.out.println("Ввод из файла числa " + n);
                scanner.close();

            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
            }
        }
        mString = Integer.toString(m);
        nString = Integer.toString(n);

        for (int i = 0; i < mString.length(); i++) {
            for (int j = 0; j < nString.length(); j++) {
                if (mString.charAt(i) == nString.charAt(j)) {
                    System.out.println("Найдено совпадение");
                    flag = true;
                }
                if (flag == true) break;
            }
        }
        if (flag == false) {
            System.out.println("Совпадений нет");
        }
    }

    public void task7(int workingMode) throws FileNotFoundException {
        int n = 0;
        int k = 0;
        int sum = 0;

        System.out.println("Седьмая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число n ");
            n = scanner.nextInt();
            System.out.println("Введите число k ");
            k = scanner.nextInt();
        } else {
            try {
                String path = "src/7taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                n = scanner.nextInt();
                System.out.println("Ввод из файла числa n " + n);
                k = scanner.nextInt();
                System.out.println("Ввод из файла числa k " + k);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
            }
        }
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (i % k == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма всех n-значных чисел, кратных k " + sum);
    }

    public void task8(int workingMode) throws FileNotFoundException {
        int n = 0;
        int a = 0;
        int s = 0;
        int p = 1;

        System.out.println("Восьмая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число a ");
            a = scanner.nextInt();
            System.out.println("Введите число n ");
            n = scanner.nextInt();
        } else {
            try {
                String path = "src/8taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                a = scanner.nextInt();
                System.out.println("Ввод из файла числa n " + a);
                n = scanner.nextInt();
                System.out.println("Ввод из файла числa a " + n);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
            }
        }

        for (int i = 0; i < n; i++) {
            p = p * (a - s);
            s = s + n;
        }
        System.out.println("Произведение " + n + " членов ряда равно " + p);
    }
}
