/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_borrable;

/**
 *
 * @author Usuario
 */
public class Nodo {
        private String Cedula;
    private String Nombre;
    private int Edad;
    private double Peso; 
    private Nodo liga;
// Grabar son los metodos asig  (SET)
    public void asigced (String cd) { Cedula= cd; }
    public void asigNom (String n) { Nombre = n; }
    public void asigEdad (int ed) { Edad = ed; }
    public void asigPeso (double Pe) { Peso = Pe; }
    public void asignarLiga(Nodo sigue) { liga = sigue; }
// Leer son los metodos obtener  (GET)
    public String obced() { return Cedula; }
    public String obNom() { return Nombre; }
    public int obEdad() { return Edad; }
    public double obPeso() { return Peso; }
    public Nodo obtenerLiga() { return liga; }

    
}
