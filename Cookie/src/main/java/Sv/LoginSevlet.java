package Sv;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginSevlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	response.setContentType("text/html");
	String ten = request.getParameter("ten");
	String pass= request.getParameter("pass");
	
	// luu nho
	Cookie cten = new Cookie("ten",ten);
	Cookie cpass= new Cookie("pass", pass);
	
	cten.setMaxAge(60*60*24);// 24h
	cpass.setMaxAge(60*60*24);// 24h
	
	response.addCookie(cten);
	response.addCookie(cpass);
	
	 PrintWriter out = response.getWriter();
	    out.println("<html><body>");
	    out.println("<h2>Đăng nhập thành công!</h2>");
	    out.println("<p>Tên: " + ten + "</p>");
	    out.println("<p>Mật khẩu: " + pass + "</p>");
	    out.println("</body></html>");
}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
