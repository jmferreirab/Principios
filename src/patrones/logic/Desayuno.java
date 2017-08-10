package patrones.logic;

/**
 *
 * @author Jose Manuel Ferreira Benavides
 */
public abstract class Desayuno {

    protected String ref;
    protected String precio;
    protected String descripcion;    

    public String getRef() {
        return ref;
    }

    public String getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
        
    abstract public void setDescripcion();
    
    @Override
    /**
     * Descriptor del producto
     */    
    public String toString() {
        return "Un desayuno con costo y contenidos";
    }
}
