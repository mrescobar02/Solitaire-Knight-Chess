//Isaac Escobar()-Iván Loaiza(8-988-2337)-Karen Lorenzo(8-987-1549)-Joseph Pineda(8-983-2382)
public class Tab {

    public void tablero(int[][] matriz, int cont, int cont2, String[] reg1, String[] reg2) {
        // Declaración de variables
        int fI = 8;
        // Creación de objetos
        Limpiar objLimpiar = new Limpiar();
        // Manejo de colores te texto
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_WHITE = "\u001b[37m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLACK_FONDO = "\u001b[40m";
        final String ANSI_WHITE_FONDO = "\u001B[47m";
        objLimpiar.limp();
        System.out.print(ANSI_CYAN + "         A   B   C   D   E   F   G   H" + ANSI_RESET);
        for (int filas = 0; filas < 8; filas++) {
            System.out.print(ANSI_CYAN + "\n      " + fI + ANSI_RESET);
            fI--;
            for (int colum = 0; colum < 8; colum++) {
                if (matriz[filas][colum] == 0) {
                    if ((filas + colum) % 2 == 0) { // Intercala colores al tablero
                        System.out.print(ANSI_RESET + " " + ANSI_WHITE + ANSI_WHITE_FONDO + "   " + ANSI_RESET);
                    } else {
                        System.out.print(ANSI_RESET + " " + ANSI_BLACK + ANSI_BLACK_FONDO + "   " + ANSI_RESET);
                    } // fin if

                } else if (matriz[filas][colum] == 1) { // Imprime caballo blanco
                    if ((filas + colum) % 2 == 0) {// Define el fondo del caballo segun su posición
                        System.out.print(" " + ANSI_WHITE_FONDO + ANSI_BLACK + "[" + ANSI_BLACK + "B" + ANSI_BLACK + "]"
                                + ANSI_RESET);
                    } else {
                        System.out.print(" " + ANSI_BLACK_FONDO + ANSI_WHITE + "[" + ANSI_WHITE + "B" + ANSI_WHITE + "]"
                                + ANSI_RESET);
                    }
                } else if (matriz[filas][colum] == 2) { // Imprime caballo negro
                    if ((filas + colum) % 2 == 0) {
                        System.out.print(" " + ANSI_WHITE_FONDO + ANSI_BLACK + "[" + ANSI_BLACK + "N" + ANSI_BLACK + "]"
                                + ANSI_RESET);
                    } else {
                        System.out.print(" " + ANSI_BLACK_FONDO + ANSI_WHITE + "[" + ANSI_WHITE + "N" + ANSI_WHITE + "]"
                                + ANSI_RESET);
                    }
                } else if (matriz[filas][colum] == 3) {
                    if ((filas + colum) % 2 == 0) {
                        System.out.print(" " + ANSI_WHITE_FONDO + ANSI_YELLOW + "[¤]" + ANSI_RESET);
                    } else
                        System.out.print(" " + ANSI_BLACK_FONDO + ANSI_YELLOW + "[¤]" + ANSI_RESET);
                }
                // Imprimir posición actual de cada caballo
                if (colum == 7 && filas == 3) {
                    System.out.print("\tCaballo Blanco: " + reg1[cont]);
                } // fin if
                if (colum == 7 && filas == 4) {
                    System.out.print("\tCaballo Negro: " + reg2[cont2]);
                } // fin if
            } // fin for
        } // fin for
        System.out.print("\n");
    }// fin método
}// fin class
