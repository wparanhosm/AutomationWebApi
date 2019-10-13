package AutomationWebApi.com.br.dao;

import AutomationWebApi.com.br.factory.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoConnection {

    public boolean get() {
        String comando = "select count(*) as conexao from conexao";
        int value = 0;
        try{
            PreparedStatement stmt = new ConnectionFactory().getConnection().prepareStatement(comando);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                value = rs.getInt("conexao");
            }
        }catch(SQLException ex){
            Logger.getLogger(AutomationWebApi.com.br.dao.DaoConnection.class.getName()).log(Level.SEVERE, null, ex + "Erro ao executar busca");
        }

        return value > 0 ;
    }
}
