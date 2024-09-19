package com.systex.view;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Servlet implementation class DumpServlet
 */
public class DumpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DumpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String croot = request.getContextPath();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet HelloServlet</title>");
		out.println("<link href =\""+croot+"/style/myStyle.css\" rel=\"stylesheet\">+</link>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Dump Servlet</h1>");;
		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<table border='1' style='margin:auto'>");
		out.println("<thread><tr><th>Header Name</th><th>Header Value</th></tr></thread>");
		out.println("<tbody>");
		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.println("<tr><td>"+headerName+"</td><td>"+headerValue+"</td></tr>");
		}
		out.println("</tbody>");
		out.println("</table>");
		
		out.println("<table border='1' style='margin:auto'>");
		Enumeration<String> paramNames = request.getParameterNames();
		out.println("<h2>收到的資料有:</h2>");
		out.println("<tr><th>欄位名稱</th><th>欄位值</th></tr>");
		while(paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			String value;
			if(name.equals("habit")) {
				value = Arrays.toString(request.getParameterValues(name));
			}else {
				value = request.getParameter(name);
			}
			out.println("<tr><td>"+name+"</td><td>"+value+"</td></tr>");
		}
		out.println("</table>");
		out.println("<img src='"+croot+"/image/latiyas.jpg' width='500px' />");
		out.println("<br/><a href ='"+croot+"/'>Back</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
