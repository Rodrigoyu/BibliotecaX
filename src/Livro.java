
public class Livro extends ItemBiblioteca implements emprestimosBiblioteca {
    private String autor;
    private boolean emprestado;

    public Livro(int id, String titulo, String autor) {
        super(id, titulo);
        this.autor = autor;
        this.emprestado = emprestado;
    }

    @Override
    public void exibirDetalhes() {
        String status = emprestado ? "Emprestado" : "Disponivel";
        System.out.println("----- Livro -----");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + autor);
        System.out.println("Status: " + status);
        System.out.println("----------------");
    }

    @Override
    public void emprestar() {
        if(this.emprestado) {
            System.out.println("livro "+ getTitulo() +  " indisponivel para emprestar");
        }else{
            this.emprestado = true;
            System.out.println("O livro "+ getTitulo() +  " foi emprestado!");
        }

    }

    @Override
    public void devolver() {
        if (this.emprestado) {
        this.emprestado = false;
        System.out.println("O livro "+ getTitulo() +  " foi devolvido!");
        }else {
            System.out.println("esse livro não foi emprestado!");
        }

    }

    @Override
    public boolean isEmprestado() {
        return emprestado;
    }
}
