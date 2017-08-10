package patrones.logic;

/**
 *
 * @author Jose Manuel Ferreira Benavides
 */
public class DesayunoContinental extends Desayuno {

    public DesayunoContinental(String precio) {
        this.precio = precio;
        ref = "continental";
        setDescripcion();
    }

    @Override
    public final void setDescripcion() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Costo: ").append(precio)
                .append("\nEl desayuno continental contiene: ")               
                .append("\n\t\t Cafe")
                .append("\n\t\t Jugo de naranja")
                .append("\n\t\t Tostadas")
                .append("\n\t\t Queso");
        descripcion = sb.toString();
    }
    
    @Override
    public String toString() {
        return descripcion;
    }

}
