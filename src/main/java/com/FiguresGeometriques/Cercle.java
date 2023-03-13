package com.FiguresGeometriques;

public class Cercle implements FiguraGeometrica {

    private final double radi;
    public static final String NOM="cercle";


    public Cercle(double radi) throws MesuraIncorrectaException {
        if (radi<=0) {
            throw new MesuraIncorrectaException("La mida ha de ser major que 0");
        }
        this.radi=radi;
    }

    @Override
    public double getPerimetre() {
        return 2*Math.PI*radi;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radi, 2);
    }

    @Override
    public String getNom() {
        return NOM;
    }
    
    public double getRadi() {
        return radi;
    }
}
