package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Splitter;

/**
 * Servlet implementation class getAdditionServlet
 */
@WebServlet("/getAdditionServlet")
public class getAdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAdditionServlet() {
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int Integer.parseInt(request.getParameter("userNumber"));
		int userNumber1 = Integer.parseInt(request.getParameter("userNumber1"));
		int userNumber2 = Integer.parseInt(request.getParameter("userNumber2"));
		int userNumber3 = Integer.parseInt(request.getParameter("userNumber3"));
		int total = userNumber1 + userNumber2 + userNumber3;
		
		Splitter split = new Splitter(total);
		PrintWriter writer = response.getWriter();
		split.setSplits(total);
		//writer.println("Those numbers are equal to" + (userNumber1 + userNumber2 + userNumber3));
		writer.println("Those numbers are equal to " + split.getQuarters() + "/4ths, or " + split.getTenths() + " /10ths, or " + split.getHundredths() + "/100ths.");

		writer.close();
		
	}

}
