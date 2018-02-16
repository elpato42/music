package main.java;

import java.util.Scanner;

/**
 * Created by Екатерина on 15.02.2018.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Let`s create an orchestra! It would be fun");
        System.out.println("First thing is rhythm for any music");
        System.out.println("Let`s make a drum first");
        Instrument drum = new PercussionWithoutDefiniteNote("drum");
        System.out.println("Okay, the drum is ready. Let`s listen to it");
        drum.play();
        System.out.println("Sounds not really like drum, yeah? Would you like to change it? ");
        Scanner in = new Scanner(System.in);
        String answer = in.next();
        if (answer.equals("yes")){
            System.out.println("So, what should it play? ");
            answer = in.next();
            drum.setMelody(answer);
        }
        drum.play();

        System.out.println("Let's create violin and double bass");
        Stringed violin = new Stringed("violin");
        Stringed doubleBass =new Stringed("double bass");
        System.out.println("Let`s check which instrument is lower");
        if(doubleBass.isLowerThen(violin) == true){
            System.out.println(String.format("%s is lower then %s", doubleBass.getName(), violin.getName()));
        } else {
            System.out.println(String.format("%s is lower then %s", violin.getName(), doubleBass.getName()));
        }
        drum.play();
        violin.play();
        doubleBass.play();
        System.out.println();
    }
}
