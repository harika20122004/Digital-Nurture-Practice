package singleton;

public class Singleton {
    
    private static Singleton instance;

 
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

  
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // create if not already created
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton class.");
    }
}
