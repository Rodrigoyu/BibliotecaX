import java.util.ArrayList;
import java.util.List;

public class GerenciaBiblioteca {
    public List<ItemBiblioteca> listaItems = new ArrayList<>();

    public void  adicionarItem(ItemBiblioteca item){
        listaItems.add(item);
    }

    public void listarAcervo(){
        for (ItemBiblioteca item : listaItems) {
            item.exibirDetalhes();
        }
    }

    public void emprestarItem(int id){
        for (ItemBiblioteca item : listaItems) {
            if (item.getId() == id) {
                if (item instanceof emprestimosBiblioteca) {
                    ((emprestimosBiblioteca) item).emprestar();
                } else {
                    System.out.println("O Livro "+ item.getTitulo() + " é apenas para consulta local");
                }
                return;
            }
        }
        System.out.println("Item Não encontrado!");
    }
}
