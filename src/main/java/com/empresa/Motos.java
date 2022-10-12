package com.empresa;

public class Motos {
    
    //Atributos
    private String colormoto;
    private Double vel_maximamoto;
    private String modelomoto;
    private String placamoto;

    //Constructores
    public Motos(String colormoto, Double vel_maximamoto, String modelomoto, String placamoto){
        this.colormoto = colormoto;
        this.vel_maximamoto = vel_maximamoto;
        this.modelomoto = modelomoto;
        this.placamoto = placamoto;
    }

    public Motos(String modelomoto, String placamoto){
        this.modelomoto = modelomoto;
        this.placamoto = placamoto;
    }

    public Motos(){
        Inicializar();
    }

    public void Inicializar(){
        colormoto="";
        vel_maximamoto= 0.0;
        modelomoto="";
        placamoto="";
    }

    //Mostrar motos
    @Override
    public String toString() {
        String info_moto = "----------------Moto--------------\n";
        info_moto += "Placa" + placamoto;
        info_moto += "\nModelo" + modelomoto;
        info_moto += "\nVelocidad maxima" + vel_maximamoto;
        info_moto += "\nColor" + colormoto;
        info_moto += "\n------------------------------\n";
        return info_moto;
    }

    //Consultores
    public String getColor(){
        return colormoto;
    }

    public Double getVel_Maxima(){
        return vel_maximamoto;
    }

    public String getModelo(){
        return modelomoto;
    }

    public String getPlaca(){
        return placamoto;
    }

    //Modificadores
    public void setColor(String colormoto){
        this.colormoto = colormoto;
    }

    public void setVel_Maxima(Double vel_maximamoto){
        this.vel_maximamoto = vel_maximamoto;
    }

    public void setPlaca(String placamoto){
        this.placamoto = placamoto;
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
