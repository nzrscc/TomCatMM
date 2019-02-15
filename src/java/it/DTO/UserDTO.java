package it.DTO;


import it.services.utils.ToComparator;

public class UserDTO implements Comparable<UserDTO>, ToComparator {

    private int ID;
    private String nome;
    private double punteggio;

    public UserDTO() {

    }

    @Override
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
    public int compareTo(UserDTO dto) {
        int result;
        result= Integer.parseInt(String.valueOf(this.punteggio-dto.punteggio));
        return result;
    }
}
