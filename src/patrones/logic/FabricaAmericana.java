package patrones.logic;

/**
 * Fabrica concreta
 * 8/10/2017
 * @author Jose Manuel Ferreira Benavides
 */
public class FabricaAmericana extends FabricaDesayunos{
    
    @Override
    public Desayuno fabricarDesayuno(String precio) {
        //Logica/preparacion adicional en caso de ser necesaria ira aqui
        return new DesayunoAmericano(precio);
    }
}
