public class parcial2{
    String Nombre;
    int edad;
    int ID;
    
    
    
    public trabajador(String nombre,int edad ,int ID){
        this.nombre = Nombre;
        this.edad = edad;
        this.ID = ID;

    }
    class Nodo {

        int info;
        Nodo sig;
    }

    

    private Nodo raiz,fondo;

    

    Cola() {

        raiz=null;
        fondo=null;
    }

    

    boolean vacia (){

        if (raiz == null)

            return true;

        else

            return false;

    }



    void insertar (int info)

    {
        Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }

    }



    int extraer ()
    {
        if (!vacia ())
        {
            int informacion = raiz.info;
            if (raiz == fondo){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else
            return Integer.MAX_VALUE;
    }



    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }




    public static void main(String[] args) {
        parcial2 cola1=new parcial2();
        cola1.trabajador("danny",25,1006501079);
        System.out.println(cola1.trabajador)
        System.out.println("mes 1");
        cola1.insertar(1000000);
        System.out.println("mes 2");
        cola1.insertar(300000);
        System.out.println("mes 3");
        cola1.insertar(200000);
        System.out.println("mes 4");
        cola1.instertar(450000);
        System.out.println("mes 5");
        cola1.instertar(300000);
        ystem.out.println("mes 6");
        cola1.instertar(425000);
        ystem.out.println("mes 7");
        cola1.instertar(150000);
        ystem.out.println("mes 8");
        cola1.instertar(250000);
        ystem.out.println("mes 9");
        cola1.instertar(480000);
        ystem.out.println("mes 10");
        cola1.instertar(490000);
        ystem.out.println("mes 11");
        cola1.instertar(360000);
        ystem.out.println("mes 12");
        cola1.instertar(320000);
        cola1.imprimir();
        int suma = 0;
        while (12 >0){
            suma +=(int) cola.imprimir();
        }
        System.out.println("la ganancia anual es "+suma)



           
    }
}
