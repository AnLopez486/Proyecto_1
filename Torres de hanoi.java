public class TorresHanoi {



public void TorresHanoi(int num, int inicio,  int medio, int final){
    if(n==1)
    {
    System.out.println("Moviendo de la torre 1 a la torre 3");
    }
    else
    {
       TorresHanoi(num-1, inicio, final, medio);
       System.out.println("Moviendo de la torre de inicio" +inicio+"a la torre de final"+final);
       TorresHanoi(num-1, medio, inicio, final);
     
    }

   }

   public static void main(String[] args) throws Exception {

   int n =0;
   Scanner teclado = new Scanner(System.in);
   TorresHanoi h = new TorresHanoi();

   System.out.println("Ingrese el numero de aros");
   n = teclado.nextInt();

   h.TorresHanoi(n, 1, 2, 3);


   }

  }