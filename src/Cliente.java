
import java.util.Random;
import patrones.logic.Desayuno;
import patrones.logic.FabricaAmericana;
import patrones.logic.FabricaContinental;
import patrones.logic.FabricaDesayunos;

/**
 * Usuario de la fabrica de desayunos
 * 8/10/2017
 * @author Jose Manuel Ferreira Benavides
 */
public class Cliente {

    static FabricaDesayunos fabrica;
    static Desayuno desayuno;
    
    public static void main(String[] args) {
        
        demo(new FabricaAmericana());
        demo(new FabricaContinental());
       
    }
    
    private static void demo(FabricaDesayunos fab){
        fabrica = fab;
        desayuno = fabrica.fabricarDesayuno(String.valueOf((25+new Random().nextInt(30))*100));
        System.out.println(desayuno.getRef()+desayuno.getPrecio());
        System.out.println(desayuno.getDescripcion());
        System.out.println();
    }
    
}
