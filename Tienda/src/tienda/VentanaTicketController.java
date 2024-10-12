
package tienda;

import Vista.VentanaTicket;


public class VentanaTicketController {
    
    public static VentanaTicket vt= new VentanaTicket();
    
    public static void mostrarticket(){
    vt.setVisible(true);
    String lista =VentanaItemsController.carrito.mostrarproductosmk2();
    
    
    
        
    vt.getjTextticket().setText("\n"+lista+"\n");
   
    
    
    }
    
    
    
    
    
    
    
    
    
}
