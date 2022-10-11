package com.empresa;

public class Motos {
    
    //Atributos
    private String color;
    private Double vel_maxima;
    private String modelo;
    private String placa;

    //Constructores
    public Motos(String color, Double vel_maxima, String modelo, String placa){
        this.color = color;
        this.vel_maxima = vel_maxima;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Motos(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    public Motos(){
        Inicializar();
    }

    public void Inicializar(){
        color="";
        vel_maxima= 0.0;
        modelo="";
        placa="";
    }

    //Mostrar motos
    @Override
    public String toString() {
        String info_moto = "----------------Moto--------------";
        info_moto += "Placa" + placa;
        info_moto += "Modelo" + modelo;
        info_moto += "Velocidad maxima" + vel_maxima;
        info_moto += "Color" + color;
        return info_moto;
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
    public void Acelerar(){
        System.out.println("Acelerando...");
    }

    public void Frenar(){
        System.out.println("Frenando...");
    }

    public void Girar_dere(){
        System.out.println("Girando a la izquierda...");
    }

    public void Girar_izq(){
        System.out.println("Girando a la derecha...");
    }
}
