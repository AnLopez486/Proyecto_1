using System;
using System.IO;
 
namespace TorreHanoi
{
    public class Hanoi
    {
 
        public static void Main(string[] args)
        {         
            int n;            
 
            Console.Write("Escriba el número de discos en la torre de hanoi: ");
            n = Leer.datoInt();
 
            {
                Console.Write("Error, reescriba el número de discos en la torre: ");
                n = Leer.datoInt();
            }
 
        }
 
        public static void algoritmoHanoi(int n, String from, String temp, String to) 
        {
            if (n == 0) return;
            algoritmoHanoi(n-1, from, to, temp);
            System.Console.WriteLine("Mover disco " + n + " de " + from + " a " + to);
            algoritmoHanoi(n-1, temp, from, to);
        } 
    }
 
    public class Leer
    {
        public static int datoInt()
        {
            string dato;
            dato = System.Console.ReadLine();
            return int.Parse(dato);
        }
    }
}