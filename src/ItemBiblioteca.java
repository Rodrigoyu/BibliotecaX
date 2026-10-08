import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class ItemBiblioteca {
    private int id;
    private  String titulo;

    public ItemBiblioteca(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void exibirDetalhes();


}
