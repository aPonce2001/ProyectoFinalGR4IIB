
package CapaComun;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Cm_ClsPais {
    
    private int id;
    private String nombre;

    public Cm_ClsPais() {
    }

    public Cm_ClsPais(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}
