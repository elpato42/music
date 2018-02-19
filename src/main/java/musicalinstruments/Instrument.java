package main.java.musicalinstruments;

/**
 * Created by Екатерина on 15.02.2018.
 */
public class Instrument {
    /**
     * Название музыкального инструмента
     */
    private String name;
    /**
     * Тип музыкального инструмента
     */
    private String type;
    /**
     * Мелодия музыкального инструмента
     */
    private String melody;

    /**
     * Конструктор
     * @param name название инструмента
     */
    public Instrument(String name){
        this.name = name;
    }

    /**
     * Конструктор
     * @param name название инструмента
     * @param melody мелодия музыкального инструмента
     */
    public Instrument(String name, String melody){
        this(name);
        this.melody = melody;
    }

    /**
     * Метод, запускает мелодию музыкального инструмента
     */
    public void play(){
        if(melody == null){
            melody = "La";
        }
        System.out.println(String.format("%s-%s-%s", melody, melody, melody));
    }

    /**
     * Метод, возвращает название музыкального инструмента
     * @return название
     */
    public String getName() {
        return name;
    }

    /**
     * Метод, устанавливает название инструмента
     * @param name название музыкального инструмента
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод, возввращает тип музыкального инструмента
     * @return  тип музыкального инструмента
     */
    public String getType() {
        if (type != null) {
            return type;
        }
        else {
            return "none";
        }
    }

    /**
     * Устанавливает тип музыкального инструмента
     * @param type тип музыкального инструмента
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Метод, возвращает мелодию инструмента
     * @return мелодия
     */
    public String getMelody() {
        return melody;
    }
    /**
     * Метод, устанавливает мелодию инструмента
     * @param melody мелодия
     */
    public void setMelody(String melody) {
        this.melody = melody;
    }

    /**
     *
     * @return строку
     */
    @Override
    public String toString(){
        if (type == null) {
               return String.format("Instrument %s of none type", name);
        }
        return String.format("Instrument %s of %s type", name, type);
    }

}
