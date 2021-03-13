
package CapaComun;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Cm_ClsComboItem {
      
    private String key;
    private String value;

    public Cm_ClsComboItem(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
 
}
