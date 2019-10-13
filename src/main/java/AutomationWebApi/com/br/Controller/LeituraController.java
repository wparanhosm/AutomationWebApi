package AutomationWebApi.com.br.Controller;
/*
import com.google.gson.Gson;
import readingTracker.com.br.BLL.LeituraBLL;
import readingTracker.com.br.model.*;*/
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LeituraController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
/*
        LeituraModel oLeitura = new LeituraModel();
        LeituraBLL oLeituraBLL = new LeituraBLL();
        requestStatus oRequestStatus = new requestStatus(false);
        String mensagem;
        Gson gson = new Gson();
        List<Object> obj = new ArrayList<>();

        String action = request.getParameter("action");
        String idLeitura = request.getParameter("id");
        String idLeitor =  request.getParameter("idLeitor");
        String idLivro = request.getParameter("idLivro");
        String statusLeitura = request.getParameter("statusLeitura");
        String paginasLidas = request.getParameter("paginasLidas");
        String dataTerminoPlanejado = request.getParameter("dataTerminoPlanejado");

        //Obtem dados e popula objeto oLeituraModel
        if(tryParseInt(idLeitura)){
            oLeitura.setId(Integer.parseInt(idLeitura));
        }else{
            oLeitura.setId(0);
        }

        if(tryParseInt(idLeitor)){
            oLeitura.setId_Leitor(Integer.parseInt(idLeitor));
        }else{
            oLeitura.setId_Leitor(0);
        }

        if(tryParseInt(idLivro)){
            oLeitura.setId_Livro(Integer.parseInt(idLivro));
        }

        if(tryParseInt(statusLeitura)){
            oLeitura.setStatusLeitura(Integer.parseInt(statusLeitura));
        }else{
            oLeitura.setStatusLeitura(0);
        }

        if(tryParseInt(paginasLidas)){
            oLeitura.setPaginasLidas(Integer.parseInt(paginasLidas));
        }else{
            oLeitura.setPaginasLidas(0);
        }

        oLeitura.setDataterminoPlanejado(dataTerminoPlanejado);

        //CRUD de leitura de acordo com campo action informado
        if (action != null  && !action.isEmpty()) {
            switch (action) {

                case "create": {


                    //Inserção de nova leitura
                    if (oLeituraBLL.novaLeitura(oLeitura)) {
                        oRequestStatus.setRequestStatus(true);
                    }

                    obj.add(oRequestStatus);
                    break;

                }

                case "edit": {

                    if (oLeituraBLL.editarLeitura(oLeitura)) {
                        oRequestStatus.setRequestStatus(true);
                    }

                    obj.add(oRequestStatus);
                    break;
                }

                case "listar": {
                    List<LeituraModel> lstLeitura;

                    //Consulta de Leituras por ID do usuario
                    lstLeitura = oLeituraBLL.listarLeiturasPorLeitor(oLeitura.getId_Leitor());

                    if(lstLeitura == null || lstLeitura.isEmpty()){
                        oRequestStatus.setRequestStatus(false);
                    }else{
                        oRequestStatus.setRequestStatus(true);
                    }

                    obj.add(oRequestStatus);
                    obj.add(lstLeitura);


                    break;
                }

                case "obterPorId": {

                    //Obtem um objeto leitura
                    oLeitura = oLeituraBLL.obterLeitura(oLeitura.getId());

                    if(!oLeitura.equals(null)){
                        oRequestStatus.setRequestStatus(true);
                    }

                    obj.add(oRequestStatus);
                    obj.add(oLeitura);

                    break;
                }

                default:{
                    mensagem = "Ação invalida!";
                    obj.add(oRequestStatus);
                    obj.add(mensagem);
                }

            }
        }else{
            mensagem = "falta açao!";
            obj.add(oRequestStatus);
            obj.add(mensagem);
        }

        //Serializa retorno e o envia
        String myJson = gson.toJson(obj);
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(myJson);

    }

    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
*/
    }
}
