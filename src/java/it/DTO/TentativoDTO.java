package it.DTO;


import it.services.utils.ToComparator;

public class TentativoDTO implements Comparable<TentativoDTO>, ToComparator {
    private String user;
    private int posEsatta;
    private int numEsatto;
    private String soluzione;
    private String input;
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

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getnTentativi() {
        return nTentativi;
    }

    public void setnTentativi(int nTentativi) {
        this.nTentativi = nTentativi;
    }

    @Override
    public int compareTo(TentativoDTO dto) {
        return 0;
    }

    @Override
    public int getID() {
        int result;
        result= this.nTentativi-nTentativi;
        return result;
    }
}
