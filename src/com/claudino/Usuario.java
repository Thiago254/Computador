package com.claudino;

public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private int nivel;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void imprimir(){
        System.out.println("O nome é " + this.nomeUsuario);
        System.out.println("Esta no nivel " + this.getNivel());
        System.out.println("Com o id " + this.idUsuario);
    }
}
