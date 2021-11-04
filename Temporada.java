public class Temporada {

    // Número de capítulos
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
}