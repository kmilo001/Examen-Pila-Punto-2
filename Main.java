import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila obj = new Pila();
        Stack<Character> pila = new Stack<>();
        Stack<Character> pilainvertida= new Stack<>();

        System.out.println("Ingrese texto: ");
        String cadena = sc.nextLine();
        pila = obj.llenarpila(cadena);
        pilainvertida= obj.Invertir(pila);
        System.out.println(pilainvertida.size());
        System.out.println(pilainvertida);
    }
}
