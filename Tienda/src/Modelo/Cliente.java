
package Modelo;


public class Cliente {
    
    
    
    private String nombre="yael";
    private float presupuesto=550;
    private Carrito carrito;

    public Cliente(Carrito carrito) {
        this.carrito = carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    
    

    
    
    
    
    
    
    
    
}
