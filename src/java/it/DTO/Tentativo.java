package it.DTO;


public class Tentativo implements Comparable{
    private String user;
    private int posEsatta;
    private int numEsatto;
    private String soluzione;
    private int input;
    private int nTentativi;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public String getSoluzione() {
        return soluzione;
    }

    public void setSoluzione(String soluzione) {
        this.soluzione = soluzione;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getnTentativi() {
        return nTentativi;
    }

    public void setnTentativi(int nTentativi) {
        this.nTentativi = nTentativi;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
