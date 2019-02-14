package it.controllers;

import it.services.CombinationService;
import it.services.TryService;
import it.services.UserService;

public class ControllerClassifiche {
    private UserService userService;
    private TryService tryService;
    private CombinationService combinationService;

    public ControllerClassifiche(UserService userService, TryService tryService, CombinationService combinationService) {
        this.userService=userService;
        this.tryService=tryService;
        this.combinationService=combinationService;
    }

    //metodo per classifica che continene al suo interno i vari metodi








}
