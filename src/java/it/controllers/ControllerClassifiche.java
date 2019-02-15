package it.controllers;

import java.util.Comparator;
import it.DTO.UserDTO;
import it.services.TentativeService;
import it.services.UserService;



public class ControllerClassifiche {
    private UserService userService;
    private TentativeService  tentativeService;

    public ControllerClassifiche(UserService userService, TentativeService tentativeService) {
        this.userService=userService;
        this.tentativeService=tentativeService;
    }

    public boolean classificaUser()
    {
        //this.userService.prendiArrayList().sort((Comparator<? super UserDTO>) this.userService.prendiArrayList());
        this.userService.prendiArrayList();
        return true;
    }

    public boolean classificaTentativi()
    {
        this.tentativeService.prendiArrayList();
        return true;
    }








}
