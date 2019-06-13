# Java Operations

## Inheritance and objects references:

See the CASES mentioned in the main class!

```

import java.util.*;


class PreTest {
    
    public void callMe(){
    
        System.out.println("Method of SUPER CLASS is called"); 
    
    }

}

public class Test extends PreTest {
    
    
    public void callMe(){
    
        System.out.println("Method of SUB CLASS is called"); 
    
    }
    
    public static void main(String[] args){
                
    /*CASE 1*/   
        Test obj = new Test(); 
        PreTest obj2 = (PreTest) obj; 
        
        obj2.callMe();
    /*----OUTPUT: Method of SUB CLASS is called----*/    
        
        
    /*CASE 2*/
        PreTest obj3 = new PreTest();
        //Test obj4 = (PreTest) obj3;  /*Not Valid*/
        
        
    /*CASE 3*/
        //Test obj5 = new PreTest();   /*Not Valid*/    
        
        
        
    /*CASE 4*/
        PreTest obj6 = new Test(); 
        obj6.callMe();
    /*----OUTPUT: Method of SUB CLASS is called----*/
        
    }
 
}

/*---- NOTE: Always pay attention to new Test() or the new Class(), it will tell you which the class
that object is going to create an image, then no matter which class' object reference it has, 
it is only going to have methods of the class mentioned with new keyword ----*/


``` 

