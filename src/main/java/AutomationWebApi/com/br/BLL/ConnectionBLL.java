package AutomationWebApi.com.br.BLL;

import AutomationWebApi.com.br.dao.DaoConnection;

public class ConnectionBLL {

    public boolean isConnection(){
        return new DaoConnection().get();
    }
}
