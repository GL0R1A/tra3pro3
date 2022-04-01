/**
 *
 * @author stefannie
 */

package PkgListaPuntos;


public class ClsLista {
    // Cabeza , head
    public Nodo primero;

    public ClsLista() {
        primero = null;
    }

  

    public ClsLista insertarCabezaLista(String carnet, String nombre, int promedio) {
        Nodo nuevo;
        nuevo = new Nodo(carnet, nombre, promedio);
        nuevo.enlace = primero; 
        primero = nuevo; 
        return this; 

    }

    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.println(" " + n.carnet + " " + n.nombre + " " + n.promedio);
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));
        }
    }

    

    public Nodo buscarLista(String destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino == indice.carnet) {
                return indice;
            }
        }
        return null;
    }

   
    public ClsLista insertarLista(String busqueda, String carnet, String nombre, int promedio) {
        Nodo nuevo, anterior;
        anterior = buscarLista(busqueda);
        if (anterior != null) {
            nuevo = new Nodo(carnet, nombre, promedio);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    

    public void eliminar(String entrada) {
        Nodo actual, anterior;
        boolean encontrado;
       
        actual = primero;
        anterior = null;
        encontrado = false;
        
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.carnet == entrada); 
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
       
        if (actual != null) {
           
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
}