package main.java.musicalinstruments;

import main.java.enam.MethodOfSoundProduction;

/**
 * Created by Екатерина on 15.02.2018.
 */
public class PercussionWithDefiniteNote extends DefiniteNoteInstrument implements Percussion{
    {
        this.setType("Percussion");
    }

    /**
     * Способ звукообразования
     */
    private MethodOfSoundProduction methodOfSoundProduction;

    /**
     * Конструктор
     * @param name название инструмента
     */
    public PercussionWithDefiniteNote(String name) {
        super(name);
    }

    /**
     *
     * @param name
     * @param melody
     * @param method
     */
    public PercussionWithDefiniteNote(String name, String melody, String method){
        super(name, melody);
        this.setMethodOfSoundProduction(method);
    }

    /**
     *
     * @param methodOfSoundProduction
     */
    public void setMethodOfSoundProduction(String methodOfSoundProduction){
        switch (methodOfSoundProduction.toUpperCase()){
            case ("MEMBRANOPHONE"):{
                this.methodOfSoundProduction = MethodOfSoundProduction.MEMBRANOPHONE;
                break;
            }
            case ("IDIOPHONE"):{
                this.methodOfSoundProduction = MethodOfSoundProduction.IDIOPHONE;
                break;
            }
            default:{
                System.out.println("There is no such method as " + methodOfSoundProduction.toLowerCase());
            }
        }
    }
    @Override
    public String getMethodOfSoundProduction() {
        if (methodOfSoundProduction != null) {
            return methodOfSoundProduction.toString();
        }
        else {
            return "none";
        }
    }
}
