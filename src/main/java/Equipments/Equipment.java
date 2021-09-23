package Equipments;

import beepers.Beeper;
import engines.Engine;

public class Equipment {

    private Engine engine;
    private Beeper beeper;
    private int doorsQuantity;
    private boolean sensorABS;

    public Equipment(Engine engine, Beeper beeper, int doorsQuantity, boolean sensorABS){
        this.engine = engine;
        this.beeper = beeper;
        this.doorsQuantity = doorsQuantity;
        this.sensorABS = sensorABS;
    }

    public String equipment() {
        return "Options: " + engine.toString() + ", " + beeper.toString() + ", " + doorsQuantity + " doors, ABS: " + sensorABS;
    }

}
