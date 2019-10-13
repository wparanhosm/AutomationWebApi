package AutomationWebApi.com.br.Controller;

import AutomationWebApi.com.br.BLL.ConnectionBLL;
import AutomationWebApi.com.br.BLL.LedsBLL;
import AutomationWebApi.com.br.model.LedsModel;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

//@WebServlet("/ConnectionController")
public class LedsController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<LedsModel> lstModel = new LedsBLL().get();

        Gson gson = new Gson();
        String myJson = gson.toJson(lstModel);
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(myJson);
    }
}
