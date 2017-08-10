package patrones.logic;

/**
 *
 * @author Jose Manuel Ferreira Benavides
 */
public class DesayunoAmericano extends Desayuno {

    public DesayunoAmericano(String precio) {
        this.precio = precio;
        ref = "americano";
        setDescripcion();
    }

    @Override
    public final void setDescripcion() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Costo: ").append(precio)
                .append("\nEl desayuno americano contiene: ")               
                .append("\n\t\t Cafe")
                .append("\n\t\t Tocino")
                .append("\n\t\t Huevo")
                .append("\n\t\t Hotcake");
        descripcion = sb.toString();
    }
    
    @Override
    public String toString() {
        return descripcion;
    }

}