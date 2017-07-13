/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Jean_Carlos
 */
public class Producto {
    private String  referencia;
    private String  descripcion;
    private float  cantidad;
    private float  precio;
    private float  costo;
    
    Producto()
    {  }
    
    Producto(String ref, String des, float cant, float pre, float cos )
    { referencia=ref; descripcion=des; cantidad=cant; precio=pre; costo=cos;}
    
    public String getreferencia(){return referencia;}
    public String getdescripcion(){return descripcion;}
    public float getcantidad(){return cantidad;}
    public float getprecio(){return precio;}
    public float getcosto(){return costo;}
    
    public void setreferencia(String n){this.referencia=n;}
    public void setdescripcion(String n){this.descripcion=n;}
    public void setcantidad(float n){this.cantidad=n;}
    public void setprecio(float n){this.precio=n;}
    public void setcosto(float n){this.costo=n;}
    
}
