package com.empresa;

public class Carros {
    
    //Atributos
    private String color;
    private Double vel_maxima;
    private String modelo;
    private String placa;

    //Constructores
    public Carros(String color, Double vel_maxima, String modelo, String placa){
        this.color = color;
        this.vel_maxima = vel_maxima;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carros(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carros(){
        Inicializar();
    }

    public void Inicializar(){
        color="";
        vel_maxima= 0.0;
        modelo="";
        placa="";
    }

    //Consultores
    public String getColor(){
        return color;
    }

    public Double getVel_Maxima(){
        return vel_maxima;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    //Modificadores
    public void setColor(String color){
        this.color = color;
    }

    public void setVel_Maxima(Double vel_maxima){
        this.vel_maxima = vel_maxima;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    //Acciones 
    public void Acelerar_Carros(){

    }

    public void Frenar_Carros(){

    }

    public void Girar_dere_Carros(){

    }

    public void Girar_izq_Carros(){

    }


}
