// Basic servlet for login form
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // get form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // simple hardcoded check
        if (username.equals("admin") && password.equals("1234")) {
            out.println("<h2>Login Successful! Welcome " + username + "</h2>");
        } else {
            out.println("<h2>Invalid username or password</h2>");
        }
    }
}
