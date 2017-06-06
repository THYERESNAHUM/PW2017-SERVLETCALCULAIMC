package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/servletcalculaimc")

public class CalculadoraControler extends HttpServlet {
			
		private CalculadoraModel calculadora = new CalculadoraModel();
		    
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   

			Float peso = Float.parseFloat(request.getParameter("peso"));
			Float altura = Float.parseFloat(request.getParameter("altura"));
			String sexo = request.getParameter("sexo");				
			String resultado = calculadora.calculaIMC(peso, altura, sexo);	
			
			request.setAttribute("resultado", resultado);
			request.getRequestDispatcher("calculadoraview.jsp").forward(request, response);			
		}		
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  	}
	}  