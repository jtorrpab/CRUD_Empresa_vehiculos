package com.empresa;

public class Empresa {

    //Atributos
    private String nombre;
    private String nit;
    private String direccion;
    private String telefono;

    //Constructores
    public Empresa (String nombre, String nit, String direccion, String telefono){
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Empresa(){
        Inicializar();
    }

    public void Inicializar(){
        nombre="";
        nit="";
        direccion="";
        telefono="";
    }

    //Consultores
    public String getNombre(){
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getTelefono(){
        return telefono;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    //Modificadores

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNit(String nit){
        this.nit = nit;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    //Acciones
    public void fabricar_carro(){

    }
    
    public void fabricar_moto(){
        
    }

    public void Solicitar_datos_carro(){

    }

    public void Solicitar_datos_moto(){

    }
    
}
