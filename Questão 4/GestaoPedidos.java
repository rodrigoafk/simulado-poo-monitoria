import java.util.ArrayList;

public class GestaoPedidos {
    private ArrayList<String> pedidos;
    
    public GestaoPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item) {
        this.pedidos.add(item);
    }

    public int quantidadePendentes() {
        return this.pedidos.size();
    }

    public String proximoPedido() {
        if (quantidadePendentes() == 0) return "Fila Vazia";
        String itemPrimeira = this.pedidos.get(0);
        this.pedidos.remove(0);
        return itemPrimeira;
    }

    public void listarPedidos() {
        for (String item : this.pedidos) {
            System.out.println(item);
        }
    }

    
}
