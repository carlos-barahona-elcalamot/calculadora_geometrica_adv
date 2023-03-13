package com.FiguresGeometriques;

public class Triangle extends Poligon {

    public static final String NOM = "triangle";

    public Triangle(double costat1, double costat2, double costat3) throws MesuraIncorrectaException, NotATriangleException {
        super(buildTriangle(costat1, costat2, costat3));
    }

    public static double[] buildTriangle(double costat1, double costat2, double costat3) throws NotATriangleException {
        if (costat1+costat2<=costat3 || costat2+costat3<=costat1 || costat1+costat3<=costat2) {
            throw new NotATriangleException();
        }

        return new double[] {costat1, costat2, costat3};

    }

    @Override
    public double getArea() {
        double s=getPerimetre()/2;
        double[] costats=getCostats();
        return Math.sqrt(s*(s-costats[0])*(s-costats[0])*(s-costats[0]));

    }

    @Override
    public String getNom() {
        return NOM;
    }

}
