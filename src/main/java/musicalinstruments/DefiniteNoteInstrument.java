package main.java.musicalinstruments;

import javafx.util.Pair;
import main.java.enam.Note;
import main.java.enam.Octave;

/**
 * Created by Екатерина on 15.02.2018.
 */
public class DefiniteNoteInstrument extends Instrument{
    /**
     * Минимальная нота
     */
    private Pair<Note, Octave> min;
    /**
     * Максимальная нота
     */
    private Pair<Note, Octave> max;

    /**
     *
     */
    final Note[] NOTES = {Note.C, Note.D, Note.E, Note.F, Note.G, Note.A, Note.B};
    /**
     *
     */
    final Octave[] OCTAVES = {Octave.SUBCONTRA, Octave.CONTRA, Octave.GREAT, Octave.SMALL, Octave.FIRST, Octave.SECOND, Octave.THIRD, Octave.FOURTH, Octave.FIFTH};

    /**
     * Конструктор
     * @param name
     */
    public DefiniteNoteInstrument(String name) {
        super(name);
    }

    /**
     * Конструктор
     * @param name
     * @param melody
     */
    public DefiniteNoteInstrument(String name, String melody){
        super(name, melody);
    }

    /**
     *
     * @return
     */
    public Pair<Note, Octave> getMin() {
        return min;
    }

    public String getMinToString(){
        if (min == null || min.getKey() == null || min.getValue() == null) return "not set";
        return min.getKey().toString() + " of " + min.getValue().toString().toLowerCase() + "-octave";
    }
    /**
     *
     * @return
     */
    public Note getMinNote(){return this.getMin().getKey();}

    /**
     *
     * @return
     */
    public Octave getMinOctave(){ return this.getMin().getValue();}

    /**
     *
     * @param min
     */
    public void setMin(Pair min) {
        this.min = min;
    }

    /**
     *
     * @param note
     * @param octave
     */
    public void setMin(Note note, Octave octave){
        min = new Pair<>(note, octave);
    }

    /**
     *
     * @return
     */
    public Pair<Note, Octave> getMax() {
        return max;
    }

    public String getMaxToString(){
        if (max == null || max.getKey() == null || max.getValue() == null) return "not set";
        return max.getKey().toString() + " of " + max.getValue().toString().toLowerCase() + "-octave";
    }

    /**
     *
     * @return
     */
    public Note getMaxNote(){return this.getMax().getKey();}
    /**
     *
     * @return
     */
    public Octave getMaxOctave(){ return this.getMax().getValue();}

    /**
     *
     * @param max
     */
    public void setMax(Pair max) {
        this.max = max;
    }

    /**
     *
     * @param note
     * @param octave
     */
    public void setMax(Note note, Octave octave){
        max = new Pair<>(note, octave);
    }

    /**
     *
     * @param instrument
     * @return
     */
    public boolean isLowerThen(DefiniteNoteInstrument instrument){
        int n1 = 0;
        int n2 = 0;
        if(this.getMinOctave() == instrument.getMinOctave()) {
            for (int i = 0; i < NOTES.length; i++) {
                if (NOTES[i] == this.getMinNote()) {
                    n1 = i;
                }
                if (NOTES[i] == instrument.getMinNote()) {
                    n2 = i;
                }
            }
            if (n1 < n2) {
                return true;
            } else {
                return false;
            }
        }
        else{
            for (int i = 0; i < OCTAVES.length; i++) {
                if (OCTAVES[i] == this.getMinOctave()) {
                    n1 = i;
                }
                if (OCTAVES[i] == instrument.getMinOctave()) {
                    n2 = i;
                }
            }
            if (n1 < n2) {
                return true;
            } else {
                return false;
            }
        }
    }
}
