package com.empresa;

import java.util.Scanner;

public class Empresa {

    //Atributos
    private String nombre;
    private String nit;
    private String direccion;
    private String telefono;
    private Carros[] carro;
    private Motos[] moto;

    //Constructores
    public Empresa (String nombre, String nit, String direccion, String telefono){
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        carro = new Carros[50];
        moto = new Motos[50];
    }

    public Empresa(){
        Inicializar();
    }

    public void Inicializar(){
        nombre="";
        nit="";
        direccion="";
        telefono="";
        carro = new Carros[0];
        moto = new Motos[0];
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

    public Carros getCarro(int pos){
        return carro[pos];
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

    public void setCarro (int pos, Carros carro){
        this.carro[pos] = carro;
    }

    //Acciones
    public void fabricar_carro(String modelo, String placa){
        //Creando carro
        Carros carro = new Carros(modelo, placa);
        this.carro[0] = carro;
        System.out.println("Carro creado con exito\n");
    }
    
    public void fabricar_moto(String modelomoto, String placamoto){
        Motos moto = new Motos(modelomoto, placamoto);
        this.moto[0] = moto;
        System.out.println("Moto creada con exito\n");
    }

    public void Solicitar_datos(){
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Ingrese el modelo del carro: ");
            String modelo = scan.nextLine();
            System.out.print("Ingrese la placa del carro: ");
            String placa = scan.nextLine();
            fabricar_carro(modelo, placa);

            System.out.print("Ingrese el modelo de la moto: ");
            String modelomoto = scan.nextLine();
            System.out.print("Ingrese la placa de la moto: ");
            String placamoto = scan.nextLine();
            fabricar_moto(modelomoto, placamoto);

        } catch (Exception e) {
            System.out.print("Ingrese datos validos para carros");
        }
    }
}
