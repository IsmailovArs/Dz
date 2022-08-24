package com.comynyty;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(goWalk(12,30));
        System.out.println(goWalk(15,43));
        System.out.println(goWalk(14,34));
        System.out.println(goWalk(16,23));
        System.out.println(goWalk(17,26));
        System.out.println(goWalk(generateRandomAge(),31));


    }
    public static String goWalk(int age,int temprature ){
        if (age >=20 & age<=45 & temprature >=-20 & temprature <=30)
            return  "Mojno idty gulyat`";
        else if (age <20 & temprature >=0 & temprature <=28)
            return "Mojno idty gulyat`";
        else if(age >45 & temprature >=-10 & temprature <=25)
            return "Mojno idty gulyat`";
        else
            return "Ostavaytes` doma";
}
    public static int generateRandomAge() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min) + 1;
        System.out.println(randomNumber);
        return randomNumber;
    }
}