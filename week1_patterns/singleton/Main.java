package singleton;

public class Main {
    public static void main(String[] args) {
        
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        
        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();

        
        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Different instances exist (which shouldn't happen).");
        }
    }
}
