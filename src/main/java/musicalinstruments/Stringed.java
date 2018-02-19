package main.java.musicalinstruments;

import main.java.enam.Note;
import main.java.enam.Octave;

import java.util.Arrays;

/**
 * Created by Екатерина on 15.02.2018.
 */
public class Stringed extends DefiniteNoteInstrument {
    {
        this.setType("Stringed");
    }

    private int numberOfStrings;
    private Note[] tunings;

    /**
     * Конструктор
     * @param name название инструмента
     */
    public Stringed(String name) {
        super(name);
        switch (name.toLowerCase()){
            case("guitar"):{
                this.setMin(Note.E, Octave.GREAT);
                this.setMax(Note.D, Octave.THIRD);
                this.setMelody("Blink");
                numberOfStrings=6;
                tunings = new Note[numberOfStrings];
                tunings[0]=Note.E;
                tunings[1]=Note.B;
                tunings[2]=Note.G;
                tunings[3]=Note.D;
                tunings[4]=Note.A;
                tunings[5]=Note.E;
                break;
            }
            case("violin"):{
                this.setMin(Note.G, Octave.SMALL);
                this.setMax(Note.C, Octave.FOURTH);
                this.setMelody("Blink");
                numberOfStrings=4;
                tunings = new Note[numberOfStrings];
                tunings[0]=Note.E;
                tunings[1]=Note.A;
                tunings[2]=Note.D;
                tunings[3]=Note.G;

                break;
            }
            case("double bass"):{
                this.setMin(Note.E, Octave.CONTRA);
                this.setMax(Note.C, Octave.FIRST);
                this.setMelody("Blink");
                numberOfStrings=4;
                tunings = new Note[numberOfStrings];
                tunings[0]=Note.G;
                tunings[1]=Note.D;
                tunings[2]=Note.A;
                tunings[3]=Note.E;
                break;
            }
            default:{
                this.setMin(Note.C, Octave.FIRST);
                this.setMax(Note.B, Octave.FIRST);
                this.setMelody("Blink");
            }
        }
    }

    /**
     * Метод, возвращает количество струн
     * @return количество струн
     */
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    /**
     * Метод, устанавливает количество струн
     * @param numberOfStrings количество струн
     */
    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    /**
     * Метод, возвращает строй
     * @return строй
     */
    public String getTunings() {
        if (tunings == null) return "tunings are not defined";
        return Arrays.toString(tunings);
    }

    /**
     * Метод, устанавливает строй
     * @param tunings строй
     */
    public void setTunings(Note[] tunings) {
        this.tunings = tunings;
    }

    /**
     * Метод, устанавливает строй
     * @param strTunings строй
     */
    public void setTunings(String[] strTunings){
        tunings = new Note[strTunings.length];
        for (int i = 0; i < strTunings.length; i++ ){
            tunings[i] = Note.valueOf(strTunings[i]);
        }
    }
}
