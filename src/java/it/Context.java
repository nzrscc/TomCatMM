package it;

import it.controllers.Controller;
import it.controllers.ControllerClassifiche;
import it.models.CombinationRepository;
import it.models.Dao;
import it.models.TryRepository;
import it.services.CombinationService;
import it.services.TryService;
import it.services.UserService;
import it.services.ValidatorService;
import it.services.utils.Checker;
import it.services.utils.CheckerMasterMind;

public class Context {
    private static Context istanzaContesto;
    private Controller controller;
    private ControllerClassifiche controllerClassifiche;


    public static Context getInstance() {
        if (istanzaContesto == null) {
            istanzaContesto = new Context();
        }
        return istanzaContesto;
    }

    private Context()
    {
        Checker checkerMasterMind=new CheckerMasterMind();
        //Comparatore comparatore=new Comparatore();
        Dao instanceDao=Dao.newIstance();
        TryRepository tryRepository =new TryRepository(instanceDao);
        CombinationRepository combinationRepository =new CombinationRepository(instanceDao);
        CombinationService combinationService=new CombinationService(combinationRepository, checkerMasterMind);
        TryService tryService=new TryService(tryRepository);
        UserService userService=new UserService(combinationService, tryService);
        ValidatorService validatorService=new ValidatorService();
        this.controllerClassifiche=new ControllerClassifiche(userService,tryService,combinationService);
        this.controller=new Controller(validatorService, combinationService, tryService);
    }

    public Controller getController(){
        return  this.controller;
    }

    public ControllerClassifiche getControllerClassifiche()
    {
        return this.controllerClassifiche;
    }

}
