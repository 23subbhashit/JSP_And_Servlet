package com.FirstDemo;

import javax.servlet.http.*;
import java.io.*;
public class AddNum extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		//System.out.println("result : "+k);
		PrintWriter writer = res.getWriter();
		writer.println("result  " + k);
	}

}
