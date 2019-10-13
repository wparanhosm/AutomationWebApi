package AutomationWebApi.com.br.BLL;

import AutomationWebApi.com.br.dao.DaoLeds;
import AutomationWebApi.com.br.model.LedsModel;

import java.util.ArrayList;
import java.util.List;

public class LedsBLL {
    public List<LedsModel> get(){

        List<Object> lstDao = new DaoLeds().get();

        List<LedsModel> lstModel = new ArrayList<>();

        for(Object dao : lstDao){
            lstModel.add((LedsModel)dao);
        }

        return lstModel;
    }
}
