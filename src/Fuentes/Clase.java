
package Fuentes;

//@author Andrés Ponce
 
public class Clase implements Entidad{
    
    private int tipo;
    private String nombreClase;

    public Clase() {
        this.tipo = 0;
        this.nombreClase = "";
    }

    public Clase(int tipo, String nombreClase) {
        this.tipo = tipo;
        this.nombreClase = nombreClase;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }
    
    @Override
    public String getNombreEntidad() {
        return "CLASE";
    }

    @Override
    public String getDatos() {
        return ("(" + this.tipo +",\'" + this.nombreClase +"\')");
    }

    @Override
    public String toString() {
        return "Clase\n" + "Tipo:" + tipo + "\nNombre de la clase: " + nombreClase;
    }
    
    
}
