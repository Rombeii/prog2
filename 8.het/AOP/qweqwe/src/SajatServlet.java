

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SajatServlet
 */
public class SajatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SajatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		File kiFile = new File("/home/tamas/github/prog2/8.het/AOP/AOP/ki.txt");

		out.println("<!DOCTYPE html>");
		out.println("<html>");
			out.println("<head>");
				out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
			out.println("</head>");
			out.println("<body>");
				out.println("<h1> LZWBinfa java megvalositasanak kimeneti fileja: </h1>");
				try (BufferedReader br = new BufferedReader(new FileReader(kiFile))) {
				    String line;
				    while ((line = br.readLine()) != null) {
				       out.println("<p>" + line + "</p>");
				    }
				}
				
			out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
