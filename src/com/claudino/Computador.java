package com.claudino;

public class Computador {
    private int idComputador;
    private String nomeComputador;
    private int qtdMemoria;
    private  double valor;

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public String getNomeComputador() {
        return nomeComputador;
    }

    public void setNomeComputador(String nomeComputador) {
        this.nomeComputador = nomeComputador;
    }

    public int getQtdMemoria() {
        return qtdMemoria;
    }

    public void setQtdMemoria(int qtdMemoria) {
        this.qtdMemoria = qtdMemoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void listarDados(){
        this.valor = 1.000;

    }
    public void atualizarPreço(double valor, Usuario usu){
    }
    public void impremir(){
        System.out.println("O computador custa " +valor);
    }
}
