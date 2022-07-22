package ex5;

import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {

        Random rd = new Random();
        int dice1 = rd.nextInt(6);
        int dice2 = rd.nextInt(6);
        int dice3 = rd.nextInt(6);

        int sumDice = dice1+dice2+dice3 ;
        System.out.println("ผลรวมลูกเต๋า: "+sumDice);
        if (sumDice < 11){
            System.out.println("Low");
        } else if (sumDice > 11) {
            System.out.println("High");

        }else {
            System.out.println(" Eleven");
        }

    }
}
