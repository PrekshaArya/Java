class Example
{
 private int id; //instance member variable
 private static String name; //static member variable
 
 public void get_id(int id2)//instance member function
 {
  id=id2;
 } 
 public void put_id()
 { 
  System.out.println("ID: "+id);
 }


 public static void get_name(String name2)//static member function
 { 
  name=name2;
 } 
 public static void put_name()
 { 
  System.out.println("Name: "+name);
 }
   

 static class Test //static inner class
 {
  public static String address="Gujarat";
 } 
}
 


public class StaticExample 
{
 public static void main(String[] args)
 {
  Example obj1=new Example();
  obj1.get_id(0123);
  obj1.put_id();
  Example.get_name("Preksha");
  Example.put_name();
  System.out.println(Example.Test.address);
 }
}