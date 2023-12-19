//Isaac Escobar(8-963-41)-Iván Loaiza(8-988-2337)-Karen Lorenzo(8-987-1549)-Joseph Pineda(8-983-2382)
public class CaballoB {
    public int jugador1(int[][] matriz, int ganador, int fila, int columna) {
        // Declaración de variables
        int filaA1 = 0, colA1 = 0;
        // Encontrar la posición actual
        for (int x = 0; x < 8; x++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[x][j] == 3) {
                    matriz[x][j] = 0;
                }
                if (matriz[x][j] == 1) {
                    filaA1 = x;
                    colA1 = j;
                } // fin if
            } // fin for
        } // fin for

        // Validar movimientos en L
        if (((fila - filaA1 == -2 || fila - filaA1 == 2) && (columna - colA1 == 1 || columna - colA1 == -1))
                || ((columna - colA1 == -2 || columna - colA1 == 2) && (fila - filaA1 == -1 || fila - filaA1 == 1))
                        && (fila != filaA1 && columna != colA1)) {

            if (matriz[fila][columna] == 2) { // Validar si el caballo Blanco le gana al caballo Negro
                ganador = 1; // Variable que controla fin de partida si jugador 1 gana
            } // fin if

            for (int x = 0; x < 8; x++) {
                for (int j = 0; j < 8; j++) {
                    if (matriz[x][j] == 1) {
                        matriz[x][j] = 3; // Borra la posición anterior en el tablero
                    } // fin if
                    if (fila == x && columna == j) { // Mueve el caballo de posición
                        matriz[x][j] = 1;
                    } // fin if
                } // fin for
            } // fin for
        } else {
            ganador = -2; // Controla error de movimiento
        } // fin else

        return ganador;
    }

}
