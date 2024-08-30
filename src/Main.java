import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int age =17;
        if ( age >=18 ){
            System.out.println("Если возраст человека равен " + age +" ,то он совершеннолетний" );
        } else System.out.println("Если возраст человека равен " + age + " . Возраст совершеннолетия еще не наступил, нужно немного подождать");
        System.out.println();
//Задача 2
        int temperature = 6;
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градусов . Холодно, нужно надеть шапку");
        } else System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        System.out.println();
//Задача 3
        int speed = 70;
        if (speed <= 60){
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        } else
            System.out.println("Если скорость "+ speed + " то придется заплатить штраф");
        System.out.println();
//Задача 4
        int age3 = 136;
        if (age3>=2 && age3<=6){
            System.out.println("Если возраст человека равен " +age3+ " ,то ему нужно ходить в детский сад ");}
        if (age3>=7 && age3<=17){
            System.out.println("Если возраст человека равен " +age3+ " ,то ему нужно ходить в школу ");}
        if (age3>=18 && age3<=24){
            System.out.println("Если возраст человека равен " +age3+ " ,то ему нужно ходить в университет ");}
        if (age3 > 24 ){
            System.out.println("Если возраст человека равен " +age3+ " ,то ему нужно ходить на работу ");}
        System.out.println();
//Задача 5
        int age4 = 13;
        if (age4<5){
            System.out.println("Если возраст ребенка равен " + age4 + " то ему нельзя кататься на аттракционе");}
        if (age4>=5 && age4<14){
            System.out.println("Если возраст ребенка равен " + age4 + " то ему можно кататься на аттракционе в сопровождении взрослого");}
        if (age4>14){
            System.out.println("Если возраст ребенка равен " + age4 +" то ему можно кататься на аттракционе без сопровождения взрослого");}
        System.out.println();
//Задача 6
        int nowinwagon = 30;
        int sitplace = 60;
        int stayplace = 42;
        if (nowinwagon <= sitplace){
            System.out.println("В вагоне " + nowinwagon + " человек. Можно занять сидячее место");}
        if (nowinwagon >stayplace && nowinwagon<=102)
            System.out.println("В вагоне "  + nowinwagon + " человек. Можно занять стоячее место");
        else {
            System.out.println("В вагоне "  + nowinwagon + " человек. Вагон полностью заполнен!");
            System.out.println();}
//Задача 7
        int one = 44;
        int two = 4;
        int three = 12;
        if (one> two && one> three){
            System.out.println("Переменная ONE наибольшая");}
        if (two>one && two>three){
            System.out.println("Переменная two наибольшая");}
        else {
            System.out.println("Переменная Three наибольшая");
            System.out.println();}

    }
}