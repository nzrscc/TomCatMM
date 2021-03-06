package it.controllers;

import it.services.CombinationService;
import it.services.TryService;
import it.services.ValidatorService;

public class Controller {
    private ValidatorService validatorService;
    private CombinationService combinationService;
    private TryService tryService;
    private int[] soluzione=new int[3];
    private int[] input=new int[3];
    private int[] esito=new int[2];
    private int MaxID=0;

    public int[] getSoluzione() {
        return soluzione;
    }

    public int[] getInput() {
        return input;
    }

    public void setUsername(String username)
    {
        combinationService.setUsername(username);
    }

    public int[] getEsito() {
        return esito;
    }

    public Controller(ValidatorService validatorService, CombinationService combinationService, TryService tryService) {
        this.combinationService=combinationService;
        this.validatorService=validatorService;
        this.tryService=tryService;
    }

    public void creaCombinazione()
    {
        this.soluzione = this.combinationService.create();
    }

    public void verificaInput(String combination)
    {
        this.input=this.validatorService.controlloInput(combination);
    }

    public void verificaCombinazione()
    {
        this.esito=this.combinationService.check(this.soluzione,this.input);
    }

    public void salvaGiocata(int nTentativi)
    {
        this.tryService.save(nTentativi,input,esito);
    }




}
