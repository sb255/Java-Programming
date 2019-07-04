import java.util.*;

//Comparying values of two objects in a Java generic class

public class Test{
    
    public static <E extends Comparable> E addObjects(E a, E b){
            
        if(a.compareTo(b)>0)
            return a; 
        
        
        if(a.compareTo(b)<0)
            return b;
        
        else
            return a;
            
    }
        
    public static void main(String[] args){
            
        System.out.println("The larger value is: "+addObjects("Hello", "Jack"));
            
    }
        
}


