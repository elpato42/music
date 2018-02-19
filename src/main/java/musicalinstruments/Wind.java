package main.java.musicalinstruments;


import main.java.enam.Material;
import main.java.enam.Note;
import main.java.enam.Octave;

/**
 * Created by Екатерина on 15.02.2018.
 */
public class Wind extends DefiniteNoteInstrument {
    {
        this.setType("wind");
    }
    /**
     * Материал музыкального инструмента
     */
    private Material material;

    /**
     * Конструктор
     * @param name название инструмента
     */
    public Wind(String name) {
        super(name);
        switch (name.toLowerCase()){
            case("trumpet"):{
                material = Material.BRASS;
                this.setMin(Note.E, Octave.SMALL);
                this.setMax(Note.D, Octave.THIRD);
                this.setMelody("Tuu");
                break;
            }
            case("tuba"):{
                material = Material.BRASS;
                this.setMin(Note.A, Octave.SUBCONTRA);
                this.setMax(Note.A, Octave.FIRST);
                this.setMelody("Tuu");
                break;
            }
            case("oboe"):{
                material = Material.WOOD;
                this.setMin(Note.B, Octave.SMALL);
                this.setMax(Note.F, Octave.THIRD);
                this.setMelody("Tuu");
                break;
            }
            default:{
                material = Material.WOOD;
                this.setMin(Note.C, Octave.FIRST);
                this.setMax(Note.B, Octave.FIRST);
                this.setMelody("Tuu");
            }

        }
    }

    /**
     * Метод, возвращает материал инструмента
     * @return материал, если материал известен, "none", если материал не определен
     */
    public String getMaterial() {
        if(material == null){
            return "none";
        }
        else {
            return material.toString().toLowerCase();
        }
    }

    /**
     * Метод, устанавливает материал у музыкального инструмента
     * @param material материал
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * Метод, устанавливает материал у музыкального инструмента
     * @param material название материала: brass или wood
     */
    public void setMaterial(String material){
        switch (material.toLowerCase()){
            case ("brass"):{
                this.material = Material.BRASS;
                break;
            }
            case ("wood"):{
                this.material = Material.WOOD;
                break;
            }
            default:{
                System.out.println("Sorry, " + this.getName() + " can`t be " + material + "-ed");
            }
        }
    }
}
