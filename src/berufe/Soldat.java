package berufe;

/**
 * Created by Kevin Schmitt on 26.08.2016.
 * Hier wird der Beruf Koch erstellt
 */

public class Soldat implements Beruf {

    //Soldat Eigenschaften
    private String typ;
    private int verwundungen;

    /**
     * erstellt einen Soldat (setzt die Eigenschaften)
     */
    public Soldat(){
        this.typ = "Koch";
        this.verwundungen = 10;
    }

    /**
     * gibt den typ eines Berufs zurück
     *
     * @return typ des Beruf als String
     */
    @Override
    public String getTyp() {
        return this.typ;
    }

    /**
     * gibt die maximale Anzahl an Verwundungen
     * eines bestimmten Berufs zurück
     *
     * @return Verwundungen des Berufs
     */
    @Override
    public int getVerundungen() {
        return this.verwundungen;
    }
}