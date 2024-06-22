package co.edu.asys;

public class Reina extends Ficha{
    public Reina(int x, int y, Color color) {
        super(x, y, color);
    }
    public boolean esMovimientoValido(int nuevaFila, int nuevaColumna) {
        int filaDiferencia = Math.abs(nuevaFila - x);
        int columnaDiferencia = Math.abs(nuevaColumna - y);
        return filaDiferencia <= 1 && columnaDiferencia <= 1;
    }
}
