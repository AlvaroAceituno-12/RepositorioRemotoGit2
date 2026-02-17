package Principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        if (numero > 0) {
            int a = 0;
            while (a <= numero) {
                System.out.println(a);
                a++;
            }
        } else {
            if (numero < 0) {
                int a = 0;
                while (a >= numero) {
                    System.out.println(a);
                    a--;
                }
            }else {
                System.out.println("Has introducido el numero 0");
            }
        }
	}
}
