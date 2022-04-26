import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author william
 *
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 未來團隊可能會要求打方法的註解唷！
	 * @param request 請求物件
	 * @param response 回應物件
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello from Servlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
