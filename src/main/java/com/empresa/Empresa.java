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

        } catch (Exception e) {
            System.out.print("Ingrese datos validos para carros");
        }
    }

    public void Solicitar_datos_moto(){
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Ingrese el modelo de la moto: ");
            String modelomoto = scan.nextLine();
            System.out.print("Ingrese la placa de la moto: ");
            String placamoto = scan.nextLine();
            fabricar_moto(modelomoto, placamoto);

        } catch (Exception e) {
            System.out.print("Ingrese datos validos para carros");
        }
    }

    public void Mostrar_carro(){

    }

    public void Mostrar_moto(){

    }

    public void Mostrar_carro_placa(){

    }

    public void Mostrar_moto_placa(){
        
    }

    public void Mostrar_carro_modelo(){
        
    }

    public void Mostrar_moto_modelo(){
        
    }

    public void Mostrar_carro_color(){
        
    }

    public void Mostrar_moto_color(){
        
    }

    public void Menu(){

        String menu = "----------------Bienvenido a la empresa " +nombre+"----------------\n";
        menu += "1) Fabricar carro \n";
        menu += "2) Fabricar moto \n";
        menu += "3) Mostrar todos los carros \n";
        menu += "4) Mostrar todas las motos \n";
        menu += "5) Mostrar carros por placa \n";
        menu += "6) Mostrar motos por placa \n";
        menu += "7) Mostrar carros por modelo \n";
        menu += "8) Mostrar motos por modelo \n";
        menu += "9) Mostrar carros por color \n";
        menu += "10) Mostrar motos por color \n";
        menu += "-1) Salir \n";

        try(Scanner scan = new Scanner(System.in)) {
            int opcion = 0;

            do{
                System.out.println(menu);
                opcion = scan.nextInt();

                switch (opcion){
                    case 1:
                        Solicitar_datos();
                        break;
                    case 2:
                        Solicitar_datos_moto();
                        break;
                    case 3:
                        Mostrar_carro();
                        break;
                    case 4:
                        Mostrar_moto();      
                        break;
                    case 5:
                        Mostrar_carro_placa();
                        break;
                    case 6:
                        Mostrar_moto_placa();
                        break;
                    case 7:
                        Mostrar_carro_modelo();
                        break;
                    case 8:
                        Mostrar_moto_modelo();
                        break;
                    case 9:
                        Mostrar_carro_color();
                        break;
                    case 10:
                        Mostrar_moto_color();
                        break;
                    case -1:
                        break;
                }
            } while(opcion != -1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
