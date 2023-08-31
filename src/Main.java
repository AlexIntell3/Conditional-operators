public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("Задание 2");
        int clientOs = 0;
        int clientDeviceYear = 2013;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }

        System.out.println("Задание 3");
        int year = 2021;
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0 && year > 1584) {
            System.out.println("Год является високосным.");
        } else {
            System.out.println("Год не является високосным");
        }

        System.out.println("Задание 4");
        int deliveryDistance = 21;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        }
        if (deliveryDistance > 20 && deliveryDistance < 61) {
            System.out.println("Потребуется дней: 2 ");
        }
        if (deliveryDistance > 60 && deliveryDistance < 101) {
            System.out.println("Потребуется дней: 3");
        }
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет.");
        }

        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case(12):
            case(1):
            case(2):
                System.out.println("Это зима.");
                break;
            case(3):
            case(4):
            case(5):
                System.out.println("Это весна.");
                break;
            case(6):
            case(7):
            case(8):
                System.out.println("Это лето.");
                break;
            case(9):
            case(10):
            case(11):
                System.out.println("Это осень.");
                break;
            default:
                System.out.println("Такого номера месяца не существует !");
        }
    }
}