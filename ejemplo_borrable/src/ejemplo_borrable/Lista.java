/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_borrable;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo cab;
     public Nodo obtenerCab() { return cab; }
     public void asignarCab(Nodo kbza) { cab= kbza; }
     public Lista(){cab = null;}
     //-------------------------------------------------------
     public void insertarNodo(Nodo d) { //el nodo entra lleno{
         if (cab == null)
             cab = d;
         else
         {
             Nodo p = cab;
             while (p.obtenerLiga() != null)
                 p = p.obtenerLiga();
             p.asignarLiga(d);
         }
     }
     //-------------------------------------------------------
     public void crearLista( ){
         Nodo p;
         String Cedula;
         String Nombre;
         int Edad=0;
         double Peso=0; 
         cab = null;
         System.out.println("Hay datos? si/no ");
         String resp = LeerVariable.leerTexto(" ");
         while (resp.equals("si"))          {
             p = new Nodo();
             System.out.print("Ingrese Cedula: "); Cedula = LeerVariable.leerTexto("  ");
             System.out.print("Ingrese Nombre: "); Nombre = LeerVariable.leerTexto("  ");
             System.out.print("Ingrese Edad: ");   Edad = LeerVariable.leerEntero("  ");
             System.out.print("Ingrese Peso: ");   Peso = LeerVariable.leerReal("  ");
             p.asigced(Cedula);
             p.asigNom(Nombre);
             p.asigEdad(Edad);
             p.asigPeso(Peso);
             p.asignarLiga(null);
             insertarNodo(p);
             System.out.println("Hay más datos? si/no ");
             resp = LeerVariable.leerTexto("  ");
         }
     }
     //-------------------------------------------------------
 
    public void mostrarLista( ) { 
         Nodo p;
         if (cab == null)
             System.out.println("\tLista vacía");
         else
         { 
             System.out.println("\tContenido de la lista:");
             for (p = cab; p != null; p = p.obtenerLiga())
             { 
                 System.out.println(p.obced() + "  " +  p.obNom() + "  " + p.obEdad() + "  " + p.obPeso() + "\t");
             } 
     }   
} 
   public void Caculos() {
             Nodo p;
             double suma = 0;
         if (cab == null)
             System.out.println("\t Lista vacía");
         else
         {
             System.out.println("\t Suma de la lista:");
             for (p = cab; p != null; p = p.obtenerLiga())
             {
                suma = suma + p.obPeso(); 
             }
         }  
          System.out.println(" La suma es " + suma + "\t");
         }

    
}
