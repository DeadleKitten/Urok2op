
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");

        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println(" Установите ерсию приложения для iOS по ссылке ");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015 ) {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println(" Установите версию приложения для Android по ссылке ");
            }

        }
        System.out.println("Задание 3");

        int year = 2025;

        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(" Год не может быть меньше 1585");
        }

        System.out.println(" Задание 4");

        int deliveryDistance = 50;
        int days = 0;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставки на такое расстояние нет.");
        }

        System.out.println("Потребуется дней: " + days);

        System.out.println("Задание 5");

        int monthNumber = 14;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Неверный номер месяца.");

        }


    }
}
