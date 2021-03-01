
package Fuentes;

//@author Andrés Ponce

public class Comida implements Entidad{
    private int idComida;
    private String descripcion;
    private String tipo;

    public Comida() {
        this.idComida = 0;
        this.descripcion = "";
        this.tipo = "";
    }
    
    public Comida(int idComida, String descripcion, String tipo) {
        this.idComida = idComida;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getNombreEntidad() {
        return "COMIDA";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idComida + ", \'" + this.descripcion + "\', \'" + this.tipo + "\')");
    }

    @Override
    public String toQuery() {
        return ("ID_Comida = " + this.idComida + ", Descripcion = \'" + this.descripcion + "\', Tipo = \'" + this.tipo + "\'");
    }

}
