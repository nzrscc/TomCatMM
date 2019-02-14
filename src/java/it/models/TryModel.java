package it.models;

import java.util.Date;

public class TryModel {
    private int idComb;
    private int id;
    private int posEsatta;
    private int numEsatto;
    private String input;
    private Date data;

    public int getIdComb() {
        return idComb;
    }

    public void setIdComb(int idComb) {
        this.idComb = idComb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosEsatta() {
        return posEsatta;
    }

    public void setPosEsatta(int posEsatta) {
        this.posEsatta = posEsatta;
    }

    public int getNumEsatto() {
        return numEsatto;
    }

    public void setNumEsatto(int numEsatto) {
        this.numEsatto = numEsatto;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    // parametri tabella
    // gettere and setter
    // costruttore ()
    // construttore (tutti i parametri)
}
