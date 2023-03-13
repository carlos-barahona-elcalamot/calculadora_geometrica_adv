package com.FiguresGeometriques;

public class MesuraIncorrectaException extends Exception {
    public MesuraIncorrectaException() {
        super("Mida incorrecta");
    } 

    public MesuraIncorrectaException(String missatge) {
        super(missatge);
    }
}

