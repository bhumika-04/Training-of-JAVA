// Basic servlet to handle form submission
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FormServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Form Submitted Successfully!</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Phone: " + phone + "</p>");
    }
}
