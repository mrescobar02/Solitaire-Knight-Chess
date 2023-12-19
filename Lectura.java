
//Isaac Escobar(8-963-41)-Iván Loaiza(8-988-2337)-Karen Lorenzo(8-987-1549)-Joseph Pineda(8-983-2382)
import java.io.*;

public class Lectura {

    public String entrada(boolean error, int[][] matriz, int cont, int cont2, String[] reg1, String[] reg2,
            boolean turno1, String name_j1, String name_j2) throws IOException {

        BufferedReader objEntra = new BufferedReader(new InputStreamReader(System.in));
        Limpiar objL = new Limpiar();
        Tab objTab = new Tab();
        // Manejo de Colores de Texto
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_RED = "\u001b[31m";
        final String ANSI_RESET = "\u001B[0m";
        // Declaraación de Variables
        String pos = "";
        boolean valid = true;
        while (valid) {
            objTab.tablero(matriz, cont, cont2, reg1, reg2); // Llamado a método que imprime tablero
            if (error) { // Controla impresión de error
                System.out.println(ANSI_RED
                        + "\n\tLa posición ingresada no es válida, vuelva a intentarlo" + ANSI_RESET);
            }
            if (turno1) {
                System.out.print("\n\tTurno de " + ANSI_CYAN + name_j1 + ANSI_RESET);
            } else {
                System.out.print("\n\tTurno de " + ANSI_RED + name_j2 + ANSI_RESET);
            }

            System.out.print("\n\t-Posicionamiento de Ficha");
            System.out.print("\n\tIngrese la posición (Ejemplo: B1): ");
            pos = objEntra.readLine(); // Entrada de datos
            // Validar que el valor tenga dos digitos o si desea salir

            if ((pos.length() < 2 || pos.length() > 2) && !pos.equals("EXIT")) {
                error = true;
                objL.limp(); // Limpia consola
                continue;
            } // Fin if

            if (pos.length() == 2) { // Convierte en mayuscúla la posición
                pos = pos.toUpperCase();
            } // fin if
            valid = false;
        }
        return pos;
    }

    public int tranF(char fil) { // Método par transformar fila de caracter a entero
        int fila;
        switch (fil) {
            case '8':
                fila = 0;
                break;
            case '7':
                fila = 1;
                break;
            case '6':
                fila = 2;
                break;
            case '5':
                fila = 3;
                break;
            case '4':
                fila = 4;
                break;
            case '3':
                fila = 5;
                break;
            case '2':
                fila = 6;
                break;
            case '1':
                fila = 7;
                break;
            default:
                fila = -1;
                break;
        }// fin switch

        return fila;
    }// fin método

    public int tranC(char col) { // Método par transformar columna de caracter a entero
        int columna;
        switch (col) {
            case 'A':
                columna = 0;
                break;
            case 'B':
                columna = 1;
                break;
            case 'C':
                columna = 2;
                break;
            case 'D':
                columna = 3;
                break;
            case 'E':
                columna = 4;
                break;
            case 'F':
                columna = 5;
                break;
            case 'G':
                columna = 6;
                break;
            case 'H':
                columna = 7;
                break;
            default:
                columna = -1;
                break;
        }// fin switch
        return columna;
    }// fin método
}
