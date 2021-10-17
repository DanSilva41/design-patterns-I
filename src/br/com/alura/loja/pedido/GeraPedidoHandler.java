package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // construtor com injecao de dependencias: repositorios, services
    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.print(pedido);
        System.out.println("\nSalvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedidoo");
    }
}
