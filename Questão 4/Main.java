public class Main {
    public static void main(String[] args) {
        GestaoPedidos listaPedidos1 = new GestaoPedidos();

        listaPedidos1.adicionarPedido("Smartphone S23");
        listaPedidos1.adicionarPedido("Notebook Acer Nitro V15");
        listaPedidos1.adicionarPedido("Alexa");

        String retornoRemocao = listaPedidos1.proximoPedido();
        if (!retornoRemocao.equals("Fila Vazia")) {
            System.out.println("O pedido que estava na primeira posição da fila foi removido com sucesso!");
        }
        System.out.println(retornoRemocao + "\n");

        System.out.printf("Restam %d pedidos na lista: \n", listaPedidos1.quantidadePendentes());

        listaPedidos1.listarPedidos(); 
    }
}
