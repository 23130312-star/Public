package controller;

import java.io.IOException;

import beans.NumberGuessBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/guess")
public class NumGuessServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();

		NumberGuessBean numguess = (NumberGuessBean) session.getAttribute("numguess");
		if (numguess == null) {
			numguess = new NumberGuessBean();
			session.setAttribute("numguess", numguess);
		}
		String action = request.getParameter("action");
		if ("startAgain".equals(action)) {
			numguess.reset();
			response.sendRedirect("start.jsp");
			return;

		}
		numguess.guess(request.getParameter("guess"));
		if (numguess.getSuccess()) {
			response.sendRedirect("done.jsp");
		} else {
			response.sendRedirect("again.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
