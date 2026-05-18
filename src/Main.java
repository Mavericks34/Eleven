//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void determineTheYear (int year) {
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " Год является високосным");
            } else {
                System.out.println(year + " Год не является високосным");
            }
        }
    }

    public static void definitionSystem (int clientOS, short clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегчённую версию для IOS по ссылке ...");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке ...");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложениядля Android по ссылке");
        } else {
            System.out.println("Неизвестная ошибка");
        }
    }

    public static void deliverDay(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка свыше 100 км невозможна.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        determineTheYear(2000);

        System.out.println("Task 2");
        int clientOS = 0;
        short currentYear = 2026;
        definitionSystem(clientOS, currentYear);

        System.out.println("Task 3");
        short deliveryDistance = 95;
        deliverDay(deliveryDistance);

    }
}



