package singleton;

public class Prueba {
    public static void main(String[] args) {
        SIngleton  singleton = SIngleton.getInstance();
        SIngleton  singleton2 = SIngleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
