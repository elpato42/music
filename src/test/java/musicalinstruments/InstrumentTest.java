package test.java.musicalinstruments;

import main.java.musicalinstruments.Instrument;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Екатерина on 16.02.2018.
 */
public class InstrumentTest {
    @Test
    public void toStringShouldReturnString(){
        String name = "instrument";
        Instrument instrument = new Instrument(name);
        assertEquals(String.format("Instrument %s of none type", name), instrument.toString() );
    }

}
