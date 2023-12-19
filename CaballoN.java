//Isaac Escobar(8-963-41)-Iván Loaiza(8-988-2337)-Karen Lorenzo(8-987-1549)-Joseph Pineda(8-983-2382)
public class CaballoN {
    public int jugador2(int[][] matriz, int ganador, int fila, int columna) {

        // Declaración de variables
        int filaA2 = 0, colA2 = 0;

        // Encontrar la posición actual
        for (int x = 0; x < 8; x++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[x][j] == 3) {
                    matriz[x][j] = 0;
                }
                if (matriz[x][j] == 2) {
                    filaA2 = x;
                    colA2 = j;
                }
            }
        } // fin for

        // Validar movimientos en L
        if (((fila - filaA2 == -2 || fila - filaA2 == 2) && (columna - colA2 == 1 || columna - colA2 == -1))
                || ((columna - colA2 == -2 || columna - colA2 == 2) && (fila - filaA2 == -1 || fila - filaA2 == 1))
                        && (fila != filaA2 && columna != colA2)) {

            if (matriz[fila][columna] == 1) { // Validar si el caballo Negro le gana al blanco
                ganador = 2; // Variables que controla fin de partida si jugador 2 gana
            } // fin if

            for (int x = 0; x < 8; x++) {
                for (int j = 0; j < 8; j++) {
                    if (matriz[x][j] == 2) {
                        matriz[x][j] = 3; // Borra posición anterior en el tablero
                    } // fin if
                    if (fila == x && columna == j) { // Mueve el caballo de posición
                        matriz[x][j] = 2;
                    } // fin if
                }
            } // fin for
        } else {
            ganador = -2; // Controla error de movimiento
        } // fin else
        return ganador;
    }// fin método
}// fin class
