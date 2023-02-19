package tarea.solidISP;

public class Venta implements Vendedor {
    @Override
    public void sell(int cantidad, int prodId) {
        System.out.println("Vendiendo " + cantidad + "de producto " + prodId);
    }
}
