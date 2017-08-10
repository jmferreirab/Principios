package patrones.logic;

/**
 * Fabrica abstracta
 * En concordancia con el metodo fabrica 
 * esta fabrica abstracta define el metodo
 * de creaccion. 
 * 8/10/2017
 * @author Jose Manuel Ferreira Benavides
 */
public abstract class FabricaDesayunos {
    public abstract Desayuno fabricarDesayuno(String precio);        
}
