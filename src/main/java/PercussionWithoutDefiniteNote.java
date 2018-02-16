package main.java;

import main.enam.MethodOfSoundProduction;

/**
 * Created by Екатерина on 15.02.2018.
 */
public class PercussionWithoutDefiniteNote extends Instrument implements Percussion {
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
    public PercussionWithoutDefiniteNote(String name) {
        super(name);
    }

    /**
     *
     * @param name
     * @param method
     */
    public PercussionWithoutDefiniteNote(String name, String method) {
        super(name);
        this.setMethodOfSoundProduction(method);
    }
    /**
     * Конструктор
     * @param name название инструмента
     * @param melody мелодия инструмента
     * @param method способ звукообразования
     */
    public PercussionWithoutDefiniteNote(String name, String melody, String method){
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

    /**
     *
     * @return
     */
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
