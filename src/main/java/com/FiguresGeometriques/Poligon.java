package com.FiguresGeometriques;

public abstract class Poligon implements FiguraGeometrica {

    private final double[] costats;

    public Poligon(double[] costats) throws MesuraIncorrectaException {
        for(double unCostat: costats) {
            if (unCostat<=0) throw new MesuraIncorrectaException("Tots els costats han de ser majors que 0.");
        }
        this.costats=costats;
    }

    @Override
    public double getPerimetre() {
        double perimetre=0;
        for (double unCostat:costats) 
            perimetre+=unCostat;
        return perimetre;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract String getNom();

    public double[] getCostats() {
        return costats.clone();
    }
    
}
