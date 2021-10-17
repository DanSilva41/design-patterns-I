package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Pedro da Silva";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = 4;

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(); // passar dependencias (repositorios, serviços)
        handler.executa(geraPedido);
    }
}
