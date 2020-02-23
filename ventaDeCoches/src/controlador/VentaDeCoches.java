/*Equipo nEquipo = new Equipo();
            formulario nformulario = new formulario();
            nEquipo = nformulario.pideDatosEquipo();
            
            arrayEquipo.add(nEquipo);
            
            File equipo = new File(nEquipo.getNombre().concat(".txt"));
            FileOutputStream fluido = null;
            
            try {
                fluido = new FileOutputStream(equipo);
                ObjectOutputStream escribir = new ObjectOutputStream(fluido);
                escribir.writeObject(nEquipo);
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                if( fluido != null){
                    try {
                        fluido.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                
                }
            }*/
            
            
            
            

            
            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author raul
 */
import java.util.Scanner;
import vista.formulario;
import modelo.Autobus;
import modelo.Camion;
import modelo.Coche;
import modelo.Moto;

public class VentaDeCoches {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        formulario vformulario = new formulario();
        Autobus mAutobus = new Autobus();
        Camion mCamion = new Camion();
        Coche mCoche = new Coche();
        Moto mMoto = new Moto();
        int opcion;
        int num;
    do{
        System.out.println("1. Escribir datos ");
        System.out.println("2. Leer datos");
        System.out.println("Elige una opcion");
        num = teclado.nextInt();
        
        if(num == 1){
            System.out.println("1. Escribir los datos de un autobus");
            System.out.println("2. Escribir los datos de un camion");
            System.out.println("3. Escribir los datos de un coche");
            System.out.println("4. Escribir los datos de una moto");
            System.out.println("Escribe la opcion que quieras");
            opcion = teclado.nextInt();
            
            switch (opcion){
                
                case 1:
                    mAutobus = vformulario.pideDatosAutobus();
                    break;
               
                case 2:
                    mCamion = vformulario.pideDatosCamion();
                    break;
                
                case 3:
                    mCoche = vformulario.pideDatosCoche();
                    break;
                
                case 4:
                    mMoto = vformulario.pideDatosMoto();
                    break;
                
                default:
                    System.out.println("opcion incorrecta");
                    break;
                
                    
                
            }
        }
        
        if(num == 2){
            System.out.println("1. leer los datos de/los autobus");
            System.out.println("2. leer los datos de/los un camion");
            System.out.println("3. leer los datos de/los un coche");
            System.out.println("4. leer los datos de/las una moto");
            System.out.println("Escribe la opcion que quieras");
            opcion = teclado.nextInt();
            
            switch(opcion){
                
                case 1:
                    vformulario.muestraDatosAutobus();
                    break;
                case 2:
                    vformulario.muestraDatosCamion();
                    break;
                case 3:
                    vformulario.muestraDatosCoche();
                    break;
                case 4:
                    vformulario.muestraDatosMoto();
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        }
    }while(num!=0); 
    }
    
}
