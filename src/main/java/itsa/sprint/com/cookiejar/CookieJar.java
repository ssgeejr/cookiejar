package itsa.sprint.com.cookiejar;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieJar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CookieJar() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("REQUEST [init]");
		
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("REQUEST [service]");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("REQUEST [doGet]");
		StringBuffer menu = new StringBuffer();
		System.out.println("<img src=\"details.png\" alt=\"Details regarding the upcoming session\"/>\n");
		menu.append("<img src=\"details.png\" alt=\"Details regarding the upcoming session\"/>\n");
		System.out.println("<img src=\"laptop.png\" alt=\"Setup Your Laptop for the Brown Bag Session\"/>\n");
		menu.append("<img src=\"laptop.png\" alt=\"Setup Your Laptop for the Brown Bag Session\"/>\n");
		System.out.println("<img src=\"patrons.png\" alt=\"Those signed up\"/>\n");
		menu.append("<img src=\"patrons.png\" alt=\"Those signed up\"/>\n");
		System.out.println("<img src=\"contact.png\" alt=\"Questions, Issues, Bugs & Support\"/>\n");
		menu.append("<img src=\"contact.png\" alt=\"Questions, Issues, Bugs & Support\"/>\n");

		response.getWriter().write(menu.toString());
		response.getWriter().flush();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("REQUEST [doPost]");
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("REQUEST [doPut]");
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("REQUEST [doDelete]");
	}

}
