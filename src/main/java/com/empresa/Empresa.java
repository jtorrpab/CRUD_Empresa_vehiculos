package com.empresa;

import java.util.Scanner;

public class Empresa {

//#region Atributos
    private String nombre;
    private String nit;
    private String direccion;
    private String telefono;
    private Carros[] carro;
    private Motos[] moto;
//#endregion Atributos

//#region Constructores
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
//#endregion Atributos

//#region Consultores
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
//#endregion Consultores

//#region Modificadores
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
//#endregion Modificadores

//#region Acciones
    public void fabricar_carro(String modelo, String placa, Double vel_maxima, String color){
        //Creando carro
        Carros carro = new Carros(color, vel_maxima, modelo, placa);
        for(int i = 0; i <= this.carro.length; i ++){
            if(this.carro[i] == null){
                this.carro[i]=carro;
                break;
            }
        };
        System.out.println("Carro creado con exito\n");
    }
    
    public void fabricar_moto(String modelomoto, String placamoto, Double vel_maximamoto, String colormoto){
        //Creando moto
        Motos motos = new Motos(colormoto, vel_maximamoto, modelomoto, placamoto);
        for(int i=0; i<=this.moto.length;i++){
            if(this.moto[i]==null){
                this.moto[i] = motos;
                break;
            }
        }
        System.out.println("Moto creada con exito\n");
    }

    public void Solicitar_datos(Scanner scan){
        System.out.print("Diligencia el siguiente formulario para crear un carro\n");
        System.out.print("Ingrese el modelo del carro: ");
        String modelo = scan.next();
        System.out.print("Ingrese la placa del carro: ");
        String placa = scan.next();
        System.out.print("Ingrese la velocidad maxima del carro: (K/h) ");
        Double vel_maxima = scan.nextDouble();
        System.out.print("Ingrese el color del carro: ");
        String color = scan.next();
        fabricar_carro(modelo, placa, vel_maxima, color);
    }

    public void Solicitar_datos_moto(Scanner scan){
        System.out.print("Diligencia el siguiente formulario para crear una moto\n");
        System.out.print("Ingrese el modelo de la moto: ");
        String modelomoto = scan.next();
        System.out.print("Ingrese la placa de la moto: ");
        String placamoto = scan.next();
        System.out.print("Ingrese la velocidad maxima de la moto: (K/h) ");
        Double vel_maximamoto = scan.nextDouble();
        System.out.print("Ingrese el color de la moto: ");
        String colormoto = scan.next();
        fabricar_moto(modelomoto, placamoto, vel_maximamoto, colormoto);
    }

    public void Mostrar_carro(){
        for(int i = 0; i < carro.length;i++){
            if(carro[i] != null){
                System.out.println(carro[i]);
            }
        }      
    }

    public void Mostrar_moto(){
        for(int i= 0; i<this.moto.length;i++){
            if(moto[i] != null){
                System.out.println(moto[i]);
            }
        }
    Menu();
    }

    public void Mostrar_carro_placa(Scanner scan){
        System.out.print("Ingrese la placa del carro a consultar: ");
        String placa = scan.next();
        for(int i= 0; i<=this.carro.length;i++){
            if(carro[i] != null && carro[i].getPlaca().equalsIgnoreCase(placa)){
                System.out.println(carro[i]);
                break;
            }
        }
    }

    public void Mostrar_moto_placa(Scanner scan){
        System.out.print("Ingrese la placa de la moto a consultar: ");
        String placamoto = scan.next();
        for(int i= 0; i<=moto.length;i++){
            if(moto[i] != null && moto[i].getPlaca().equalsIgnoreCase(placamoto)){
                System.out.println(moto[i]);
                break;
            }
        }
    }

    public void Mostrar_carro_modelo(Scanner scan){
        System.out.print("Ingrese la placa de la moto a consultar: ");
        String modelo = scan.next();
        for(int i=0;i<=this.carro.length;i++){
            if(carro[i] != null && carro[i].getModelo().equalsIgnoreCase(modelo)){
                System.out.println(carro[i]);
                break;
            }
        }
    }

    public void Mostrar_moto_modelo(Scanner scan){
        System.out.print("Ingrese la placa de la moto a consultar: ");
        String modelomoto = scan.next();
        for(int i=0;i<=this.moto.length;i++){
            if(moto[i] != null && moto[i].getModelo().equalsIgnoreCase(modelomoto)){
                System.out.println(moto[i]);
                break;
            }
        }
    }

    public void Mostrar_carro_color(Scanner scan){
        System.out.print("Ingrese la placa de la moto a consultar: ");
        String color = scan.next();
        for(int i=0;i<=this.carro.length;i++){
            if(carro[i] != null && carro[i].getColor().equalsIgnoreCase(color)){
                System.out.println(carro[i]);
                break;
            }
        }
    }

    public void Mostrar_moto_color(Scanner scan){
        System.out.print("Ingrese la placa de la moto a consultar: ");
        String colormoto = scan.next();
        for(int i=0;i<=this.moto.length;i++){
            if(moto[i] != null && moto[i].getColor().equalsIgnoreCase(colormoto)){
                System.out.println(moto[i]);
                break;
            }
        }
    }
//#endregion Acciones

//#region Menu
    public void Menu(){
        String menu = "\n----------------Bienvenido a la empresa " +nombre+" Fabricantes de vehiculos----------------\n";
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
                        Solicitar_datos(scan);
                        break;
                    case 2:
                        Solicitar_datos_moto(scan);
                        break;
                    case 3:
                        Mostrar_carro();
                        break;
                    case 4:
                        Mostrar_moto();      
                        break;
                    case 5:
                        Mostrar_carro_placa(scan);
                        break;
                    case 6:
                        Mostrar_moto_placa(scan);
                        break;
                    case 7:
                        Mostrar_carro_modelo(scan);
                        break;
                    case 8:
                        Mostrar_moto_modelo(scan);
                        break;
                    case 9:
                        Mostrar_carro_color(scan);
                        break;
                    case 10:
                        Mostrar_moto_color(scan);
                        break;
                    case -1:
                        break;
                }
            } while(opcion != -1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//#endregion Menu
}
