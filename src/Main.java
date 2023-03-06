public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int sam = 15000;
        int contribution = 0;
        int month = 1;
        while (contribution < 2_459_000) {
            contribution = contribution + sam;
            System.out.println("Месяц " + month++ + " сумма накоплений равна " + contribution + " рублей");
        }
        System.out.println(contribution);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number++ + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int countryY = 12_000_000;
        int death = 8;
        int birth = 17;
        int year = 1;
        while (year <= 10) {
            int forYear = (birth - death) * countryY / 1000;
            countryY = countryY + forYear;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
            year++;
        }
        System.out.println(countryY);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15000;
        double total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + sum;
            System.out.println("Месяц " + i + " Итого " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15000;
        double total = 0;
        int month = 0;
        for (; total < 12_000_000; month++) {
            total = total + total / 100 * 7;
            total = total + sum;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + total);
            }
        }
        System.out.println(total);
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum = 15000;
        int total = 0;
        int month = 1;
        for (; month <= 9 * 12; month++) {
            total = total + total / 100 * 7;
            total = total + sum;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + total);
            }
        }
//        System.out.println(total);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int fridayFirst = 6;
        for (int i = fridayFirst; i <= 31; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int yearStart = year - 200;
        for (int i = 0; i < year + 100; i = i + 79) {
            if (yearStart < i) {
                System.out.println(i);
            }

        }
    }
}




