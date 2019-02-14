package it.controllers;

import it.services.CombinationService;
import it.services.TentativeService;
import it.services.TryService;
import it.services.UserService;

public class ControllerClassifiche {
    private UserService userService;
    private TentativeService  tentativeService;

    public ControllerClassifiche(UserService userService, TentativeService tentativeService) {
        this.userService=userService;
    }

    public boolean classificaUser()
    {
        this.userService.prendiArrayList();
        return true;
    }//metodo per classifica che continene al suo interno i vari metodi

    public boolean classificaTentativi()
    {
        this.tentativeService.prendiArrayList();

        return true;
    }








}
