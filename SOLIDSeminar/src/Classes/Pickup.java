package Classes;

import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel;
import Enumerators.TypeOfGearBox;
import Interfaces.iFuelStation;
import Interfaces.iWipingCar;
import java.awt.*;

public class Pickup extends Car implements iFuelStation, iWipingCar {
    private float loadCapacity;
    public Pickup(String make, String model, Color color, int numOfWheels, TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float engineCapacity, float loadCapacity) {
        super(make, model, color, TypeOfBody.pickup, numOfWheels, typeOfGearBox, typeOfFuel, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipeWindShield() {

    }

    @Override
    public void wipeHeadLights() {

    }

    @Override
    public void wipeMirrors() {

    }
}
