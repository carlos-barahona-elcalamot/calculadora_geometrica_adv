package com.elcalamot;

import com.FiguresGeometriques.Cercle;
import com.FiguresGeometriques.FiguraGeometrica;
import com.FiguresGeometriques.MesuraIncorrectaException;
import com.FiguresGeometriques.NotARectangleException;
import com.FiguresGeometriques.NotATriangleException;
import com.FiguresGeometriques.PoligonRegular;
import com.FiguresGeometriques.Quadrat;
import com.FiguresGeometriques.Rectangle;
import com.FiguresGeometriques.Triangle;

public class Aplicacio {

    private FiguraGeometrica t;

    public void showHelp() {
        System.out.println("Has de donar el nombre d'una figura geometrica i els arguments necessaris per construir-la:");
        System.out.println("cercle radi");
        System.out.println("triangle costat1 costat2 costat3");
        System.out.println("quadrat costat");
        System.out.println("rectangle costatCurt costatLlarg");
        System.out.println("cercle radi");
        System.out.println("poligon midaCostat nombreCostats");
        System.out.println("");
        System.out.println("NOTA: la comanda poligon es refereix sempre a un polígon regular.");
        System.out.println("");
    }

    public void run(String[] args) {
        String error = "";
        if (args.length == 0 || args[0]=="--help" || args[0]=="?") {
            showHelp();
            return;
        }
        switch (args[0].toLowerCase()) {
            case "triangle":
                if (args.length == 4) {
                    try {
                        t = new Triangle(Double.parseDouble(args[1]), Double.parseDouble(args[2]),
                                Double.parseDouble(args[3]));
                    } 
                    catch (MesuraIncorrectaException e) {
                        error = e.getMessage();
                    } catch (NumberFormatException e) {
                        error = "La mida dels costats ha de ser numèrica";
                    } catch (NotATriangleException e) {
                        error=e.getMessage();
                    }
                } else {
                    error = "Nombre d'arguments incorrecte: has de donar la mida de cada costat.";
                }
                break;
            case "quadrat":
                if (args.length == 2) {
                    try {
                        t = new Quadrat(Double.parseDouble(args[1]));
                    } catch (NumberFormatException | MesuraIncorrectaException e) {
                        error= e.getMessage();
                    }
                } else {
                    error = "Nombre d'arguments incorrecte: has de donar la mida d'un costat.";
                }
                break;
            case "rectangle":
                if (args.length == 3) {
                    try {
                        t = new Rectangle(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
                    } catch (NumberFormatException | MesuraIncorrectaException | NotARectangleException e) {
                        error= e.getMessage();
                    }
                } else {
                    error = "Nombre d'arguments incorrecte: has de donar la mida de dos costats.";
                }
                break;
            case "cercle":
                if (args.length == 2) {
                    try {
                        t = new Cercle(Double.parseDouble(args[1]));
                    } catch (NumberFormatException | MesuraIncorrectaException e) {
                        error= e.getMessage();
                    }
                } else {
                    error = "Nombre d'arguments incorrecte: has de donar la mida del diametre.";
                }
                break;
            case "poligon":
            if (args.length == 3) {
                try {
                    t = new PoligonRegular(Double.parseDouble(args[1]),Integer.parseInt(args[2]));
                } catch (NumberFormatException | MesuraIncorrectaException e ) {
                    error= e.getMessage();
                }
            } else {
                error = "Nombre d'arguments incorrecte: has de donar la mida d'un costat i el nombre de costats.";
            }
            break;
        default:
                error = "No conec aquesta forma geometrica, únicament conec triangle, quadrat, rectangle i cercle.";

        }

        if (error == "") {
            System.out.println("Perímetre: " + t.getPerimetre());
            System.out.println("Àrea: " + t.getArea());
        } else {
            System.out.println(error);
        }
    }

}
