/*This package is present in every java class*/
import java.lang.*; 

public class Addition{

int a,b;

/*Making it static, means it will be called on the compile time*/
public static int addition(int a,int b){

  return (a+b);
 
  }


public static void main(String args[]){

  System.out.println(addition(5,5));
  

  }
}
