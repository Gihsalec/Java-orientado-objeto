package filmes.de.site.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epsPorTemp;
    private int minPorEp;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsPorTemp() {
        return epsPorTemp;
    }

    public void setEpsPorTemp(int epsPorTemp) {
        this.epsPorTemp = epsPorTemp;
    }

    public int getMinPorEp() {
        return minPorEp;
    }

    public void setMinPorEp(int minPorEp) {
        this.minPorEp = minPorEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return (temporadas * epsPorTemp * minPorEp);
    }
}
