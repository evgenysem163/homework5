import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int clientOS = 0;
//        int clientOS1 = 1;
//        if (clientOS == 0) {
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        }if (clientOS1 ==1){
//            System.out.println("Установите версию приложения для Android по ссылке");
//
//        }
        //task2
//        int clientOS3 = 0;
//
//        int clientOS4 = 1;
//
//        int clientDeviceYear = 2015;
//        if (clientOS3 == 0) {
//            System.out.println("Установите версию приложения для iOS по ссылке");
//            int clientOsVersion1 = 2014;
//            if (clientOsVersion1 < clientDeviceYear) {
//                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//            }
//        }
//        if (clientOS4 == 1) {
//            System.out.println("Установите версию приложения для Android по ссылке");
//            int clientOsVersion2 = 2017;
//            if (clientOsVersion2 >= clientDeviceYear) {
//                System.out.println("Установите приложения для Android по ссылке");
//
//            }
//        }
        //task 3
        int x = 2021;
        if ( x % 400 == 0 && x % 100 == 0){
            System.out.println(x+" Год является високосным");
        }
        else if (x % 100 == 0){
            System.out.println(x+" Год не является високосным");
        }
         else if (x % 4 == 0){
            System.out.println(x+" Год является високосным");
        }
        else {
            System.out.println(x+" Год не является високосным");
        }
        // task4
        int a = 100;
        int b = 1;
        if (a == 20){
            System.out.println("Доставка составит "+b+" день");
        }
        else  if (a > 20 && a < 60){
            System.out.println("Доставка составит "+(b+b)+" дня");
        }
        else  if (a > 60 && a < 100){
            System.out.println("Доставка составит "+(b+b+b)+" дня");
        }
        else {
            System.out.println("Доставки нет");
        }
        //task5

    }

}
