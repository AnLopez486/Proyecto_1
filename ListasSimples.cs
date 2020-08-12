namespace ListaSimple{

    class nodo{
        private int dato;
        private nodo siguiente;


    }
    class lista{
        private nodo primero = new nodo();
        private nodo ultimo = new nodo();
    }
    public lista(){
        primero = null;
        ultimo = null;
    }
    public void ingresarnodo(int dato){
        nodo nodonuevo = new nodo();
        nodonuevo.dato = dato;
        if(primero = null){
        primero = nodonuevo;
        primero.siguiente = null;
        ultimo = primero;
        }else{
          ultimo.siguiente = nodonuevo;
          nodonuevo.siguiente = null;
          ultimo = nodonuevo;
        }
    }
     public void mostrarLista(){
    nodo actual = new nodo();
    actual = primero;
    while(actual != null){
     System.out.println(actual.dato);
        actual = actual.siguiente;
    }
     }
     class principal{
         static void main(String[] args){
                  Listasencilla LS = new Listasencilla();
        LS.ingresarnodo(5);
        LS.ingresarnodo(8);
        LS.ingresarnodo(1);
        LS.ingresarnodo(10);
 
        LS.mostrarLista();
         }
     }

}
