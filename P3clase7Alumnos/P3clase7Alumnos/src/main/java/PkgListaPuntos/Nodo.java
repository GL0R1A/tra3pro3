/**
 *
 * @author stefannie
 */

package PkgListaPuntos;


public class Nodo {
    Nodo enlace;
    String carnet;
    String nombre;
    int promedio;

    
    public Nodo(int x) {
        enlace = null;
    }

    
    public Nodo(String car, String name, int prom) {
        carnet = car;
        nombre = name;
        promedio = prom;
      
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    
    

}