package tarea.solidViolationISP;

public class Bodega implements Tienda {
    public void order(int cantidad, int prodId) {
        System.out.println("Ordenando " + cantidad + " con id: " + prodId);
    }
    @Override
    public void sell(int cantidad, int prodId) {
        System.out.println("Función no permitida para encargado de bodega");
    }

}
