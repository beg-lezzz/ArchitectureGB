package Classes;

import Enumerators.TypeOfFuel;
import Enumerators.TypeOfGearBox;
import Enumerators.TypeOfBody;
import java.awt.*;

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeOfBody typeOfBody;
    private int numOfWheels;
    private TypeOfGearBox typeOfGearBox;
    private TypeOfFuel typeOfFuel;
    private float engineCapacity;

    public Car(String make, String model, Color color, TypeOfBody typeOfBody, int numOfWheels, TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.typeOfBody = typeOfBody;
        this.numOfWheels = numOfWheels;
        this.typeOfGearBox = typeOfGearBox;
        this.typeOfFuel = typeOfFuel;
        this.engineCapacity = engineCapacity;
    }

    public void Movement() {

    }

    public void Maintenance() {

    }

    public boolean TurnLights() {
        return true;
    }

    public boolean TurnWrappers() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public TypeOfGearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }
}
