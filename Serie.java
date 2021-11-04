public class Serie {

    // Nombre del protagonista
    private String nombreProtagonista;
    // Categor�a de la serie
    private String categor�a;
    // N�mero de la temporada
    private int temporada;

    /**
     * Crea estructura de la serie
     */
    public Serie(String nombreDelProtagonista, String nombreCategor�a, int numeroTemporada) {
        nombreProtagonista = nombreDelProtagonista;
        categor�a = nombreCategor�a;
        temporada = numeroTemporada;
    }
}