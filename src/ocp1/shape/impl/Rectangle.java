package ocp1.shape.impl;

import ocp1.shape.Shape;

public class Rectangle implements Shape {
    private int leg1;
    private int leg2;

    public Rectangle(int leg1, int leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2;
    }
}
