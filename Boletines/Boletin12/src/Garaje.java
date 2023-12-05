import java.util.Scanner;

public class Garaje {

    static int numeroCoches=0;
    static int prazasDisponibles;
    int tempo;
    float prezo;
    float recibido;
    float devolto;
    float restante;
    Coche coc;
    Scanner sc = new Scanner(System.in);

    public void sitio() {
        prazasDisponibles = 5-numeroCoches;
        if (prazasDisponibles>0) {
            coc = new Coche();
            System.out.println("-------------------------\nBenvido ao aparcamento\n-------------------------");
            System.out.println("[info]  | Prazas dispoñibles --> " + prazasDisponibles);
            System.out.print("[input] | Escriba a matricula: ");
            coc.setMatricula(sc.nextLine());
            System.out.print("[input] | Escriba a marca: ");
            coc.setMarca(sc.nextLine());
            tempo();
            ingresar();
            factura();
            numeroCoches++;
        } else if (prazasDisponibles==0){
            System.out.println("-------------------------\nO garaxe esta cheo\n-------------------------");
            System.exit(0);
        }
    }

    public void tempo() {
        do {
            System.out.print("[input] | Introduzca o tempo transcurrido (h): ");
            tempo = sc.nextInt();
            if (tempo <= 3 && tempo > 0) {
                System.out.println("[info]  | Prezo = 1.5€");
                prezo = 1.50f;
                break;
            } else if (tempo > 3) {
                prezo = 1.5f + (0.2f * (tempo - 3));
                System.out.println("[info]  | Prezo = " + prezo+"€");
                break;
            } else {
                System.out.println("[info]  | Tempo incorrecto, volva a escribir: ");
            }
        } while (true);
    }

    public void ingresar() {
        System.out.print("[input] | - [Formato 0,0] - Introduzca os cartos a ingresar: ");
        recibido = sc.nextFloat();
        do {
            if (recibido < prezo) {
                System.out.println("[info]  | Prezo = " + prezo);
                System.out.println("[info]  | Dinero recibido = " + recibido);
                System.out.print("[input] | - [Formato 0,0] - Introduzca os cartos restantes: ");
                restante = sc.nextFloat();
                recibido = recibido + restante;
            }else{
                break;
            }
        } while (recibido < prezo);
        devolto = recibido - prezo;
        System.out.println("A cantidade devolta é " + devolto);
    }

    public void factura() {
        System.out.println("-------------------------\nFACTURA\n-------------------------");
        System.out.println("· A matricula é " + coc.getMatricula());
        System.out.println("· A marca é " + coc.getMarca());
        System.out.println("· O tempo que estivo dentro é igual a " + tempo + "h");
        System.out.println("· O prezo foi " + prezo+"€");
        System.out.println("· Os cartos recibidos foron " + recibido+"€");
        System.out.println("· Os cartos devoltos foron " + devolto+"€");
        System.out.println("-------------------------\nGrazas por usar o noso aparcadoiro\n-------------------------\n\n");
    }
}