import java.util.*;
public class Multi{
    public static void main(String args[]){
         int x[][] = new int[100][100];
                 int y[][] = new int[100][100];
                         int p[][] = new int[100][100];
         int c  = 3,r =3;
         createMatrix(x,c,r);
          createMatrix(y,c,r);
          multiMatrix(x,y,p,c,r);
         displayMatrix(p,c,r);
    }
      static void  createMatrix(int x[][],int c,int r){
          Scanner read  = new Scanner(System.in);
          for(int i =0;i<r;i++){
              for(int j = 0;j<c;j++){
                  x[i][j] = read.nextInt();
              }
              
                    System.out.println();
          }
      }
        
        
 
      static void displayMatrix(int x[][],int c,int r){
           
          for(int i =0;i<r;i++){
              for(int j = 0;j<c;j++){
                System.out.print (x[i][j]+" ");
              }System.out.println();
             
          }
      }
       static void multiMatrix(int x[][],int y[][],int p[][],int c,int r){
           
          for(int i =0;i<r;i++){
              for(int j = 0;j<c;j++){
                  for(int k = 0;k<r;k++){
                      p[i][j]+=x[i][k]*y[k][j];
                  }
             
              }System.out.println();
             
          }
      }
      

}
