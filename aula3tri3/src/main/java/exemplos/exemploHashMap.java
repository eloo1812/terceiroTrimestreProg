
package exemplos;
import java.util.HashMap;


public class exemploHashMap {
    

    public static void main(String[] args){
        HashMap<String,String> capitais = new HashMap<>();
        capitais.put("RS","PortoAlegre");
        capitais.put("SC", "Florianopolis");
        capitais.put("DF", "Brasilia");
        System.out.println(capitais);
        for(String uf:capitais.keySet())
            System.out.print(uf+" ");
        for(String cidades:capitais.values())
            System.out.print(cidades+" ");
        
        System.out.println("A chave 'RS' existe no mapa "+capitais.containsKey(
        "RS"));
    }
}
