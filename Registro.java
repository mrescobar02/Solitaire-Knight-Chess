
//Isaac Escobar(8-963-41)-Iván Loaiza(8-988-2337)-Karen Lorenzo(8-987-1549)-Joseph Pineda(8-983-2382)
import java.util.Arrays;

public class Registro {

    // Método para actualizar el Registro del jugador 1
    public String[] regis1(String posi, int tam1, String[] reg1) {
        reg1 = Arrays.copyOf(reg1, tam1 + 1);
        reg1[tam1] = posi;
        return reg1;
    }

    // Método para actualizar el Registro del jugador 2
    public String[] regis2(String posi, int tam2, String[] reg2) {
        reg2 = Arrays.copyOf(reg2, tam2 + 1);
        reg2[tam2] = posi;
        return reg2;
    }

    // Método para imprimir registro de movimientos
    public void impres(int cont, String[] reg1, String[] reg2, int cont2, String name_j1, String name_j2) {
        int tam2;
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_RED = "\u001b[31m";
        System.out.println("\n\n[Jugador 1]= " + ANSI_CYAN + name_j1+ANSI_RESET);
        System.out.println("[Jugador 2]= " + ANSI_RED + name_j2);
        System.out.println("\n\t\tRegistro de Movimientos\n");
        System.out.println("\t      " + ANSI_CYAN + "-Jugador 1" + ANSI_RED + "\t-Jugador 2" + ANSI_RESET);
        for (int x = 1; x <= cont; x++) { // En caso que el primer jugador salga y jugador 2 no tenga movimiento en esa
                                          // posición
            if (cont > cont2) {
                tam2 = reg2.length;
                reg2 = Arrays.copyOf(reg2, tam2 + 1);
                reg2[tam2] = "//";
            }
            System.out
                    .print("\nMovimiento [" + (x) + "]: " + ANSI_YELLOW + reg1[x - 1] + ANSI_RESET + " -> " + reg1[x]);
            System.out.print("\t" + ANSI_YELLOW + reg2[x - 1] + ANSI_RESET + " -> " + reg2[x] + "\n");
        }
        System.out.print("\nPosición de salida:" + reg1[0]);
        System.out.print("\t\t   " + reg2[0]);
        System.out.print("\nPosición final:    " + reg1[cont]);
        System.out.print("\t\t   " + reg2[cont2]);

    }// fin método
}// fin class
