package AutomationWebApi.com.br.Controller;

import AutomationWebApi.com.br.BLL.ConnectionBLL;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

//@WebServlet("/ConnectionController")
public class ConnectionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        boolean isConnection = new ConnectionBLL().isConnection();

        HashMap m = new HashMap();
        m.put("connection",isConnection);
        Object obj =  m;

        Gson gson = new Gson();
        String myJson = gson.toJson(obj);
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(myJson);
    }
}
