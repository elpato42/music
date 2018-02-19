package main.java.musicalinstruments;

import main.java.enam.MethodOfSoundProduction;

import javax.swing.*;
import java.util.Scanner;
import java.util.function.BinaryOperator;

/**
 * Created by Екатерина on 15.02.2018.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Let`s create an orchestra! It would be fun");
        System.out.println("First thing is rhythm for any music");
        System.out.println("Let`s make a drum first");
        Instrument drum = new PercussionWithoutDefiniteNote("drum");
        ((PercussionWithoutDefiniteNote)drum).setMethodOfSoundProduction("MEMBRANOPHONE");
        System.out.println("Okay, the drum is ready. Let`s listen to it");
        drum.play();
        System.out.println("Sounds not really like drum, yeah? Would you like to change it? ");
        Scanner in = new Scanner(System.in);
        String answer = in.next();
        if (answer.equals("yes")){
            System.out.println("So, what should it play? I advice a 'Bum' sound");
            answer = in.next();
            drum.setMelody(answer);
        }
        drum.play();

        System.out.println("Let's create violin and double bass");
        Stringed violin = new Stringed("violin");
        Stringed doubleBass =new Stringed("double bass");
        System.out.println("Let`s check which instrument is lower");
        if(doubleBass.isLowerThen(violin)){
            System.out.println(String.format("%s is lower then %s", doubleBass.getName(), violin.getName()));
        } else {
            System.out.println(String.format("%s is lower then %s", violin.getName(), doubleBass.getName()));
        }
        drum.play();
        violin.play();
        doubleBass.play();
        System.out.println("What a nice music we have made!");

        System.out.println();
        Instrument [] orchestra = new Instrument[7];
        orchestra[0] = new Stringed("violin");
        orchestra[1] = new PercussionWithDefiniteNote("vibraphone");
        orchestra[2] = drum;
        orchestra[3] = new Stringed("ukulele");
        orchestra[4] = new Wind("oboe");
        orchestra[5] = new PercussionWithoutDefiniteNote("triangle");
        orchestra[6] = new Stringed("double bass");
        for (Instrument e: orchestra
             ) {
            System.out.println(e.toString() + ":");
            e.play();

            if(e instanceof Percussion){
                System.out.println("Method of sound production is " + ((Percussion) e).getMethodOfSoundProduction());
            }


            if(e instanceof DefiniteNoteInstrument ){
                if(e instanceof Stringed){
                    System.out.println(((Stringed) e).getTunings());
                }

                if(e instanceof Wind){
                    System.out.println("Material is " + ((Wind) e).getMaterial());
                }

                System.out.println("Lower note is " + ((DefiniteNoteInstrument)e).getMinToString());
                System.out.println("Higher note is " +  ((DefiniteNoteInstrument)e).getMaxToString());
            }

            System.out.println();
        }
    }
}
