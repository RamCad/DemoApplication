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
public class MethodOverloadingChild extends MethodOverloadingParent{

    public void overloadMethod(MethodOverloadingChild childObj){
        System.out.println("Printing from Child Method");
    }
    
    public void overloadMethod(String string){
        System.out.println("From OverloadMethod String arguments");
    }
    
    public static void main(String[] args){
        
        MethodOverloadingParent parentObj = new MethodOverloadingParent();
        parentObj.overloadMethod(parentObj);
        
        MethodOverloadingChild childObj = new MethodOverloadingChild();
        childObj.overloadMethod(childObj);
        
        MethodOverloadingParent childObjParentRef = new MethodOverloadingChild();
        childObjParentRef.overloadMethod(childObjParentRef);
    }
}
