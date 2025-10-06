public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Os frágeis fios do poder");
        livro1.setAutor("V.E.Schwab");

        Livro livro2 = new Livro();
        livro2.setTitulo("O Hobbit");
        livro2.setAutor("J.R.R.Tolkien");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
