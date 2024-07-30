package com.measurement;

public class Centimeter {

    int magnitude;
    public Centimeter(int magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        if(object == null || this.getClass() != object.getClass()) {
            return false;
        }

        return this.magnitude == ((Centimeter) object).magnitude;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(magnitude);
    }

}
