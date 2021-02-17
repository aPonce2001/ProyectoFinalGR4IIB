
package Fuentes;

//@author Andrés Ponce

import java.util.ArrayList;

public interface Entidad {
        
    public String getNombreEntidad();
    public String getDatos();
    public String toQuery();
    public Entidad obtenerEntidadDeBase(int ID, Conexion conexion);
    public Entidad obtenerEntidadDeBase(String ID, Conexion conexion);
    public ArrayList obtenerListaObjectos(Conexion conexion);
}
