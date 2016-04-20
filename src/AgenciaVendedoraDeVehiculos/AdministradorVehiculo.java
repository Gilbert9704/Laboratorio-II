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
public class AdministradorVehiculo {
    
    private HashMap<String, DatosVehiculo> vehiculo = new HashMap<String, DatosVehiculo>();
     
    public void agregar(String numeroDeSerie, DatosVehiculo auto){
        vehiculo.put(numeroDeSerie, auto);
    }
    
    public DatosVehiculo buscar(String serie){
        DatosVehiculo auto = null;
        auto = vehiculo.get(serie);
        
        return auto;
    }
    
}
