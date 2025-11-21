package com.azienda;

public class Dipendente {
    private String nome;
    private String cognome;
    private Ruolo Ruolo;
    private int ral;

    public Dipendente(String nome, String cognome,Ruolo Ruolo, int ral) {
        this.nome = nome;
        this.cognome = cognome;
        this.Ruolo = Ruolo;
        this.ral = ral;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public int getRal() {
        return ral;
    }
    public Ruolo getRuolo() {
        return Ruolo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setRal(int ral) {
        this.ral = ral;
    }
}
