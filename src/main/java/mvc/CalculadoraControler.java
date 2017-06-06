package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/calculaimc")

public class CalculadoraControler extends HttpServlet {
			
		private CalculadoraModel calculadora = new CalculadoraModel();
		private Float peso;
		private Float altura;
		private String sexo;
		    
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   

			try {
				Float peso = Float.parseFloat(request.getParameter("peso"));
				Float altura = Float.parseFloat(request.getParameter("altura"));
				String sexo = request.getParameter("sexo");	
				String resultado = calculadora.calculaIMC(peso, altura, sexo);
				request.setAttribute("resultado", resultado);
				request.getRequestDispatcher("index.jsp").forward(request, response);				
			}catch(Exception e){
				System.out.println("Parametro incorreto.");
				this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);				
			}					
		}
	}  