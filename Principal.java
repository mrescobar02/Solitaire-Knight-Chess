//Isaac Escobar(8-963-41)-Iván Loaiza(8-988-2337)-Karen Lorenzo(8-987-1549)-Joseph Pineda(8-983-2382)
import java.io.*;
import java.util.*;

public class Principal {

    public static void main(String[] args) throws IOException {

        BufferedReader nombres = new BufferedReader(new InputStreamReader(System.in));
        // Manejo de Colores de Texto
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_RED = "\u001b[31m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";
        Scanner enter = new Scanner(System.in);
        // Creación de Objetos
        CaballoB objJ1 = new CaballoB();
        CaballoN objJ2 = new CaballoN();
        Tab objTab = new Tab();
        Registro objReg = new Registro();
        Limpiar objL = new Limpiar();
        Lectura objEnt = new Lectura();

        // Declaración de variables
        boolean play = true, cond = true;

        while (cond) {
            try {
                objL.limp();// LIMPIEZA DE LA CONSOLA
                // IMPRESIÓN DE TITULO
                System.out.println("\t\t $$$$$$" + "\\" + "     $$$$$" + "\\" + " $$$$$$$$" + "\\" + " $$$$$$$" + "\\"
                        + "  $$$$$$$" + "\\" + "  $$$$$$$$" + "\\" + " $$$$$$$$" + "\\");
                System.out
                        .println("\t\t$$  __$$" + "\\" + "    " + "\\" + "__$$ |$$  _____|$$  __$$" + "\\" + " $$  __$$"
                                + "\\" + " $$  _____|" + "\\" + "____$$  |");
                System.out.println("\t\t$$ /  $$ |      $$ |$$ |      $$ |  $$ |$$ |  $$ |$$ |          $$  / ");
                System.out.println(
                        "\t\t$$$$$$$$ |      $$ |$$$$$" + "\\" + "    $$ |  $$ |$$$$$$$  |$$$$$" + "\\"
                                + "       $$  /  ");
                System.out.println(
                        "\t\t$$  __$$ |$$" + "\\" + "   $$ |$$  __|   $$ |  $$ |$$  __$$< $$  __|     $$  /   ");
                System.out.println("\t\t$$ |  $$ |$$ |  $$ |$$ |      $$ |  $$ |$$ |  $$ |$$ |       $$  /    ");
                System.out
                        .println("\t\t$$ |  $$ |" + "\\" + "$$$$$$  |$$$$$$$$" + "\\" + " $$$$$$$  |$$ |  $$ |$$$$$$$$"
                                + "\\" + " $$$$$$$$" + "\\" + " ");
                System.out.println("\t\t" + "\\" + "__|  " + "\\" + "__| " + "\\" + "______/ " + "\\" + "________|"
                        + "\\" + "_______/ " + "\\" + "__|  " + "\\" + "__|" + "\\" + "________|" + "\\"
                        + "________|");
                // IMPRESIÓN DE SUBTITULO
                System.out.print(ANSI_YELLOW);
                System.out.println(
                        "\t      __   _____ ___  ___ ___ ___  _  _    ___   _   ___   _   _    _    ___  ___ ");
                System.out
                        .println("\t      " + "\\" + " " + "\\" + " / / __| _ " + "\\" + "/ __|_ _/ _ " + "\\" + "| "
                                + "\\"
                                + "| |  / __| /_" + "\\" + " | _ ) /_" + "\\" + " | |  | |  / _ " + "\\" + "/ __|");
                System.out.println(
                        "\t       " + "\\" + " V /| _||   /" + "\\" + "__ " + "\\" + "| | (_) | .` | | (__ / _ " + "\\"
                                + "| _ " + "\\" + "/ _ " + "\\" + "| |__| |_| (_) " + "\\" + "__ " + "\\");
                System.out.println("\t        " + "\\" + "_/ |___|_|_" + "\\" + "|___/___" + "\\" + "___/|_|" + "\\"
                        + "_|  "
                        + "\\"
                        + "___/_/ " + "\\" + "_" + "\\" + "___/_/ " + "\\" + "_" + "\\" + "____|____" + "\\"
                        + "___/|___/");
                System.out.print(ANSI_RESET);
                System.out.println(ANSI_CYAN + "\n\n\t\t\t\t\tPULSE ENTER PARA CONTINUAR..." + ANSI_RESET);
                enter.nextLine();
                while (play) {
                    // Declaración de variables
                    String posi = "", name_j1 = "", name_j2 = "";
                    char fil, col;
                    boolean turno1 = true, turno2 = false, error = false, n = true, m = true;
                    int ganador = -1, g, fila, columna, opcion;
                    String[] reg1 = new String[1];
                    String[] reg2 = new String[1];
                    int tam1, tam2, cont = 0, cont2 = 0;
                    int[][] matriz = { { 0, 0, 0, 0, 0, 0, 2, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 1, 0, 0, 0, 0, 0, 0 } };

                    // Inicialización de Variables con las posiciones iniciales " + "\\" + "
                    reg1[0] = "B1";
                    reg2[0] = "G8";
                    objL.limp();
                    // Entrada y Validación para que se ingrese el nombre de forma correcta
                    while (n) {
                        System.out.print("\n\t\tIngrese nombre del " + ANSI_CYAN + "[Jugador 1]" + ANSI_RESET + ": ");
                        name_j1 = nombres.readLine().toUpperCase();
                        if (name_j1.length() != 0) {// valida que el nombre no esté vacío
                            n = false;
                        } else {
                            objL.limp();
                            System.out.println(ANSI_RED + "\n\t\tNo puedes ingresar un nombre vacío" + ANSI_RESET);
                        }
                    }
                    objL.limp();
                    // Entrada y Validación para que se ingrese el nombre de forma correcta
                    while (m) {
                        System.out.print("\n\t\tIngrese nombre del " + ANSI_RED + "[Jugador 2]" + ANSI_RESET + ": ");
                        name_j2 = nombres.readLine().toUpperCase();
                        if (name_j2.length() != 0 && !name_j2.equals(name_j1)) {// valida que el nombre no esté vacío ni
                                                                                // se repita
                            m = false;
                        } else if (name_j2.equals(name_j1)) {// valida que no se puedan repetir los nombres
                            objL.limp();
                            System.out.println(
                                    ANSI_RED + "\n\t\tNo puedes llamarte igual que el [Jugador 1]" + ANSI_RESET);
                        } else if (name_j2.length() <= 0) {// válida que el nombre no este vacío
                            objL.limp();
                            System.out.println(ANSI_RED + "\n\t\tNo puedes ingresar un nombre vacío" + ANSI_RESET);
                        }
                    }

                    // Procesos
                    objL.limp(); // Limpia consola
                    ganador = -1;
                    while (ganador == -1) {
                        while (turno1) {
                            tam1 = reg1.length; // Tamaño del arreglo Jugador 1
                            posi = objEnt.entrada(error, matriz, cont, cont2, reg1, reg2, turno1, name_j1, name_j2);

                            if (posi.equals("EXIT")) { // Evalúa si se desea salir del programa
                                ganador = 0;
                                break;
                            } else {
                                fil = posi.charAt(1); // Toma de valores de fila y columna
                                col = posi.charAt(0);
                                fila = objEnt.tranF(fil); // Llamado a método de transformación
                                columna = objEnt.tranC(col);
                                if (fila == -1 || columna == -1) { // Valida que se hayan ingresado datos válidos
                                    error = true;
                                    objL.limp(); // Limpia consola
                                    continue;
                                } // fin if

                                g = objJ1.jugador1(matriz, ganador, fila, columna); // Llamado a método para realizar
                                                                                    // movimiento
                                ganador = g;
                                if (ganador == -2) { // Evalúa si los movimientos ingresados sean válidos
                                    ganador = -1;
                                    error = true;
                                    objL.limp(); // Limpia consola
                                    continue;
                                } else { // Fin del turno 1
                                    cont++;
                                    reg1 = objReg.regis1(posi, tam1, reg1); // Actualiza Registro
                                    turno1 = false;
                                    turno2 = true;
                                    error = false;
                                } // fin else

                            } // fin else
                        } // fin while turno 1
                        if (ganador == 1) { // Evalúa si el jugador 1 gana
                            objTab.tablero(matriz, cont, cont2, reg1, reg2);
                            System.out.println("\n" + ANSI_CYAN + "\t¡" + name_j1 + " gana!" + ANSI_RED);
                            objReg.impres(cont, reg1, reg2, cont2, name_j1, name_j2); // Impresión registro

                        } else if (ganador == 0) { // Evalúa si el jugador da la partida por finalizada
                            objTab.tablero(matriz, cont, cont2, reg1, reg2);
                            System.out.println("\n\tPartida Finalizada");
                            objReg.impres(cont, reg1, reg2, cont2, name_j1, name_j2); // Impresión registro
                            System.out.print("\n\n\t\tPresione una tecla para salir...");
                            play = false;
                            enter.nextLine();
                            break;
                        }

                        objL.limp(); // Limpia consola
                        while (turno2) { // Inicia Turno 2
                            tam2 = reg2.length;
                            posi = objEnt.entrada(error, matriz, cont, cont2, reg1, reg2, turno1, name_j1, name_j2);
                            // Evalua si se desea salir del programa
                            if (posi.equals("EXIT")) {
                                ganador = 0;
                                break;
                            } else {
                                // Toma de filas y columnas y transformación de string a int mediante llamado a
                                // métodos externos
                                fil = posi.charAt(1);
                                col = posi.charAt(0);
                                fila = objEnt.tranF(fil);
                                columna = objEnt.tranC(col);
                                if (fila == -1 || columna == -1) { // Evalua si los datos ingresados son correctos
                                    error = true;
                                    objL.limp(); // Limpia consola
                                    continue;
                                }
                                g = objJ2.jugador2(matriz, ganador, fila, columna); // Llamado a método para realizar el
                                                                                    // movimiento
                                // objTab.tablero(matriz); // Impresión del tablero mediante llamado a metodo
                                ganador = g;
                                if (ganador == -2) { // Evalúa si los movimientos ingresados sean validos
                                    ganador = -1;
                                    error = true;
                                    objL.limp(); // Limpia consola
                                    continue;
                                } else {
                                    cont2++;
                                    reg2 = objReg.regis1(posi, tam2, reg2);
                                    turno2 = false; // Fin del turno 2
                                    turno1 = true;
                                    error = false;
                                }
                            }
                        }
                        objL.limp(); // Limpia consola
                        if (ganador == 2) { // Evalúa si el jugador 2 gana
                            objTab.tablero(matriz, cont, cont2, reg1, reg2);
                            System.out.print("\n" + ANSI_RED + "\t¡" + name_j2 + " gana!" + ANSI_RESET);
                            objReg.impres(cont, reg1, reg2, cont2, name_j1, name_j2);

                        } else if (ganador == 0) { // Evalua si el jugador da la partida por finalizada
                            objTab.tablero(matriz, cont, cont2, reg1, reg2);
                            System.out.print("\n\tPartida Finalizada");
                            objReg.impres(cont, reg1, reg2, cont2, name_j1, name_j2);
                            play = false;
                            System.out.print("\n\n\t\tPresione una tecla para salir...");
                            enter.nextLine();
                        }
                        if (ganador == 1 || ganador == 2) {
                            System.out.print("\n\t1. Si\n\t2. no\n\tDESEA JUGAR DENUEVO?: ");
                            // leer opcion
                            opcion = Integer.parseInt(nombres.readLine());
                            if (opcion == 1) {
                                ganador = -2;
                                play = true;
                            } else {
                                ganador = -2;
                                play = false;
                            }
                        }

                    } // fin while/////////////////////
                    objL.limp();
                    System.out.print(ANSI_RED);
                    System.out.print(
                            "\n\t @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@      @@@@@@   @@@  @@@  @@@@@@@@  @@@@@@@   ");
                    System.out.print(
                            "\n\t@@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@     @@@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@@  ");
                    System.out.print(
                            "\n\t!@@        @@!  @@@  @@! @@! @@!  @@!          @@!  @@@  @@!  @@@  @@!       @@!  @@@  ");
                    System.out.print(
                            "\n\t!@!        !@!  @!@  !@! !@! !@!  !@!          !@!  @!@  !@!  @!@  !@!       !@!  @!@  ");
                    System.out.print(
                            "\n\t!@! @!@!@  @!@!@!@!  @!! !!@ @!@  @!!!:!       @!@  !@!  @!@  !@!  @!!!:!    @!@!!@!   ");
                    System.out.print(
                            "\n\t!!! !!@!!  !!!@!!!!  !@!   ! !@!  !!!!!:       !@!  !!!  !@!  !!!  !!!!!:    !!@!@!    ");
                    System.out.print(
                            "\n\t:!!   !!:  !!:  !!!  !!:     !!:  !!:          !!:  !!!  :!:  !!:  !!:       !!: :!!   ");
                    System.out.print(
                            "\n\t:!:   !::  :!:  !:!  :!:     :!:  :!:          :!:  !:!   ::!!:!   :!:       :!:  !:!  ");
                    System.out.print(
                            "\n\t ::: ::::  ::   :::  :::     ::    :: ::::     ::::: ::    ::::     :: ::::  ::   :::  ");
                    System.out
                            .print("\n\t :: :: :    :   : :   :      :    : :: ::       : :  :      :      : :: ::    :   : :");
                    System.out.print(ANSI_RESET);
                }
                cond = false;
            } catch (Exception e) {
                System.out.print(ANSI_RED);
                objL.limp();
                System.out.println("\n\n\t\t88888888b  888888ba   888888ba   .88888.   888888ba      dP ");
                System.out.println("\t\t 88         88    `8b  88    `8b d8'   `8b  88    `8b    88 ");
                System.out.println("\t\ta88aaaa    a88aaaa8P' a88aaaa8P' 88     88 a88aaaa8P'    88 ");
                System.out.println("\t\t 88         88   `8b.  88   `8b. 88     88  88   `8b.    dP ");
                System.out.println("\t\t 88         88     88  88     88 Y8.   .8P  88     88       ");
                System.out.println("\t\t 88888888P  dP     dP  dP     dP  `8888P'   dP     dP    oo");
                System.out.print(ANSI_RESET);
                System.out.print("\n\n\t\tPresione una tecla para reiniciar el programa...");
                enter.nextLine();
            }
        }

    }// fin main
}// fin class
