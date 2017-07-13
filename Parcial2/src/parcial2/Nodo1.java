/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Arrow
 */
public class Nodo1 {

    private Nodo1 raiz;
    private Nodo1 next;
    private Nodo1 before;
    private int dato, fe;
    private Nodo1 izq, der;
    private String[] datos;

//    public Nodo(){raiz=null;}
    //private String nombre; 
    //obtiene raiz
    public Nodo1(int d/*,String nom*/) //----------------------------------------
    {
        this.dato = d;
        // this.nombre=nom;
        this.izq = null;
        this.der = null;
        this.fe = 0;
        this.next = null;
        this.before = null;
    }

    public Nodo1(String[] s/*,String nom*/) //----------------------------------------
    {
        this.datos = s;
        // this.nombre=nom;
        this.izq = null;
        this.der = null;
        this.fe = 0;
        this.next = null;
        this.before = null;
    }

    //se utiliza para cuando no existe ningun nodo
    public Nodo1(int d, Nodo1 n) {
        this(d, null, null);
        this.dato = d;
        // this.nombre=nom;
        this.izq = null;
        this.der = null;
        this.fe = 0;
        this.next = null;
        this.before = null;
        this.dato = d;
        this.next = n;
    }

    //Se utiliza para guardar un array string
    public Nodo1(String[] s, Nodo1 n) {
        datos = s;
        this.before = null;
        this.next = null;
        // this.nombre=nom;
        this.izq = null;
        this.der = null;
        this.fe = 0;
        this.next = null;
        this.before = null;

        this.next = n;
    }

    //lista doble, se utiliza cuando ya existen nodos
    public Nodo1(int d, Nodo1 siguiente, Nodo1 anterior) {
      
        this.dato = d;
        this.next = siguiente;
        this.before = anterior;
    }

    Nodo1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Metodo wrap para listas dobles
    public void WrapBN(Nodo1 n, boolean p) {
        //fin 
        if (p == false) {
            n.before.next = n;
        }
        //inicio
        if (p == true) {
            n.next.before = n;
        }
    }

    //----------------------------------------
    @Override
    public String toString() {
        return "Datos " + dato;
    }

    //Agregar datos al arbol
    public Nodo1 getRaiz() {
        return this.raiz;
    }

    public int getDat() {
        return this.dato;
    }

    public void setRaiz(Nodo1 raiz) {
        this.raiz = raiz;
    }

    public void setDat(int dato) {
        this.dato = dato;
    }
//recibe datos para el arbol

    public Nodo1 getIzq() {
        return izq;
    }

    public Nodo1 getDer() {
        return der;
    }

    public void nullIzq(Nodo1 raiz) {
        raiz.izq = null;
    }

    public void nullDer(Nodo1 raiz) {
        raiz.der = null;
    }

    public void setIzq(Nodo1 izq) {
        this.izq = izq;
    }

    public void setDer(Nodo1 der) {
        this.der = der;
    }

    //Retorna datos de la lista
    public long getDato() {
        return dato;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public Nodo1 getNext() {
        return next;
    }

    public void setNext(Nodo1 next) {
        this.next = next;
    }

    public Nodo1 getBefore() {
        return before;
    }

    public void setBefore(Nodo1 before) {
        this.before = before;
    }

    public Nodo1(String[] s, Nodo1 siguiente, Nodo1 anterior) {
        // this.nombre=nom;
        this.datos = s;
        this.next = siguiente;
        this.before = anterior;
    }
    
    public Nodo1(String[] s, Nodo1 siguiente, Nodo1 raiz, Nodo1 anterior) {
        this.datos = s;
        this.next = siguiente;
        this.before = anterior;
        this.raiz = raiz;
    }
        public Nodo1(int s, Nodo1 siguiente, Nodo1 raiz, Nodo1 anterior) {
        this.dato = s;
        this.next = siguiente;
        this.before = anterior;
        this.raiz = raiz;
    }

    public String[] getDatos() {

        return datos;
    }

}
