public class Serie {

    // Nombre del protagonista
    private String nombreProtagonista;
    // Categoría de la serie
    private String categoría;
    // Número de la temporada
    private Temporada temporada;

    /**
     * Crea estructura de la serie
     */
    public Serie(String nombreDelProtagonista, String nombreCategoría, Temporada nuevaTemporada) {
        nombreProtagonista = nombreDelProtagonista;
        categoría = nombreCategoría;
        temporada = nuevaTemporada;
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
    public Temporada getNumeroTemporada() {
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
     * Establece el número de la temporada
    */
    public void setTemporada(Temporada numeroTemporada) {
        temporada = numeroTemporada;
    }  
    
    /**
    * Imprime detalles serie
    */
    public void imprimirDetalles() {
    System.out.println("Nombre del protagonista: " + nombreProtagonista + " / Categoría: " + categoría + " / Temporada: " + temporada);
    }
}