import javax.swing.*;

public class Pedido extends Cliente {
    private float prezo;

    public Pedido() {
    }

    public Pedido(String nome, float pesoPaquete, float prezo) {
        super(pesoPaquete);
        this.prezo = prezo;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void PedirDatos() {
            setPesoPaquete(Float.parseFloat(JOptionPane.showInputDialog("Escriba o peso do paquete. Se non desexa continuar co programa pulse cero")));


            if (getPesoPaquete() > 5 || getPesoPaquete() < 0) {
                JOptionPane.showMessageDialog(null,"Peso demasiado elevado ou incorrecto para os nosos servizos. Porfavor volte a colocar os datos.");
                PedirDatos();
            } else if(getPesoPaquete()==0){
            JOptionPane.showMessageDialog(null,"Programa finalizado");

            } else {

                PrezoPaquete();
            }

    }

    public void PrezoPaquete() {
        int continente = (Integer.parseInt(JOptionPane.showInputDialog("\"Indique o continente ao que quere realizar o pedido. 1 América do Norte 2 América Central  3 América do Sur  4 Europa 5 Asia")));

        switch (continente) {
            case 1:
                setPrezo(getPesoPaquete() * 24);
                break;
            case 2:
                setPrezo(getPesoPaquete() * 20);
                break;
            case 3:
                setPrezo(getPesoPaquete() * 21);
                break;
            case 4:
                setPrezo(getPesoPaquete() * 10);
                break;
            case 5:
                setPrezo(getPesoPaquete() * 18);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número incorrecto.");
                PrezoPaquete();


        }
        JOptionPane.showMessageDialog(null, "O prezo total da entrega será un total de "+ getPrezo());
    }
}

