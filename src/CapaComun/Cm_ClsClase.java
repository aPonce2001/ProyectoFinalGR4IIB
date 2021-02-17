 
package CapaComun;

/**
 *
 * @author Dennis David
 */
public class Cm_ClsClase {
    
        private int id;
    private String nombre;
    private int capacidad;

    public Cm_ClsClase() {
    }

    public Cm_ClsClase(int id, String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
