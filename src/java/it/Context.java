package it;

import it.controllers.Controller;
import it.models.CombinationModel;
import it.models.Dao;
import it.models.TryModel;
import it.services.CombinationService;
import it.services.TryService;
import it.services.ValidatorService;
import it.services.utils.Checker;
import it.services.utils.CheckerMasterMind;

public class Context {
    private static Context istanzaContesto;
    private Controller controller;


    public static Context getInstance() {
        if (istanzaContesto == null) {
            istanzaContesto = new Context();
        }
        return istanzaContesto;
    }

    private Context()
    {
        Checker checkerMasterMind=new CheckerMasterMind();
        Dao instanceDao=Dao.newIstance();
        TryModel tryModel=new TryModel(instanceDao);
        CombinationModel combinationModel=new CombinationModel(instanceDao);
        CombinationService combinationService=new CombinationService(combinationModel, checkerMasterMind);
        TryService tryService=new TryService(tryModel);
        ValidatorService validatorService=new ValidatorService();
        this.controller=new Controller(validatorService, combinationService, tryService);
    }

    public Controller getController(){
        return  this.controller;
    }

}
