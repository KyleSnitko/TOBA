// Kyle Snitko 2349076 
package customer;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/NewCustomerServlet"})
public class NewCustomerServlet extends HttpServlet 
{
    @Override
    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");
        String emailAddress = request.getParameter("email");
        
        
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(
            "<!doctype html> "
        +   "<html>\n"
        +   "<head>\n"
        +   "   <title>Congratulations</title>\n"
        +   "</head>"
        +   "<body>\n"
                + "<h1>Thank you for becoming a new customer</h1>"
                + "<table cellspacing=\"5\" cellpadding=\"5\" "
                + "       border=\"1\">\n"
                + "<tr><td align=\"right\">First Name: </td>\n"
                + "    <td>" + firstName + "</td>\n"
                + "</tr>\n"
                + "<tr><td align=\"right\">Last Name: </td>\n"
                + "    <td>" + lastName + "</td>\n"
                + "</tr>\n"
                + "<tr><td align=\"right\">Phone Number: </td>\n"
                + "    <td>" + phoneNumber + "</td>\n"
                + "</tr>\n"
                + "<tr><td align=\"right\">address: </td>\n"
                + "    <td>" + address + "</td>\n"
                + "</tr>\n"
                + "<tr><td align=\"right\">City: </td>\n"
                + "    <td>" + city + "</td>\n"
                + "</tr>\n"   
                + "<tr><td align=\"right\">State: </td>\n"
                + "    <td>" + state + "</td>\n"
                + "</tr>\n"
                + "<tr><td align=\"right\">Zip Code: </td>\n"
                + "    <td>" + zipCode + "</td>\n"
                + "</tr>\n"
                + "<tr><td align=\"right\">Email: </td>\n"
                + "    <td>" + emailAddress+ "</td>\n"
                + "</tr>\n"
                + "</tanble>\n"
                
                + "<p> Please make sure all the information is correct </p>"
                + "</body> "
                + "</html>" ); 
        
                    response.sendRedirect("success.html");
                out.close();
        }
    }


