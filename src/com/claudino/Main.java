package com.claudino;

public class Main {

    public static void main(String[] args) {
        Usuario p = new Usuario();
        p.setNomeUsuario("Thiago");
        p.setNivel(1);
        p.setIdUsuario(145);
        p.imprimir();

        Computador c1 = new Computador();
        c1.setValor(2.000);
        c1.impremir();
    }
}
