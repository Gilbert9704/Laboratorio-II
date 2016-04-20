/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaVendedoraDeVehiculos;
import java.util.*;
/**
 *
 * @author Camilo
 */
public class Agencia_Vendedora_De_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Agencia Vendedora de Vehiculos 3.9");
        System.out.println("");
        System.out.println("");
        
           Scanner scanner = new Scanner(System.in);
        int continuar;
        AdministradorVehiculo admi = new AdministradorVehiculo(); 
           do{
        System.out.println("Menu : " );                                          //Inicio Menu Usuario.
        System.out.println("Seleccione la acccion deseada : ");
        System.out.println("1. Ingresar Vehiculo.");
        System.out.println("2. Buscar Vehculo.");
        
        int accion;
        accion = scanner.nextInt();
         

                //Fin Menu. ----------------------------------------------------------------------------------
      
                
        if(accion == 1){                                                        //Inicio opcion 1. (Ingresar)
            
        System.out.println("Ingrese el numero de Vehiculos a Registrar : ");
        int unidades = scanner.nextInt();
                for(int i = 1; i <= unidades; i++){
                    
            System.out.println("Ingrese tipo de vehiculo:");
            System.out.println("1. Auto compacto.");
            System.out.println("2. Auto  de lujo.");
            System.out.println("3. Vagoneta.");
            System.out.println("4. Camioneta.");
            
            int tipoDeAuto = scanner.nextInt();
            
            System.out.println("Ingrese el Numero de Serie : ");
                String numeroDeSerie = scanner.next();
                System.out.println("Ingrese la Marca del Vehiculo : ");
                String marca = scanner.next();
                System.out.println("Ingrese el Año de Fabricacion : ");
                int año = scanner.nextInt();
                System.out.println("Ingrese el Precio del Vehiculo : ");
                double precio = scanner.nextDouble();
            
            if(tipoDeAuto == 1 || tipoDeAuto == 2 || tipoDeAuto == 3){                                                        //crea un auto o vagoneta
                
                System.out.println("Ingrese el Numero de Pasajeros : ");
                int numeroDePasajeros = scanner.nextInt();
                AutoYVagoneta auto = new AutoYVagoneta(numeroDePasajeros,tipoDeAuto, numeroDeSerie, marca, año, precio);
                admi.agregar(auto.getNumeroDeSerie(), auto);
                
                
            }
            else {
                System.out.println("Ingrese la capacidad de carga de la Camioneta en Kg : ");      //crea una camioneta
                double capacidadDeCarga = scanner.nextDouble();
                System.out.println("Ingrese el numero de Ejes : ");
                int numeroDeEjes = scanner.nextInt();
                System.out.println("Ingrese el numero de Rodades : ");
                int numeroDeRodades = scanner.nextInt();
                System.out.println();
                
                Camioneta camioneta = new Camioneta(capacidadDeCarga,numeroDeEjes, numeroDeRodades,numeroDeSerie, marca, año, precio);
                admi.agregar(numeroDeSerie, camioneta);
            }
                
                   
            }  //For.
         
                
        }//Fin opcion 1. -------------------------------------------------------------------------------------
        
        
         if(accion == 2){                                                       //Iicio opcion 2.(Buscar) 
            System.out.println("Ingrese El numero de Serie del Vehiculo que desea Buscar : ");
            String serie = scanner.next();
            DatosVehiculo auto = null;
            auto = admi.buscar(serie);
            
            auto.imprimir();
            System.out.println("");
            String seguro;
            seguro = auto.toString();
            System.out.println(seguro);
            
             System.out.println("");
            
          
            
        }       //Fin opcion 2. -------------------------------------------------------------------------------
        
        
        System.out.println("Digite unicamente 1. o  2.  ");
      
               System.out.println("Desea continuar : ");
               System.out.println("1. SI");
               System.out.println("2. No");
               continuar = scanner.nextInt();
        
           }while(continuar == 1); 
        
        
        
    } //Fin main.
    
}
