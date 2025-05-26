import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private int idPedido;
    private String descricao;
    private double valorTotal;

    private static int proxID = 1001;
    private static int totalPedidos = 0;
    private static double totalVendas = 0;

    public Pedido(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.idPedido = proxID;
        proxID++;
        totalPedidos += 1;
        totalVendas += valorTotal;
    }

    public String exibirDetalhesDoPedido() {
        return String.format("ID: %d\n Descrição: %s\n Valor total: %.2f", idPedido, descricao, valorTotal);
    }

    public static int getTotalPedidosRealizados() {
        return totalPedidos;
    }

    public static double getTotalVendasGeral() {
        return totalVendas;
    }

    public static String gerarRelatorioGeral(){
        return String.format("Total de Pedidos: %d\n Total Vendas: %.2f\n", totalPedidos, totalVendas);
    }


}