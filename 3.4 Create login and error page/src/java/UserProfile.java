import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserProfile extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException,ServletException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            out.print("<h1>Welcome</h1>");
            out.print("<br>");
            out.print("Your Information is....");
            out.print("Username...."+username);
            out.print("<br>");
            out.print("Password...."+password);
        }
        finally{
            out.close();
        }
    }
}

