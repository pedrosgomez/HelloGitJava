package helloworld;

/**
 *
 * @author Pedro Sergio Gomez S
 */
public class HelloWorld {

    public void Greeting(){
        
        System.out.println("Hello World");
        
    }

    public void Farewell(){
        
        System.out.println("Goodbye World");
        
    }
    
    public static void main(String[] args) {
    
        HelloWorld o1 = new HelloWorld();
        
        o1.Greeting();
        
    }
    
}
