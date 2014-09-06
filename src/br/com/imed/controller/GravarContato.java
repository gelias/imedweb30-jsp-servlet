package br.com.imed.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.imed.dal.ContatoDAO;
import br.com.imed.model.Contato;

@WebServlet("/GravarContato")
public class GravarContato extends HttpServlet {
	
	
	private static final String PARAMETRO_NOME = "nome";
	private static final String PARAMETRO_SOBRENOME = "sobrenome";
	private static final String PARAMETRO_SEXO = "sexo";
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sexo = request.getParameter(PARAMETRO_SEXO);
		String nome = request.getParameter(PARAMETRO_NOME);
		String sobrenome = request.getParameter(PARAMETRO_SOBRENOME);
		
		Contato contato = new Contato(nome, sobrenome, sexo);
		boolean adicionou = ContatoDAO.adicionar(contato);
		System.out.println("Foi adicionado com sucesso? "+ adicionou);
		System.out.println("Numero total de contatos cadastrados "+ ContatoDAO.tamanho());
		
		request.setAttribute("adicionou", adicionou);
		request.setAttribute("total", ContatoDAO.tamanho());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/resultado.jsp");
	    requestDispatcher.forward(request, response);
	}

}
