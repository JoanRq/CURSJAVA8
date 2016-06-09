import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Pagina extends HttpServlet {
  public void doGet(HttpServletRequest rq,
      HttpServletResponse rs) throws IOException {
   
    rs.setContentType("text/html");
   
    PrintWriter p = rs.getWriter();
    p.println("<html><body><h1>hola</h1>");
    for (int i = 0; i < 10; i++) {
      p.println("<img src='tomcat.gif' />");
    }
    p.println("</body></html>");
    
  }
}