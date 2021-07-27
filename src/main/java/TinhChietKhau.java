import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/Discount"})
public class TinhChietKhau extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float ListPrice = Float.parseFloat(req.getParameter("ListPrice"));
        float Discount = Float.parseFloat(req.getParameter("Discount"));
        String Description = req.getParameter("Description");

        float CalculateDiscount = (float) (ListPrice * Discount * 0.01);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Description : " + Description + "<h1>" );
        writer.println("<h1>List Price : " + ListPrice + "<h1>" );
        writer.println("<h1>Discount Percent : " + Discount + " %" + "<h1>" );
        writer.println("<h1>Discount Price : " + CalculateDiscount + "<h1>" );
        writer.println("</html>");

    }
}
