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

@WebServlet("/BuscarContato")
public class BuscarContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PARAMETRO_NOME = "nome";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter(PARAMETRO_NOME);
		Contato contato = ContatoDAO.buscaPorNome(nome);
		if(contato == null)
			contato = new Contato();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/listaContato.jsp");
		request.setAttribute("contato", contato);
		dispatcher.forward(request, response);
		
		
	}

}
