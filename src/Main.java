import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " . Возраст совершеннолетия еще не наступил, нужно немного подождать");}
            System.out.println();
//Задача 2
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов . Холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");}
            System.out.println();
//Задача 3
        int currentSpeed = 50;
        if (currentSpeed <= 60) {
            System.out.println("Если скорость " + currentSpeed + " можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + currentSpeed + " то придется заплатить штраф");}
        System.out.println();
//Задача 4
        int age3 = 19;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возраст человека равен " + age3 + " ,то ему нужно ходить в детский сад ");
        } else if (age3 >= 7 && age3 <= 17) {
            System.out.println("Если возраст человека равен " + age3 + " ,то ему нужно ходить в школу ");
        } else if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 + " ,то ему нужно ходить в университет ");
        } else {
            System.out.println("Если возраст человека равен " + age3 + " ,то ему нужно ходить на работу ");}
        System.out.println();
//Задача 5
        int age4 = 16;
        if (age4 < 5) {
            System.out.println("Если возраст ребенка равен " + age4 + " то ему нельзя кататься на аттракционе");
        } else if (age4 >= 5 && age4 < 14) {
            System.out.println("Если возраст ребенка равен " + age4 + " то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age4 + " то ему можно кататься на аттракционе без сопровождения взрослого");}
        System.out.println();
//Задача 6
        int nowinwagon = 130;
        int sitplace = 60;
        int stayplace = 42;
        if (nowinwagon <= sitplace) {
            System.out.println("В вагоне " + nowinwagon + " человек. Можно занять сидячее место");
        } else if (nowinwagon > 61 && nowinwagon <= 102) {
            System.out.println("В вагоне " + nowinwagon + " человек. Можно занять стоячее место");
        } else {
            System.out.println("В вагоне " + nowinwagon + " человек. Вагон полностью заполнен!");}
        System.out.println();
//Задача 7
        int one = 44;
        int two = 48;
        int three = 56;
        if (one > two && one > three) {
            System.out.println("Переменная ONE наибольшая");
        } else {
            if (two > one && two > three) {
                System.out.println("Переменная two наибольшая");
            } else {
                System.out.println("Переменная Three наибольшая");
                System.out.println();
            }
        }
    }
}