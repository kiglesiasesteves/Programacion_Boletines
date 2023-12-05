import java.util.Scanner;

public class tabla {
    Scanner sc= new Scanner(System.in);

    int num;
    int numero;
    public void multiplicacion(){
        LerDatos obx= new LerDatos();
        int num=  obx.lerEnteiro("Escribe o número");
        System.out.println("A táboa de multiplicar é");
        int i=1;
        do{
            System.out.print("Introduce un número (0 para salir): ");
            int numero =sc.nextInt();

            if (numero == 0) {
                System.out.println("O programa rematou.");
                break;

            }while(numero!=0)
                i++;

            System.out.println(num*i);
            i++;

        }while(true);
    }
}
