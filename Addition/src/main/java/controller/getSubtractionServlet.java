package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Duper;

/**
 * Servlet implementation class getSubtractionServlet
 */
@WebServlet("/getSubtractionServlet")
public class getSubtractionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSubtractionServlet() {
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userNumber1 = Integer.parseInt(request.getParameter("userNumber1"));
		int userNumber2 = Integer.parseInt(request.getParameter("userNumber2"));
		int difference = userNumber1 - userNumber2;
		
		Duper dupe = new Duper(difference);
		dupe.setDupes(difference);
		request.setAttribute("userSubtractionPouch", dupe);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println("Those numbers when multiplied by x2, x5 and x100 become: ((a-b)2,(a-b)5, or(a-b)1000)" + dupe.getX2() + ", " + dupe.getX5() + ", and " +  dupe.getX1000());
		// TODO Auto-generated method stub
		writer.close();
		}

}
