package com.FiguresGeometriques;

public class NotATriangleException extends Exception {

    public NotATriangleException() {

        super("Aquestes mides no corresponen a un triangle: cap costat pot ser més gran que la suma dels altres dos.");
    }
}
