import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet implements Servlet {

    private transient ServletConfig config;
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New request");
        // получаем объект типа BufferedWriter и пишем в него ответ напришедший запрос
        res.getWriter().println("<h1>My first servlet</h1>");
        logger.info("Request close");
    }

    @Override
    public String getServletInfo() {
        return "FirstServlet";
    }

    @Override
    public void destroy() {
        logger.info("Destroyed");
    }
}
