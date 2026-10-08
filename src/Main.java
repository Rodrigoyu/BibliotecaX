public class Main {
    public static void main(String[] args) {
        GerenciaBiblioteca biblioteca = new GerenciaBiblioteca();

        Livro livro1 = new Livro(1, "Clean Code", "Robert C. Martin");
        Livro livro2 = new Livro(2, "Java para Iniciantes", "Herbert Schildt");
        Revista revista = new Revista(1, "BTS", "BTS");

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(revista);

        // 2. Listando o acervo
        biblioteca.listarAcervo();

        // 3. Testando o empréstimo
        System.out.println("\n--- TESTANDO EMPRÉSTIMOS ---");
        biblioteca.emprestarItem(1); // Sucesso
        biblioteca.emprestarItem(1); // Aviso de já emprestado

        // 4. Listando novamente para ver a alteração de status
        biblioteca.listarAcervo();

    }
}