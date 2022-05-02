package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import utils.ResponseBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.getWriter().print(prepareResponse(req, resp));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.getWriter().print(prepareResponse(req, resp));
    }

    private String prepareResponse(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResponseBuilder response = new ResponseBuilder();
        Enumeration headers = req.getHeaderNames();
        while(headers.hasMoreElements()) {
            String k = (String)headers.nextElement();
            String v = req.getHeader(k);
            response.getHeaders().put(k, v);
        }

        Enumeration params = req.getParameterNames();
        while(params.hasMoreElements()) {
            String k = (String)params.nextElement();
            String v = req.getParameter(k);
            response.getParams().put(k, v);
        }

        Scanner sc = new Scanner(req.getInputStream()).useDelimiter("\\A");
        response.setRequestBody(sc.next());

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(response);
    }
}
