
import java.util.Scanner;


public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        consumo obxCon =new consumo();
        obxCon.setLitros(50f);
        obxCon.setPGas(1.57f);

        Scanner sc =new Scanner (System.in);
        System.out.println("Escribe o valor de kilometros");
        float km = sc.nextFloat();
        System.out.println("Escribe o valor de litros");
        float l = sc.nextFloat();
        System.out.println("Escribe o valor da Velocidade Media");
        float v = sc.nextFloat();
        System.out.println("Escribe o valor do prezo da Gasolina");
        float PG = sc.nextFloat();
        consumo obxConP =new consumo(km,l,v,PG);
        obxConP.consumoEuros();
        obxConP.consumoMedio();
        obxConP.Tempo();

    }
}