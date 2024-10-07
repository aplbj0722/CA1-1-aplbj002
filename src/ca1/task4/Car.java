package ca1.task4;

import java.util.Objects;

public class Car {
		
    private String make;
    private String model;
    private String color;
    
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return model.equals(car.model) && color.equals(car.color);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return make + ", " + model + ", " + color;
    }
}