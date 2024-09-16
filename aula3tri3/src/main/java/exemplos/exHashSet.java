
package exemplos;
import java.util.HashSet;


public class exHashSet {
    public static void main(String[] args){
        HashSet<String> listaCompras = new HashSet<>();
        
        System.out.println(listaCompras.add("Feijão"));
        System.out.println(listaCompras.add("Arroz"));
        System.out.println(listaCompras.add("Açúcar"));
        System.out.println(listaCompras.add("Farinha"));
        System.out.println(listaCompras.add("Sal"));
        System.out.println(listaCompras.add("Massa"));
        System.out.println(listaCompras.add("Carne"));
        System.out.println(listaCompras.add("Frios"));
        System.out.println(listaCompras);
        
    }
}

