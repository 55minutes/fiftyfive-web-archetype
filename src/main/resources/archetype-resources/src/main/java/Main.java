package ${package};

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Facilitates heroku deployment.
 * @see <a href="http://blog.heroku.com/archives/2011/08/25/java/">Heroku for Java</a>
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        WebAppContext web = new WebAppContext();
        web.setContextPath("/");
        web.setWar("src/main/webapp");
        server.setHandler(web);
        server.start();
        server.join();
    }
}
