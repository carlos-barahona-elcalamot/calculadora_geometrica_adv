package com.FiguresGeometriques;

public class NotARectangleException extends Exception {

    public NotARectangleException() {
        super("Un rectangle ha de tenir dos costats de mides diferents. Si els costats son iguals, millor fes servir un quadrat.");

    }
}
