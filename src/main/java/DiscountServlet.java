import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        double amount = price * percent * 0.01;
        double discountPrice = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Product Description: " + description + "</h2>");
        writer.println("<h2>List Price: " + price + "</h2>");
        writer.println("<h2>Discount Percent: " + percent + "</h2>");
        writer.println("<hr/>");
        writer.println("<h2>Discount Amount: " + amount + "</h2>");
        writer.println("<h2>Discount Price: " + discountPrice + "</h2>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
