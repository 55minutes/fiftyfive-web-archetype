package ${package};


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TrivialServlet extends HttpServlet
{
    private static final Logger LOGGER = LoggerFactory.getLogger(
        TrivialServlet.class
    );
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException
    {
        LOGGER.debug("Handling GET request");
        
        PrintWriter out = res.getWriter();
        out.println("Hello, world!");
        out.close();
    }
}
