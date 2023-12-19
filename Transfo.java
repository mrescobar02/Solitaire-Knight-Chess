//Isaac Escobar()-Iván Loaiza(8-988-2337)-Karen Lorenzo(8-987-1549)-Joseph Pineda()
public class Transfo {

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

}// fin class
