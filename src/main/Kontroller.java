package main;

import berufe.Charaktertafel;

/**
 * Created by Kevin Schmitt on 26.08.2016.
 *  Hier werden alle Spielaktionen durchgeführt
 *  und behandelt
 */

public class Kontroller {

    private Charaktertafel spieler1;

    /**
     * hier wird ein neues Spiel initialisiert
     */
    public static void initialisierenDesSpiels() {
        this.spieler1 = new Charaktertafel();
    }

}
