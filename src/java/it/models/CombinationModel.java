package it.models;

import java.util.Date;

public class CombinationModel {
    private int id;
    private String username;

    public CombinationModel() {
    }

    public CombinationModel(int id, String username, String soluzione, Date data) {
        this.id = id;
        this.username = username;
        this.soluzione = soluzione;
        this.data = data;
    }

    private String soluzione;
    private Date data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSoluzione() {
        return soluzione;
    }

    public void setSoluzione(String soluzione) {
        this.soluzione = soluzione;
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
