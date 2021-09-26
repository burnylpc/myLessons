package cars;

import Equipments.Equipment;
import beepers.Beeper;
import brands.Brand;
import engines.Engine;
import models.Model;

public abstract class NewCar {

    private Equipment equipment;
    private Model model;

    public NewCar(Model model, Equipment equipment) {
        this.model = model;
        this.equipment = equipment;
    }

    public String getName() {
        return model.toString() + "\n" + equipment.equipment();
    }

}
