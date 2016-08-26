package main;

/**
 * Created by Kevin Schmitt on 26.08.2016.
 *  Als Charakter wird die Figur eines Spielers bezeichnet,
 *  deren Charaktertafel er vor sich ausliegen hat, und die
 *  durch die beiden Aktionssteine repräsentiert wird. Wenn
 *  im Spiel von einem Charakter geschrieben wird, ist
 *  immer diese Figur gemeint.
 */

public class Charaktertafel {
    //Charakter Eigenschaften
    private String typ;
    private int verwundungen;

    //Verschiedene Typen von spielbaren Berufen
    private enum Beruf {SOLDAT, KOCH};

    /**
     * Erstellt einen bestimmte Berufs-Klasse
     * mit allen nötigen Eigenschaften
     * @param auswahl welche Berufs-Klasse ertellt werden soll
     */
    public Charaktertafel(Beruf auswahl) {
        switch (auswahl) {
            //Erstellt den Soldaten
            case SOLDAT:
                this.typ = "Soldat";
                this.verwundungen = 12;
                break;
            //Erstellt den Koch
            case KOCH:
                this.typ = "Koch";
                this.verwundungen = 10;
                break;
        }
    }

}
