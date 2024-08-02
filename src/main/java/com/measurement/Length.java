package com.measurement;

public class Length {

    private static class Unit {
        static final Unit CM = new Unit(0.01);
        static final Unit M = new Unit(1);
        static final Unit KM = new Unit(1000);

        double baseFactor;

        private Unit(double baseFactor) {
            this.baseFactor = baseFactor;
        }
    }

    double magnitude;
    final Unit unit;

    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public static Length centiMeter(double magnitude) {
        return new Length(magnitude, Unit.CM);
    }

    public static Length meter(double magnitude) {
        return new Length(magnitude, Unit.M);
    }

    public static Length kiloMeter(double magnitude) {
        return new Length(magnitude, Unit.KM);
    }

    public double convertToBase() {
        return this.magnitude * (unit.baseFactor / Unit.M.baseFactor);
    }
    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        if(object == null || this.getClass() != object.getClass()) {
            return false;
        }

        return this.magnitude == ((Length) object).magnitude;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(magnitude);
    }

}

