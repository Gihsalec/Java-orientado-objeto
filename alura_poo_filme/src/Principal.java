import filmes.de.site.modelos.Episodio;
import filmes.de.site.modelos.Filme;
import filmes.de.site.modelos.Serie;
import listas.para.calculos.CalculadoraDeTempo;
import listas.para.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Ponyo");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setDuracaoEmMinutos(101);

        meuFilme.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
//        System.out.println("Soma das avaliações: " + meuFilme.getSomaDasAvaliacoes());
//        System.out.println("Soma do total avaliações: " + meuFilme.getTotalDeAvaliacoes());
//        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
        System.out.println("=======================================");

        Serie arcane = new Serie();
        arcane.setNome("Arcane");
        arcane.setAnoDeLancamento(2021);
        arcane.exibeFichaTecnica();
        arcane.setTemporadas(2);
        arcane.setEpsPorTemp(18);
        arcane.setMinPorEp(40);
        System.out.println("Duração em minutos: " + arcane.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(arcane);
        System.out.println("=======================================");
        System.out.println("Duração total das obras selecionadas em minutos: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(arcane);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
