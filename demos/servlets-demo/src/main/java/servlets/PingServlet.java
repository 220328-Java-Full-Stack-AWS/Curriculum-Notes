package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PingServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
    }


    /*
        This will take a simple GET request and respond with "Pong!" and status 202, indicating the request was accepted.
         */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //here we retrieve the init parameter set in web.xml, and print it.
        System.out.println(getInitParameter("initParam"));

        resp.setStatus(200);
        resp.getWriter().print("Pong!");
    }

}