public class Main {
    public static void main(String[] args) {
        int age = 6;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
            } else if (age >=18 && age < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
                } else  if (age >= 24) {
                    System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Не задано условие");
        }
        int seatPlace = 105;
        if (seatPlace <= 60) {
            System.out.println("Доступны сидячие места");
            } else if (seatPlace > 60 && seatPlace <= 102) {
                System.out.println("Доступны только стоячие места");
                } else {
                    System.out.println("Свободных мест в вагоне нет");
        }
        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в школу");
        } else if (age >= 18 && age <24) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то ему пора ходить на работу");
        }
        if (age < 5) {
            System.out.println("Ребенок пока не может кататься на атракционах");
        } else if (age >=5 && age <14) {
            System.out.println("Ребенок может кататься на атракционе в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься самостоятельно");
        }
        int one = 5;
        int two = 7;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " наибольшее из трех чисел");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " наибольшее из трех чисел");
        } else {
            System.out.println("Число " + three + " наибольшее из трех чисел");
        }
        int clientOS = 0;
        int productionYear = 2015;
        if (clientOS == 0) {
            if (productionYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (productionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int year = 1900;
        int balance = year % 4;
        int oneHundred  = year % 100;
        int fourHundred = year % 400;
        if (fourHundred == 0) {
            System.out.println(year + " год является високосным");
        } else if (oneHundred == 0) {
            System.out.println(year + " год не является високосным");
        } else if (balance == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        int deliveryDistance = 95;
        int srok = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + srok);
        } else if (deliveryDistance >20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (srok+1));
        } else {
            System.out.println("Потребуется дней: " + (srok+2));
        }
        int monthNumber = 13;
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
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}