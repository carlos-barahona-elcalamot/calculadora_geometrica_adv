package com.FiguresGeometriques;

public class Rectangle extends Poligon {

    public static final String NOM = "rectangle";

    public Rectangle(double costatCurt, double costatLlarg) throws MesuraIncorrectaException, NotARectangleException {
        super(new double[] { costatLlarg, costatCurt, costatLlarg, costatCurt });
        if (costatCurt == costatLlarg)
            throw new NotARectangleException();
    }

    @Override
    public double getArea() {
        double[] costats = getCostats();
        return costats[0] * costats[1];
    }

    @Override
    public String getNom() {
        return NOM;
    }

}
