package learning.oops;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramcharan.adapa
 */
public class MethodOverridingChild extends MethodOverridingParent{
    
    @Override
    public void MethodOverride(){
        System.out.println("Printing from Child Method");
    }
    
    public static void main(String[] args){
        
        MethodOverridingParent parentObj = new MethodOverridingParent();
        parentObj.MethodOverride();
        
        MethodOverridingChild childObj = new MethodOverridingChild();
        childObj.MethodOverride();
        
        MethodOverridingParent childObjParentRef = new MethodOverridingChild();
        childObjParentRef.MethodOverride();
    }
}
