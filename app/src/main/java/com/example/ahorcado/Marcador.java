package com.example.ahorcado;

import java.util.ArrayList;

public class Marcador {
    private String Estado;
    private String Solucion;
    private ArrayList<Character> letras;
    private int Fallos;
    public String getEstado(){
        return this.Estado;
    }
    public void setSolucion(String pal){

        this.Solucion=pal;
        for(int i=0; i<pal.length();i++){
            if(i==0||i==pal.length()){

            }else{

                //Hacer aqui
                this.Estado.charAt(i)=this.Solucion.charAt(i);
            }
        }
    }
    public String getSolucion(){
        return this.Solucion;
    }
    public boolean comprobar(char c){
        //Actualiza Estado, buscando las
        // apariciones de char c en this.Solucion
        //Si encontramos TRUE
        //Sino FALSE y +1 fallo
        return true;
    }
    public void contarFallo(){
        //Suma 1 a fallos
    }
    public void Draw(){
        //Dibujar estado
        //Dibujar marcador
    }
}
