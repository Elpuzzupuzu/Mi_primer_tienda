
package tienda;

import Modelo.Cliente;
import Vista.VentanaPrincipal;


public class VentanaPrincipalController {
    
    static VentanaPrincipal vp=new VentanaPrincipal();
   
//    VentanaItemsController.
//   
    
    
    
    public static void mostrar(){ vp.setVisible(true);   }
    public static void ocultar(){ vp.setVisible(false);   }
    
    public static void btncomprar (){
        
    }
    public static void btnticket(){
    VentanaItemsController.carrito.mostrarproductos();
   
   
    }
    
    
     public static void salir(){
     System.exit(0);
     }
    
    
    
    
    
}
