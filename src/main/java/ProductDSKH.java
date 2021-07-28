import models.DanhSachKH;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet(urlPatterns = {"/khachhang"})
public class ProductDSKH extends HttpServlet {
    static  ArrayList<DanhSachKH> list = new ArrayList<>();
static {
    list.add(new DanhSachKH("Nguyen Quang Hung", "23/03/2000", "Thai Nguyen", "Anh/1.jpg"));
    list.add(new DanhSachKH("Hoang Thi Hien", "16/03/2000", "Thai Nguyen", "Anh/2.jpg"));
    list.add(new DanhSachKH("Nguyen Hoai Nam", "05/04/1999", "Thai Nguyen", "Anh/3.jpg"));
}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listKH", list);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("DanhSachKH.jsp");
        requestDispatcher.forward(req,resp);
    }
}
