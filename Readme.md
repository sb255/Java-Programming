# Java Operations

## *Inheritance and object references:*

*See the CASES mentioned in the main class!*

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
        //Test obj4 = (PreTest) obj3;  /*--Not Valid--*/
        
        
    /*CASE 3*/
        //Test obj5 = new PreTest();   /*--Not Valid--*/    
        
        
        
    /*CASE 4*/
        PreTest obj6 = new Test(); 
        obj6.callMe();
    /*----OUTPUT: Method of SUB CLASS is called----*/


   /*CASE 5*/
        PreTest obj7 = new PreTest(); 
        //Test obj8 = (PreTest) obj7; /*--Even subclass object can not refer to a super class object--*/  
 
        
    }
 
}

/*---- NOTE: Always pay attention to new Test() or the new Class(), it will tell you which class
that object is going to create an image of, then no matter which class' object reference it has, 
it is only going to have methods of the class mentioned with new keyword ----*/


/*-- PreTest obj = new Test(); (Then blue print of Test Class will be created) --*/

``` 

## Comparators in Java: 

```
import java.util.*;

class TestTaker{
	public int id;
        String name; 
	public int marks;
	public TestTaker(int id, String name, int marks) {
            this.id = id;
            this.name = name; 
            this.marks = marks;
	}
	public int getId() {
            return id;
	}
	public String getName() {
            return name;
	}
	public int getMarks() {
            return marks;
	}
}


public class Test
{
	public static void main(String[] args){
		
		
            List<TestTaker> list = new ArrayList<TestTaker>();
            
            TestTaker obj1 = new TestTaker(1, "David", 91);
            TestTaker obj2 = new TestTaker(2, "Mike", 93);
            TestTaker obj3 = new TestTaker(3, "John", 95);
            TestTaker obj4 = new TestTaker(4, "Sky", 95);
            TestTaker obj5 = new TestTaker(5, "Leo", 99);
            
            list.add(obj1);
            list.add(obj2);
            list.add(obj3);
            list.add(obj4);
            list.add(obj5);
            
            Collections.sort(list,new MarksComparator());  

            for(TestTaker t : list){
                System.out.println(t.getId()+" "+t.getName()+" "+t.getMarks()); 
            }

	}
}

class MarksComparator implements Comparator{  
    public int compare(Object obj1,Object obj2){  
        TestTaker t1=(TestTaker)obj1;  
        TestTaker t2=(TestTaker)obj2;  
  
        if(t1.marks==t2.marks)  
            return t1.name.compareTo(t2.name);   
        else if(t1.marks>t2.marks)  
            return -1;  
        else  
            return 1;  
    }   
}

 
class NameComparator implements Comparator{  
    public int compare(Object obj1,Object obj2){  
        TestTaker t1=(TestTaker)obj1;  
        TestTaker t2=(TestTaker)obj2;  
  
    return t1.name.compareTo(t2.name);  
    }  
} 
```
## Ways to write Comparators in Java:

*Approach 1 is also known as Anonymous comparator* 

```
/*---- Approach 1 ----*/    

/*-- Using Anonymous comparators --*/        
             
Collections.sort(list, new Comparator() {

    public int compare(Object obj1,Object obj2){  
        TestTaker t1=(TestTaker)obj1;  
        TestTaker t2=(TestTaker)obj2;  
  
        if(t1.marks==t2.marks)  
            return t1.name.compareTo(t2.name);   
        else if(t1.marks>t2.marks)  
            return -1;  
        else  
            return 1;  
        }});



/*---- Approach 2 ----*/     

Collections.sort(list,new MarksComparator());

/*-- Then write a separate Class --*/

class MarksComparator implements Comparator{  
    public int compare(Object obj1,Object obj2){  
        TestTaker t1=(TestTaker)obj1;  
        TestTaker t2=(TestTaker)obj2;  
  
        if(t1.marks==t2.marks)  
            return t1.name.compareTo(t2.name);   
        else if(t1.marks>t2.marks)  
            return -1;  
        else  
            return 1;  
    }   
}
```

