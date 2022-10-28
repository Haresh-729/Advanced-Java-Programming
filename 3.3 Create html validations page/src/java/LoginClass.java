import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginClass extends HttpServlet{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        
        String result;
        try{
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            if(username.equals("Haresh")&&password.equals("haresh@123")){
                result="Login successful";
            }
            else{
                result="Authentication Error";
            }
            out.println("<h2>"+result+"<h2>");
        }
        finally{
            out.close();
        }
    }   
}
