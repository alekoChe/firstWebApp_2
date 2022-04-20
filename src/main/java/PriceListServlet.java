import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PriceListServlet", urlPatterns = "/priceList_servlet")
public class PriceListServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(PriceListServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("OutputPriceList");

        Product product = new Product();
        product.fillingPriceList();

        resp.getWriter().printf("<h1>Our products</h1>");
        for (Product item : product.priceList) {
            resp.getWriter().printf(item.getId() + " - " + item.getTitle() + " - " + item.getCost() + "\n");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
