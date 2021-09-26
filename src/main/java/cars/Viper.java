package cars;

import beepers.Beeper;
import engines.Engine;

public class Viper extends Car {

    public Viper(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    public void scoopFuel() {
        System.out.println("Fuel scooped");
    }

    public void landToPlanet() {
        System.out.println("Mars");
    }
}
