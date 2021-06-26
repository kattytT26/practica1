import java.util.Scanner;

public class practica1
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        String nom,ape;
        
        System.out.println("Ingresa un nombre");
        
        nom = teclado.nextLine();
        
        System.out.println("Ingresa un apellido");
        
        ape = teclado.nextLine();
        
        System.out.println("hola mi nombre es: " +nom);
        
        System.out.println("mi apellido es: " +ape);
    }
}
