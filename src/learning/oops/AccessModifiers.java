/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.oops;

/**
 *
 * @author ramcharan.adapa
 */

public class AccessModifiers {
    
    //private instance variable and method (accessible only within class)
    private String pTemp = "Sample";
    private void getPString(){
        System.out.println("Private Sample Output");
    }
    
    //default instance variable and method (accessible only within package)
    String dTemp = "Default Variable";
    void getDString(){
        System.out.println("Default Sample Output");
    }
    
    //protected instance variable and method (accessible within package and outside the package but through inheritance only)
    protected String prTemp;
    protected void getPRString(){
        System.out.println("Protected Sample Output");
    }
    
    //public instance variable and method
    public String temp;
    public void getString(){
        System.out.println("Sample Output");
    }
    
    public static void main(String[] args){
        AccessModifiers aModifiers = new AccessModifiers();
        
        System.out.println(aModifiers.pTemp);
    }
    
}
