import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginClass extends HttpServlet{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            if(username.equals("Haresh")&&password.equals("Kurade@555")){
                RequestDispatcher rd = request.getRequestDispatcher("/WelcomeUser");
                rd.forward(request, response);
            }
            else{
                RequestDispatcher rd = request.getRequestDispatcher("/errorpage.html");
                rd.forward(request, response);
            }
        }
        finally{
            out.close();
        }
    }
    
}
