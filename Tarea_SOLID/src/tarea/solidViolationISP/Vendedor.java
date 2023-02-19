package tarea.solidViolationISP;

public class Vendedor implements Tienda {
    @Override
    public void order(int cantidad, int prodId) {

        System.out.println("Vendedor no puede ordenar");
    }
    @Override
    public void sell(int cantidad, int prodId) {
        System.out.println("Vendiendo " + cantidad + "de producto " + prodId);
    }
}
