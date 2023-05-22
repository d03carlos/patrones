package singleton;

public class SIngleton {
    private int contador;
    private static SIngleton inctancia;
    public static SIngleton getInstance(){
        if(inctancia == null){
           inctancia = new SIngleton();
        }
        return inctancia;
    }
    
    private SIngleton(){
    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
