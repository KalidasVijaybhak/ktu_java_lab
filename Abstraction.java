public class Abstraction{
    
   
    public static void main(String args[]){
        Rectangle x = new Rectangle();
        x.noOfSides();
        x.area(2,3);
    }
}
 abstract class Shape{
       abstract void noOfSides();
       abstract void area(int a,int b);
        
    }
    class Rectangle extends Shape{
        void noOfSides(){
            System.out.println("Has 4 sides");
        }
        void area(int a ,int b){
            System.out.println(a*b);
        }
    }
