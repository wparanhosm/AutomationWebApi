package AutomationWebApi.com.br.dao;

import AutomationWebApi.com.br.factory.ConnectionFactory;
import AutomationWebApi.com.br.model.LedsModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoLeds implements Dao {
    @Override
    public boolean Save(Object object) {
        return false;
    }

    @Override
    public boolean Update(Object object) {
        return false;
    }

    @Override
    public boolean Delete(int id) {
        return false;
    }

    @Override
    public Object get(int id) {
        return null;
    }

    @Override
    public List<Object> get() {
        List<Object> lstLeds = new ArrayList<>();

        String comando = "select nome,status from leds";
        try{
            PreparedStatement stmt = new ConnectionFactory().getConnection().prepareStatement(comando);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){

                LedsModel model = new LedsModel(
                        rs.getString("nome"),
                        rs.getInt("status")
                );

                lstLeds.add(model);
            }
        }catch(SQLException ex){
            Logger.getLogger(AutomationWebApi.com.br.dao.DaoConnection.class.getName()).log(Level.SEVERE, null, ex + "Erro ao executar busca");
        }

        return lstLeds;
    }
}
