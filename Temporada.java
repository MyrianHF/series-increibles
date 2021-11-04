public class Temporada {

    // N�mero de cap�tulos
    private int numeroCapitulos;
    // Serie terminada
    private boolean serieTerminada;

    /**
     * Crea estructura de la temporada
     */
    public Temporada(int numeroCapitulosTemporada, boolean serieFinalizada) {
        numeroCapitulos = numeroCapitulosTemporada;
        serieTerminada = serieFinalizada;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public boolean getSerieTerminada() {
        return serieTerminada;
    }

    public void setNumeroCapitulos(int numeroCapitulosTemporada) {
        numeroCapitulos = numeroCapitulosTemporada;
    }

    public void setSerieTerminada(boolean serieFinalizada) {
        serieTerminada = serieFinalizada;
    }
    
    /**
    * Imprime detalles serie
    */
    public void imprimirDetalles() {
	System.out.println("N�mero de cap�tulos: " + numeroCapitulos + " / Serie terminada: " + serieTerminada);
    }
}