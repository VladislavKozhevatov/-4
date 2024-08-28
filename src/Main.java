import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int age =17;
        if ( age >=18 ){
            System.out.println("Если возраст человека равен " + age +" ,то он совершеннолетний" );
        } else System.out.println("Если возраст человека равен " + age + " . Возраст совершеннолетия еще не наступил, нужно немного подождать");
        System.out.println();

        int temperature = 6;
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градусов . Холодно, нужно надеть шапку");
        } else System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        System.out.println();

        int speed = 70;
        if (speed <= 60){
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        } else
        System.out.println("Если скорость "+ speed + " то придется заплатить штраф");
        System.out.println();


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



    }
}