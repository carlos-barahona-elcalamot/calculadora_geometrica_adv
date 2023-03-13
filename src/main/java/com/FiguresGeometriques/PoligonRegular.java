package com.FiguresGeometriques;

public class PoligonRegular extends Poligon {

    private final String NOM;

    public PoligonRegular(double midaCostat, int nombreCostats) throws MesuraIncorrectaException {
        this(midaCostat, nombreCostats, "poligon regular de "+nombreCostats+" costats");
    }

    public PoligonRegular(double midaCostat, int nombreCostats, String nom) throws MesuraIncorrectaException {
        super(buildPoligon(midaCostat, nombreCostats));
        NOM=nom;
    }

    private static double[] buildPoligon(double midaCostat, int nombreCostats) {
        double[] costats=new double[nombreCostats];
        for (int i=0; i<nombreCostats;costats[i++]=midaCostat);
        return costats;
    }

    @Override
    public double getArea() {
        double perimetre=getPerimetre();
        double apotema=0.5*getCostats()[0]/Math.tan(Math.toRadians(360/getCostats().length)/2);
        return perimetre*apotema/2;
    }

    @Override
    public String getNom() {
        return NOM;
    }


    
}
