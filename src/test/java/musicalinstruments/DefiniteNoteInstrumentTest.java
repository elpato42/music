package test.java.musicalinstruments;

import javafx.util.Pair;
import main.java.enam.Note;
import main.java.enam.Octave;
import main.java.musicalinstruments.DefiniteNoteInstrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Екатерина on 16.02.2018.
 */
public class DefiniteNoteInstrumentTest {
    private DefiniteNoteInstrument instrument1;
    private DefiniteNoteInstrument instrument2;
    private DefiniteNoteInstrument instrument3;

    @Before
    public void setUp(){
        instrument1 = new DefiniteNoteInstrument("instrument1");
        instrument2 = new DefiniteNoteInstrument("instrument2");
        instrument3 = new DefiniteNoteInstrument("instrument3");
    }

    @Test
    public void toStringShouldReturnString(){
        String name = "instrument";
        DefiniteNoteInstrument instrument = new DefiniteNoteInstrument(name);
        assertEquals(String.format("Instrument %s of none type", name), instrument.toString() );
    }

    @Test
    public void isLowerThenShouldReturnFalseIfMaxesAreEqual(){
        instrument1.setMin(Note.A, Octave.CONTRA);
        instrument2.setMin(Note.A, Octave.CONTRA);
        assertTrue(!instrument1.isLowerThen(instrument2));
    }
    @Test
    public void isLowerThenShouldReturnFalseIfFirstIsHIGHERThenSecondOnTheSameOctave(){
        instrument1.setMin(Note.B, Octave.CONTRA);
        instrument2.setMin(Note.A, Octave.CONTRA);
        assertTrue(!instrument1.isLowerThen(instrument2));
    }

    @Test
    public void isLowerThenShouldReturnTrueIfFirstIsLowerThenSecondOnTheSameOctave(){
        instrument1.setMin(Note.B, Octave.CONTRA);
        instrument2.setMin(Note.A, Octave.CONTRA);
        assertTrue(instrument2.isLowerThen(instrument1));
    }

    @Test
    public void isLowerThenShouldReturnFalseIfFirstIsHIGHERThenSecondOnDifferentOctaves(){
        instrument1.setMin(Note.B, Octave.SMALL);
        instrument2.setMin(Note.A, Octave.GREAT);
        instrument3.setMin(Note.B, Octave.CONTRA);
        assertTrue(!instrument1.isLowerThen(instrument2)); //different notes
        assertTrue(!instrument1.isLowerThen(instrument3));//same notes
    }
    @Test
    public void isLowerThenShouldReturnTrueIfFirstIsLowerThenSecondOnDifferentOctaves(){
        instrument1.setMin(Note.B, Octave.SMALL);
        instrument2.setMin(Note.A, Octave.GREAT);
        instrument3.setMin(Note.B, Octave.CONTRA);
        assertTrue(instrument2.isLowerThen(instrument1)); //different notes
        assertTrue(instrument3.isLowerThen(instrument1));//same notes
    }

    @Test
    public void setMinShouldSetThePairOfNoteAndOctave(){
        instrument1.setMin(Note.B, Octave.SMALL);
        instrument2.setMin(Note.A, Octave.GREAT);
        instrument3.setMin(Note.B, Octave.CONTRA);
        assertEquals(new Pair<>(Note.B, Octave.SMALL), instrument1.getMin());
        assertEquals(new Pair<>(Note.A, Octave.GREAT), instrument2.getMin());
        assertEquals(new Pair<>(Note.B, Octave.CONTRA), instrument3.getMin());
    }
    @Test
    public void getMinShouldReturnThePairOfNoteAndOctave(){
        instrument1.setMin(Note.B, Octave.SMALL);
        instrument2.setMin(Note.A, Octave.GREAT);
        assertEquals(null, instrument3.getMin());
    }

}
