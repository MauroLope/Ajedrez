package co.edu.asys;

import co.edu.asys.Color;

public class Caballo extends Ficha{
    public Caballo(int x, int y, Color color) {
        super(x, y, color);
    }
    public boolean esMovimientoValido(int nuevaFila, int nuevaColumna) {
        int filaDiferencia = Math.abs(nuevaFila - x);
        int columnaDiferencia = Math.abs(nuevaColumna - y);
        return filaDiferencia <= 1 && columnaDiferencia <= 1;
    }
}
