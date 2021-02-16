
package Fuentes;

//@author Andrés Ponce
 
public class Avion implements Entidad{
    private int idAvion;
    private String descripcion;

    public Avion() {
        this.idAvion = 0;
        this.descripcion = "";
    }

    public Avion(int idAvion, String descripcion) {
        this.idAvion = idAvion;
        this.descripcion = descripcion;
    }
    
    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String getNombreEntidad() {
        return "AVION";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idAvion +",\'" + descripcion +"\')");
    }

    @Override
    public String toString() {
        return "Avion No." + idAvion + "\nDescripción: " + this.descripcion;
    }

}
