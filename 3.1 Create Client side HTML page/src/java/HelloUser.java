import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse 
            response)throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        out.println("<h2>Welcome "+user+"</h2>");
    }
    
}
