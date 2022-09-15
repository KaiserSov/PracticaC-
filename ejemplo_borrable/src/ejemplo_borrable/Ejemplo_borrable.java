/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_borrable;

/**
 *
 * @author Usuario
 */
public class Ejemplo_borrable {
    static Lista lst;
static Nodo Cab01, p;
static int[] vec = new int[10];
static double[][] mat = new double [8][10];
static int Edref = 18, menor = 300, tope = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic 
        lst = new Lista();
        p = new Nodo();
        lst.crearLista();
        lst.mostrarLista();
        Cab01 =  lst.obtenerCab();
        p = Cab01;
        while (p != null){
            if (p.obEdad() < menor){
               menor = p.obEdad();
            }
            p = p.obtenerLiga();
        }
       iniArreglos();
       Almvector(menor);
       tope = AlmMat(Cab01,Edref);
       impvector();
       impMat(tope);
    }
    public static void iniArreglos() {
       int k =0, n =0;
      for (k=0; k < 10;k++){
      //   vec [k] = new int;   
        vec [k] = 0;      
      }
      for (k=0; k< 8; k++) {
           for (n=0; n < 10;n++){
                mat [k][n] = 0;      
           }       
      }
    }
  public static void Almvector(int ng) {
      int h =0;
      for (h=0; h < 10;h++){
         vec [h] =  ng *(h+1);      
      }
      
    }
public static int AlmMat(Nodo cabn, int edref) {
      Nodo q = new Nodo();
      int x =0, y = 0, cant =0;
      q = cabn;
      while (q != null) {
         if (q.obEdad() > edref){
             cant++;
             mat[x][y] = q.obPeso();
             if (y < 9){   /* 9 por ser 10 filas van de 0 a 9  */
                 y++;
             }
             else {
                 x++; y = 0;
             }
         } 
         q = q.obtenerLiga();
      }
     return cant; 
    }
 public static void impvector() {
      int s =0;
      for (s=0; s < 10; s++){
         System.out.println(" Vector [" + s + "]"+ vec[s] + "\t");    
      }
      
    }
public static void impMat(int ndat) {
      int x =0, y = 0, f = 1;
      while (f <= ndat) {
             System.out.println(" Mat[" + x + " " + y + "]"+ mat[x][y] + "\t"); 
             f++;
             if (y < 9){
                 y++;
             }
             else {
                 x++; y = 0;
             }
          
      }
     
    }

    }
