package main.java.enam;

/**
 * Created by Екатерина on 16.02.2018.
 */
    public enum MethodOfSoundProduction {
        IDIOPHONE ("инструменты, в которых звучащим телом является натянутая мембрана из кожи или пластика."),
        MEMBRANOPHONE("инструменты, в которых звучащим телом является весь инструмент, либо состоящие из целиком звучащих тел");
        String description;
        MethodOfSoundProduction(String description){
            this.description = description;
        }

    }
