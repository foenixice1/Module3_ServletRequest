import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");

        if ("admin".equals(username) && "admin".equals(password)) {
            // thêm cặp key - value
            req.setAttribute("loginTime", new Date());
            // điều hướng req và resq sang một servlet or jsp khác
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("LoginSuccess.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            resp.sendRedirect("Login.jsp");
        }

        writer.println("</html>");
    }
}
