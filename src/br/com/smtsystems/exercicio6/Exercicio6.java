package br.com.smtsystems.exercicio6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.smtsystems.exercicio6.model.Cliente;

public class Exercicio6 {

	/**
	 * <pre>
	 * O exercício 6 nos comentários TODO fazer os ajustes necessários no código.
	 * Igornar a connection nula. Este exemplo não precisa rodá-lo (executá-lo), apenas ajustes no código.
	 * 
	 * </pre>
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		StringBuilder query = new StringBuilder();
		query.append("SELECT cl.seq_cliente as idCliente, cl.codigo as codigoCliente, cl.nome as nomeCliente ")
				.append("FROM cliene as cl ")
				.append("where cl.tipo_faturamento = ? ")
				.append("and date(cl.data_cadastro) betwenn ?  and ? ");

		List<Cliente> clientes = new ArrayList<Cliente>();

		Connection connection = null;
		// TODO Implemente o fechamento correto dos recuros Statement e ResultSet.

		PreparedStatement smt = connection.prepareStatement(query.toString());
		smt.setString(1, "T");
		smt.setDate(2, new java.sql.Date(new Date().getTime()));
		smt.setDate(3, new java.sql.Date(new Date().getTime()));

		ResultSet rs = smt.executeQuery();

		while (rs.next()) {
			clientes.add(buildResult(rs));
		}

	}

	private static Cliente buildResult(ResultSet rs) {
		Cliente cliente = new Cliente();

		// TODO Implemente a recuperação dos valores da consulta.

		return cliente;
	}

}
