
package Conector;


public class SQL {
  private final String AGREGAR_CLIENTES = "INSERT INTO  CLientes VALUES(?,?,?,?,?,?)";

    public String getAGREGAR_CLIENTES() {
        return AGREGAR_CLIENTES;
    }

}
