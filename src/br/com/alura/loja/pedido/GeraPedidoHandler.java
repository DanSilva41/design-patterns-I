package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBanco;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // construtor com injecao de dependencias: repositorios, services
    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.print(pedido);
        final EnviarEmailPedido email = new EnviarEmailPedido();
        final SalvarPedidoNoBanco salvar = new SalvarPedidoNoBanco();

        email.executar();
        salvar.executar();


    }
}
