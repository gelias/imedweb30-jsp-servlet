package br.com.imed.dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.imed.model.Contato;

public class ContatoDAO {
	
	private static Map<String, Contato> listaContatos = new HashMap<String, Contato>();

	public static boolean adicionar(Contato contato){
		listaContatos.put(contato.getNome(), contato);
		return listaContatos.containsKey(contato.getNome());
	}

	public static int tamanho() {
		return listaContatos.size();
	}

	public static Contato buscaPorNome(String nome) {
		return listaContatos.get(nome);
	}

}
