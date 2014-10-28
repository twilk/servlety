package com.example.servletjspdemo.domain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/PersonFORMdata")
public class PersonFORModbierz extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String podaneImie = "";
		for (String imie : request.getParameterValues("imie")) {
			podaneImie += imie + " ";
		}
		String podaneNazwisko = "";
		for (String nazwisko : request.getParameterValues("nazwisko")) {
			podaneNazwisko += nazwisko + " ";
		}
		String podanaPlec = "";
		for (String plec : request.getParameterValues("plec")) {
			podanaPlec += plec + " ";
		}
		String podaneHobby = "";
		for (String hobby : request.getParameterValues("hobby")) {
			podaneHobby += hobby + " ";
		}
/*		
		+ "imie:<br/>  <input type=\"tekst\" name=\"imie\"/> <br/> "
		+ "nazwisko:<br/>  <input type=\"tekst\" name=\"nazwisko\"/> <br/>"
		+ "plec: <br/>"
		+ "<input type=\"radio\" name=\"plec\" value=\"M\" /> M <br/>"
		+ "<input type=\"radio\" name=\"plec\" value\"K\" /> K <br/>"
		+ "Hobby:<br/>"
		+ "<input type=\"checkbox\" name=\"nazwa\" value=\"informatyka\" id=\"pole1\" />"
		+ "<label for=\"pole1\">informatyka</label><br/>"
		+ "<input type=\"checkbox\" name=\"nazwa\" value=\"gornictwo\" id=\"pole2\" />"
		+ "<label for=\"pole2\">gornictwo</label><br/>"
		+ "<input type=\"checkbox\" name=\"nazwa\" value=\"znaczki pocztowe\" id=\"pole3\" />"
		+ "<label for=\"pole3\">znaczki pocztowe</label><br/>"
		+ "Opis:<br/>"
		+ " <textarea rows=\"4\" cols=\"50\">"
		+ "Napisz cos o sobie</textarea> <br/>"
		+ "Wyksztalcenie:<br/>"
		+ " <select>"
		+ "<option value=\"podstawowe\">podstawowe</option>"
		+ "<option value=\"gimnazjalne\">gimnazjalne</option>"
		+ "<option value=\"sre`dnie\">srednie</option>"
		+ "<option value=\"wyzsze\">wyzsze</option>"
		+ "</select> <br/>"
		+ "Prawo jazdy:<br/>"
		+ " <select multiple>"
		+ "<option value=\"A\">A</option>"
		+ "<option value=\"B\">B</option>"
		+ "<option value=\"C\">C</option>"
		+ "<option value=\"D\">D</option>"
		+ "<option value=\"E\">E</option>"
		+ "</select> <br/>"
		+ "<input type=\"submit\" value=\"Wyslij!\">"
		+ "</form>"
*/
		out.println("<html><body><h2>Twoje dane</h2>" +
				"<p>Imie: " + podaneImie + "<br />" +
				"<p>Nazwisko: " + podaneNazwisko + "<br />" +
				"<p>Plec: " + podanaPlec + "<br />" +
				"<p>Hobby: " + podaneHobby + "<br />" +
				"<p>Plec: " + podanaPlec + "<br />" +
				"</body></html>");
		out.close();
	}

}
