package pl.sdaacademy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by RENT on 2017-05-20.
 */
public class HelloWorldFantastic extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        if(name == null){
            name ="stranger";
        }
        PrintWriter out =resp.getWriter();
        out.println("<h1>Hello Fantastic World</h1>");
        out.println("<h2>Have a good day, " + name + "</h2>");
    }
}
