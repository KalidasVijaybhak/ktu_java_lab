import java.util.*;
public class Frequency{
    public static void main(String args[]){
         System.out.println(checkFrequency('w',"wwworld"));
    }
      static int checkFrequency(char x,String s){
 int count = 0;
    
    int k = s.length()-1;
    int i = 0;
    while(k>=0){
       if(x == s.charAt(k)){
           count++;
       }
         
        k--;
    }
    return count;
   
 
}

}
