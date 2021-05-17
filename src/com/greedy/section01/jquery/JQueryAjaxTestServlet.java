package com.greedy.section01.jquery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jquery")
public class JQueryAjaxTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		System.out.println(name);
		
		String output = name + "님 환영합니다.";
		response.setContentType("text/plain; charset=utf-8"); // text는 일반 text
		
		// 요청에 대한 응답은 Writer로 한다. (화면에 표시)
		PrintWriter out = response.getWriter(); // html에서 responseText가 받아서 innerText에 넣어줌
		out.print(output);
		
		out.flush();
		out.close();
	}

}
