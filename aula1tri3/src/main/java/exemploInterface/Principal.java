
package exemploInterface;


public class Principal {
    public static void main(String[] args){
        Vetor v1 = new Vetor(10);
        v1.adiciona("Elemento a");
        v1.adiciona("Elemento b");
        v1.adiciona("Elemento c");
        System.out.println(v1);
        System.out.println("apagando o elemento"+v1.remove());
        System.out.println(v1);


}
}
