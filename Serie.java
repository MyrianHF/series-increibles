public class Serie {

    // Nombre del protagonista
    private String nombreProtagonista;
    // Categor�a de la serie
    private String categor�a;
    // N�mero de la temporada
    private Temporada temporada;

    /**
     * Crea estructura de la serie
     */
    public Serie(String nombreDelProtagonista, String nombreCategor�a, Temporada nuevaTemporada) {
        nombreProtagonista = nombreDelProtagonista;
        categor�a = nombreCategor�a;
        temporada = nuevaTemporada;
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
    public void setCategoria(String nuevaCategor�a) {
        categor�a = nuevaCategor�a;
    }  
    
    /**
     * Establece el n�mero de la temporada
    */
    public void setTemporada(Temporada numeroTemporada) {
        temporada = numeroTemporada;
    }  
    
    /**
    * Imprime detalles serie
    */
    public void imprimirDetalles() {
    System.out.println("Nombre del protagonista: " + nombreProtagonista + " / Categor�a: " + categor�a + " / Temporada: " + temporada);
    }
}