public class Serie {

    // Nombre del protagonista
    private String nombreProtagonista;
    // Categoría de la serie
    private String categoría;
    // Número de la temporada
    private int temporada;

    /**
     * Crea estructura de la serie
     */
    public Serie(String nombreDelProtagonista, String nombreCategoría, int numeroTemporada) {
        nombreProtagonista = nombreDelProtagonista;
        categoría = nombreCategoría;
        temporada = numeroTemporada;
    }
}