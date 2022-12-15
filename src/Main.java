import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //Задание 1
    public static void definesLeapYear(int yearUsed) {
        if (yearUsed % 4 == 0 && yearUsed % 100 != 0 || yearUsed % 400 == 0) {
            System.out.println(yearUsed + " - висоскосный год");
        } else {
            System.out.println(yearUsed + " - не високосный год");
        }
    }

    //Задание 2
     static String findOutTheVersion(int versionOS) {
        if (versionOS == 0) {
            return "IOS";
        } else if (versionOS == 1) {
            return "Android";
        }
        return "Error";
    }
    public static boolean thisYear(int year) {
        int clientDeviceYear = LocalDate.now().getYear();
        return year >= clientDeviceYear;
    }
    public static void printTheApplicationVersionForASpecificOS(int versionOS, int year) {
        if(thisYear(year)) {
            System.out.println("Установите обычную версию приложения  для " + findOutTheVersion (versionOS));
        }else {
            System.out.println("Установите lite-версию приложения  для " + findOutTheVersion(versionOS));
        }
    }

    //Задание 3
    public static void printingTheDeliveryTimeCalculation(int deliveryDistance) {
       if (deliveryDistance > 0 && deliveryDistance < 2000)
        System.out.println("Потребуется дней " + (1 + (deliveryDistance + 20) / 40));
    }

    public static void task1() {
        //Задание 1
        System.out.println("Задание 1");
        definesLeapYear(2022);
    }

    public static void task2() {
        //Задание 2
        System.out.println("Задание 2");
        printTheApplicationVersionForASpecificOS(1, 2022);
    }

    public static void task3() {
        //Задание 3
        System.out.println("Задание 3");
        printingTheDeliveryTimeCalculation(56);
        printingTheDeliveryTimeCalculation(123);
        printingTheDeliveryTimeCalculation(1900);
        printingTheDeliveryTimeCalculation(233);
        printingTheDeliveryTimeCalculation(655);
    }
}