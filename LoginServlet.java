import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the username and password from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // For simplicity, let's assume the credentials are hardcoded
        String validUsername = "admin";
        String validPassword = "password123";

        // Set response content type
        response.setContentType("text/html");

        // Get the writer object to write the response
        PrintWriter out = response.getWriter();

        if (username.equals(validUsername) && password.equals(validPassword)) {
            // Login success
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<p>You have successfully logged in.</p>");
            out.println("</body></html>");
        } else {
            // Login failure
            out.println("<html><body>");
            out.println("<h2>Invalid credentials. Please try again.</h2>");
            out.println("<a href='login.html'>Back to Login</a>");
            out.println("</body></html>");
        }
    }
}
