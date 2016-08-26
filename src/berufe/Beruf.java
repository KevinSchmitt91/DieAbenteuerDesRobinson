package berufe;

/**
 * Created by Kevin Schmitt on 26.08.2016.
 * Interface für einen Beruf
 */
public interface Beruf {

    /**
     * gibt den typ eines Berufs zurück
     * @return typ des Beruf als String
     */
    String getTyp();

    /**
     * gibt die maximale Anzahl an Verwundungen
     * eines bestimmten Berufs zurück
     * @return Verwundungen des Berufs
     */
    int getVerundungen();
}
