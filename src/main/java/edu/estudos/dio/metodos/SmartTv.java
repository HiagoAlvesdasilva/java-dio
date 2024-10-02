package edu.estudos.dio.metodos;

public class SmartTv {

    boolean estadoDaTv = false;
    int canal = 1;
    int volume= 21;

    public void ligar(){
        estadoDaTv=true;
    }
    public void desligar(){
        estadoDaTv=false;
    }

    public void imprimir(){
        System.out.println(estadoDaTv);
        System.out.println(canal);
        System.out.println(volume);
    }
}
