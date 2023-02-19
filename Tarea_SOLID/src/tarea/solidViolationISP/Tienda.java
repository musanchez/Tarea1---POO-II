package tarea.solidViolationISP;

/*
Supongamos que en una tienda hay dos roles, el encargado de bodega y la
persona que se encarga de realizar las ventas.
 */
public interface Tienda {
    void order(int cantidad, int prodId);
    void sell(int cantidad, int prodId);
}
