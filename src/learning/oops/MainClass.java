package learning.oops;

/**
 *
 * @author ramcharan.adapa
 */
public class MainClass extends AbstractClass{
//public class MainClass {
    
    public static void main(String[] args){
    /**
     * Access Modifiers - private, default, protected, public
     */
    AccessModifiers accessModifiers = new AccessModifiers();
    
    //Private
    //System.out.println(accessModifiers.pTemp);
    //accessModifiers.getPString();
    
    //Default
    //System.out.println(accessModifiers.dTemp);
    //accessModifiers.getDString();
    
    //Protected
    //System.out.println(accessModifiers.prTemp);
    //accessModifiers.getPRString();
    
    //Public
    //System.out.println(accessModifiers.temp);
    //accessModifiers.getString();
    
    
    /**
     * Encapsulation
     */
    Encapsulation encap = new Encapsulation();
    
    encap.weight = -10;
    System.out.println(encap.weight);
    

    //encap.pWeight = -10;
    
    
    encap.setpWeight(-10);
    encap.setpWeight(10);
    encap.getpWeight();
    
    
    /**
     * Abstraction
     */
    MainClass mainClass = new MainClass();
    mainClass.abstractMethod();
    mainClass.definedMethod();
    
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementation of Abstract method in Main Class");
    }
}
