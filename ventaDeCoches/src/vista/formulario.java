/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author raul
 */
import modelo.Autobus;
import modelo.Camion;
import modelo.Moto;
import modelo.Coche;
import java.util.Scanner;

public class formulario {
    Scanner teclado = new Scanner(System.in);
    Coche miCoche = new Coche();
    Camion miCamion = new Camion();
    Autobus miAutobus = new Autobus();
    Moto miMoto = new Moto();
    int opcion;
    public Coche pideDatosCoche(){
        System.out.println("Escribe la marca del coche");
        miCoche.setMarca(teclado.nextLine());
        System.out.println("Escribe el modelo del coche");
        miCoche.setModelo(teclado.nextLine());
        System.out.println("Escribe el color del coche");
        miCoche.setColor(teclado.nextLine());
        System.out.println("Escribe el tipo de combustible");
        miCoche.setTipoDeCombustible(teclado.nextLine());
        System.out.println("Escribe la cilindrada");
        miCoche.setCilindrada(teclado.nextInt());
        System.out.println("Escribe el numero de plazas que tiene el coche");
        miCoche.setNumeroDePlazas(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Escribe a que categoria ambiental pertenece");
        System.out.println("Escribe 1 si es categoria A");
        System.out.println("Escribe 2 si es categoria B");
        System.out.println("Escribe 3 si es categoria C");
        System.out.println("Escribe 4 si es categoria ECO ");
        System.out.println("Escribe 5 si es categoria ZERO ");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.A);
                break;
            case 2:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.B);
                break;
            case 3:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.C);
                break;
            case 4:               
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.ECO);
                break;
            case 5:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.ZERO);
                break;
            default:
                    System.out.println("opcion incorrecta");
                    break;
        }
        
        System.out.println("Escribe el numero de puertas que tiene");
        miCoche.setNumeroDePuertas(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Escibe s si es descapotable y n si no lo es");
        char respuestaC = teclado.nextLine().charAt(0);
        if (respuestaC == 's' || respuestaC == 'S'){
            System.out.println("es descapotable");
            miCoche.setDescapotable(true);
        }else if(respuestaC == 'n' || respuestaC == 'N'){
            System.out.println("no es descapotable");
            miCoche.setDescapotable(false);
        }
        return miCoche;
    }
    
    public Moto pideDatosMoto(){
        System.out.println("Escribe la marca de la Moto");
        miMoto.setMarca(teclado.nextLine());
        System.out.println("Escribe el modelo de la Moto");
        miMoto.setModelo(teclado.nextLine());
        System.out.println("Escribe el color de la Moto");
        miMoto.setColor(teclado.nextLine());
        System.out.println("Escribe el tipo de combustible");
        miMoto.setTipoDeCombustible(teclado.nextLine());
        System.out.println("Escribe la cilindrada");
        miMoto.setCilindrada(teclado.nextInt());
        System.out.println("Escribe el numero de plazas que tiene la moto");System.out.println("Escribe 1 si es categoria A");
        System.out.println("Escribe 2 si es categoria B");
        System.out.println("Escribe 3 si es categoria C");
        System.out.println("Escribe 4 si es categoria ECO ");
        System.out.println("Escribe 5 si es categoria ZERO ");
        
        miMoto.setNumeroDePlazas(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Escribe a que categoria ambiental pertenece");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.A);
                break;
            case 2:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.B);
                break;
            case 3:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.C);
                break;
            case 4:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.ECO);
                break;
            case 5:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.ZERO);
                break;
            default:
                    System.out.println("opcion incorrecta");
                    break;
        }
        System.out.println("Escribe que tipo de moto es");
        miMoto.setTipoDeMoto(teclado.nextLine());
        System.out.println("Escribe el numero de ruedas que tiene");
        miMoto.setNumeroDeRuedas(teclado.nextInt());
        
        return miMoto;
    }
    
    public Autobus pideDatosAutobus(){
        System.out.println("Escribe la marca del Autobus");
        miAutobus.setMarca(teclado.nextLine());
        System.out.println("Escribe el modelo del Autobus");
        miAutobus.setModelo(teclado.nextLine());
        System.out.println("Escribe el color del Autobus");
        miAutobus.setColor(teclado.nextLine());
        System.out.println("Escribe el tipo de combustible");
        miAutobus.setTipoDeCombustible(teclado.nextLine());
        System.out.println("Escribe la cilindrada");
        miAutobus.setCilindrada(teclado.nextInt());
        
        System.out.println("Escribe el numero de plazas que tiene el Autobus");
        miAutobus.setNumeroDePlazas(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Escribe a que categoria ambiental pertenece");
        System.out.println("Escribe 1 si es categoria A");
        System.out.println("Escribe 2 si es categoria B");
        System.out.println("Escribe 3 si es categoria C");
        System.out.println("Escribe 4 si es categoria ECO ");
        System.out.println("Escribe 5 si es categoria ZERO ");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.A);
                break;
            case 2:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.B);
                break;
            case 3:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.C);
                break;
            case 4:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.ECO);
                break;
            case 5:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.ZERO);
                break;
            default:
                    System.out.println("opcion incorrecta");
                    break;
        } 
        System.out.println("Escribe si es publico  s si es privado escribe n");
        char respuestaA = teclado.nextLine().charAt(0);
        if (respuestaA == 's' || respuestaA == 'S'){
            System.out.println("Es publico");
            miAutobus.setPublicoPrivado(true);
        }else if(respuestaA == 'n' || respuestaA == 'N'){
            System.out.println("Es privado");
            miAutobus.setPublicoPrivado(false);
        }
            System.out.println("Escribe si es articulado s si no lo es escribe n");
            char respuestaA2 = teclado.nextLine().charAt(0);
        if (respuestaA2 == 's' || respuestaA2 == 'S'){
            System.out.println("Es articulado");
            miAutobus.setArticuladoNoArticulado(true);
        }else if(respuestaA2 == 'n' || respuestaA2 == 'N'){
            System.out.println("No es articulado");
            miAutobus.setArticuladoNoArticulado(false);
        }
            System.out.println("Escribe si es urbano un s si no es urbano escribe n");
            char respuestaA3 = teclado.nextLine().charAt(0);
        if (respuestaA3 == 's' || respuestaA3 == 'S'){
            System.out.println("Es urbano");
            miAutobus.setUrbanoNoUrbano(true);
        }else if(respuestaA3 == 'n' || respuestaA3 == 'N'){
            System.out.println("No es urbano");
            miAutobus.setUrbanoNoUrbano(false);
        }
        
        return miAutobus;
        
    }
    
    public Camion pideDatosCamion(){
        System.out.println("Escribe la marca del Camion");
        miCamion.setMarca(teclado.nextLine());
        System.out.println("Escribe el modelo del Camion");
        miCamion.setModelo(teclado.nextLine());
        System.out.println("Escribe el color del Camion");
        miCamion.setColor(teclado.nextLine());
        System.out.println("Escribe el tipo de combustible");
        miCamion.setTipoDeCombustible(teclado.nextLine());
        System.out.println("Escribe la cilindrada");
        miCamion.setCilindrada(teclado.nextInt());
        System.out.println("Escribe el numero de plazas que tiene el Camion");
        miCamion.setNumeroDePlazas(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Escribe a que categoria ambiental pertenece");
        System.out.println("Escribe a que categoria ambiental pertenece");
        System.out.println("Escribe 1 si es categoria A");
        System.out.println("Escribe 2 si es categoria B");
        System.out.println("Escribe 3 si es categoria C");
        System.out.println("Escribe 4 si es categoria ECO ");
        System.out.println("Escribe 5 si es categoria ZERO ");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.A);
                break;
            case 2:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.B);
                break;
            case 3:

                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.C);
                break;
            case 4:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.ECO);
                break;
            case 5:
                miCoche.setCategoriaAmbiental(Coche.CategoriaAmbiental.ZERO);
                break;
            default:
                    System.out.println("opcion incorrecta");
                    break;
        }
        System.out.println("Escribe la tara");
        miCamion.setTara(teclado.nextInt());
        System.out.println("Escribe el galibo");
        miCamion.setGalibo(teclado.nextInt());
        
        return miCamion;
    }
    public void muestraDatosCoche (){
        System.out.println("-------------------------------------");
        System.out.println("la marca del coche es: " + miCoche.getMarca());
        System.out.println("El modelo del coche es: " + miCoche.getModelo());
        System.out.println("El color del coche es: " + miCoche.getColor());
        System.out.println("El tipo de combustible del vehiculo es" + miCoche.getTipoDeCombustible());
        System.out.println("La cilindrada del coche es de " + miCoche.getCilindrada() + "cm^3");
        System.out.println("El numero de plazas del vehiculo es de: " + miCoche.getNumeroDePlazas());
        System.out.println("La categoria ambiental del vehiculo es:" + miCoche.getCategoriaAmbiental());
        System.out.println("El numero d puertas es de: " + miCoche.getNumeroDePuertas());
        if(miCoche.isDescapotable()){
            System.out.println("este"+ miCoche.getMarca() + miCoche.getModelo() + " es descapotable");
        }else{
            System.out.println("este"+ miCoche.getMarca() + miCoche.getModelo() + "no es descapotable");
        }
    }
    
    public void muestraDatosMoto (){
        System.out.println("-------------------------------------");
        System.out.println("la marca de la moto es: " + miMoto.getMarca());
        System.out.println("El modelo de la moto es: " + miMoto.getModelo());
        System.out.println("El color del moto es: " + miMoto.getColor());
        System.out.println("El tipo de combustible del vehiculo es" + miMoto.getTipoDeCombustible());
        System.out.println("La cilindrada de la moto es de " + miMoto.getCilindrada() + "cm^3");
        System.out.println("El numero de plazas del vehiculo es de: " + miMoto.getNumeroDePlazas());
        System.out.println("La categoria ambiental del vehiculo es:" + miMoto.getCategoriaAmbiental());
        System.out.println("EL tipo de moto es:" + miMoto.getTipoDeMoto());
        System.out.println("La cantidad de ruedas que tiene es de:" + miMoto.getNumeroDeRuedas());
    }
    
    public void muestraDatosAutobus (){
        System.out.println("-------------------------------------");
        System.out.println("la marca de la autobus es: " + miAutobus.getMarca());
        System.out.println("El modelo de la autobus es: " + miAutobus.getModelo());
        System.out.println("El color del autobus es: " + miAutobus.getColor());
        System.out.println("El tipo de combustible del vehiculo es" + miAutobus.getTipoDeCombustible());
        System.out.println("La cilindrada de la autobus es de " + miAutobus.getCilindrada() + "cm^3");
        System.out.println("El numero de plazas del vehiculo es de: " + miAutobus.getNumeroDePlazas());
        System.out.println("La categoria ambiental del vehiculo es:" + miAutobus.getCategoriaAmbiental());
        if(miAutobus.isPublicoPrivado()){
            System.out.println("este"+ miAutobus.getMarca()+ miAutobus.getModelo() + "es publico");
        }else{
            System.out.println("este"+ miAutobus.getMarca() + miAutobus.getModelo() + "es privado");
        }
        if(miAutobus.isArticuladoNoArticulado()){
            System.out.println("este"+ miAutobus.getMarca() + miAutobus.getModelo() + "es articulado");
        }else{
            System.out.println("este"+ miAutobus.getMarca() + miAutobus.getModelo()+ "no es articulado");
        }
        if(miAutobus.isUrbanoNoUrbano()){
            System.out.println("este"+ miAutobus.getMarca() + miAutobus.getModelo() + "es urbano");
        }else{
            System.out.println("este"+ miAutobus.getMarca() + miAutobus.getModelo() + "no es urbano");
        }
    }
    
    public void muestraDatosCamion (){
        System.out.println("-------------------------------------");
        System.out.println("la marca de la camion es: " + miCamion.getMarca());
        System.out.println("El modelo de la camion es: " + miCamion.getModelo());
        System.out.println("El color del camion es: " + miCamion.getColor());
        System.out.println("El tipo de combustible del vehiculo es" + miCamion.getTipoDeCombustible());
        System.out.println("La cilindrada de la camion es de " + miCamion.getCilindrada() + "cm^3");
        System.out.println("El numero de plazas del vehiculo es de: " + miCamion.getNumeroDePlazas());
        System.out.println("La categoria ambiental del vehiculo es:" + miCamion.getCategoriaAmbiental());
        System.out.println("La tara es de: " + miCamion.getTara());
        System.out.println("El galibo: "+ miCamion.getGalibo());
    }
}
