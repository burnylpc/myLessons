package cars;

import Equipments.Equipment;
import models.Model;

public class NewMercedesSprinter extends NewCar {

    public NewMercedesSprinter(Model model, Equipment equipment) {
        super(model, equipment);
    }

    private int maxNumberOfSeats = 21;

    public int NumberOfSeats() {
        return maxNumberOfSeats;
    }
}
