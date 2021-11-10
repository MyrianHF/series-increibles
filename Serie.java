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
    
    /**
     * Devuelve el nombre del protagonista
     */
    public String getNombreProtagonista() {
        return nombreProtagonista;
    }   
    
    /**
     * Devuelve la categoría de la serie
     */
    public String getCategoriaSerie() {
        return categoría;
    }  
    
    /**
     * Devuelve el número de temporada de la serie
     */
    public int getNumeroTemporada() {
        return temporada;
    }  
    
    /**
     * Establece nombre protagonista
     */
    public void setNombreProtagonista(String nombreNuevoProtagonista) {
        nombreProtagonista = nombreNuevoProtagonista;
    }   
    
    /**
     * Establece categoria serie
    */
    public void setCategoria(String nuevaCategoría) {
        categoría = nuevaCategoría;
    }  
    
    /**
     * Establece categoria serie
    */
    public void setTemporada(int numeroTemporada) {
        temporada = numeroTemporada;
    }  
}