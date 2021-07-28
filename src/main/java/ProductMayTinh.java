import jdk.nashorn.internal.objects.annotations.SpecializedFunction;
import models.MayTinh;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/maytinh"})
public class ProductMayTinh extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(req.getParameter("first"));
        double secondOperand = Double.parseDouble(req.getParameter("second"));
        char tinh = req.getParameter("Tinh").charAt(0);

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Result:</h1>");
        try {
            double result = MayTinh.maytinh(firstOperand,secondOperand,tinh);
            writer.println(firstOperand + "" + tinh + "" + secondOperand + " = " + result );
        }catch (Exception e) {
            writer.println("Error : " + e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(req.getParameter("first"));
        double secondOperand = Double.parseDouble(req.getParameter("second"));
        char tinh = req.getParameter("Tinh").charAt(0);

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Result:</h1>");
        try {
            double result = MayTinh.maytinh(firstOperand,secondOperand,tinh);
            writer.println(firstOperand + "" + tinh + "" + secondOperand + " = " + result );
        }catch (Exception e) {
            writer.println("Error : " + e.getMessage());
        }
    }

}
