import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if(user.equals("admin") && pass.equals("admin")) {
            response.sendRedirect("home.html");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
