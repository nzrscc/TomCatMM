package it.DTO;


public class UserDTO implements Comparable {

    private int ID;
    private String nome;
    private double punteggio;

    public UserDTO() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(double punteggio) {
        this.punteggio = punteggio;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
