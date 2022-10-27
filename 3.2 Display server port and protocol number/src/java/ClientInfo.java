import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ClientInfo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String name="haresh";
            int serverPortNumber = request.getServerPort();
            out.println("<h3>Port Number...."+serverPortNumber+"</h3>");
            out.println("<h3>Protocol...."+request.getProtocol()+"</h3>");
            out.println("<h3>Path infromation...."+request.getPathInfo()+"</h3>");
            out.println("<h3>remote Address...."+request.getRemoteAddr()+"</h3>");
            out.println("<h3>Authinticatioin type ...."+request.getAuthType()+"</h3>");
            out.println("<h3>HTTP Method...."+request.getMethod()+"</h3>");
            out.println("<h3>Remote user Infromation...."+request.getRemoteUser()+"</h3>");
            out.println("<h3>Path infromation of Servlet...."+request.getServletPath()+"</h3>");
            out.println("<h3>Currenr session associated with request...."+request.getSession()+"</h3>");
        }finally{
            out.close();
        }
    }
    
}

