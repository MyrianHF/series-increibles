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
    
    /**
     * Devuelve el nombre del protagonista
     */
    public String getNombreProtagonista() {
        return nombreProtagonista;
    }   
    
    /**
     * Devuelve la categor�a de la serie
     */
    public String getCategoriaSerie() {
        return categor�a;
    }  
    
    /**
     * Devuelve el n�mero de temporada de la serie
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
    public void setCategoria(String nuevaCategor�a) {
        categor�a = nuevaCategor�a;
    }  
    
    /**
     * Establece categoria serie
    */
    public void setTemporada(int numeroTemporada) {
        temporada = numeroTemporada;
    }  
}