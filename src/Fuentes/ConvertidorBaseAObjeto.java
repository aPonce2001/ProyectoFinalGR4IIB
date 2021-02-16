
package Fuentes;

//@author Andrés Ponce

import java.sql.ResultSet;

public interface ConvertidorBaseAObjeto<Entidad>{
    public Entidad convertirAObjeto(ResultSet resultado);
}
