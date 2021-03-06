package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBD;

public class TestesPedidos {

	public static void main(String[] args) {

		// Representa??o de interface com usu?rio
		String cliente = "Vanessa"; // args[0];
		BigDecimal valorOrcamento = new BigDecimal("100"); // new BigDecimal(args[1]);
		int quantidadeItens = 5; //// Integer.parseInt(args[2]);

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBD(), new EnviarEmailPedido(), new LogDePedido()));
		handler.executa(gerador);
	}

}
