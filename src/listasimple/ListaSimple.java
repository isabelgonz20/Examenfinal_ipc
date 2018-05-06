package listasimple;

import java.util.Scanner;

public class ListaSimple {

    static Lista lista = new Lista();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int seleccion = 0;
        while (seleccion != 4) {
            System.out.println(" ");
            System.out.println("\033[34m***********************");
            System.out.println("\033[34m****** Bienvenido *****");
            System.out.println("\033[34m***********************");
            System.out.println("");
            System.out.println("\033[32m1. Ingresar Datos");
            System.out.println("\033[32m2. Buscar Datos");
            System.out.println("\033[32m3. Mostrar Datos");
            System.out.println("\033[32m4. Eliminar Datos al final");
            System.out.println("\033[32m5. Eliminar Datos al inicio");
            System.out.println("\033[32m6. Tamaño");
            System.out.println("\033[32m7. Salir");
            System.out.println("Ingrese una opcion: ");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    lista.mostrarLista();
                    break;
                case 4:
                    lista.removerDelFinal();
                    break;
                case 5:
                    lista.removerDelInicio();
                    break;

                case 6:
                    lista.getTam();
                    break;

            }

        }
    }

    public static void ingresar() {
        String nombre = "";
        Object dato;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese Numero:");
            dato = sc.nextInt();
            System.out.println("Ingrese Nombre:");
            nombre = sc.next();
            lista.agregarAlInicio(dato, nombre);
        }
    }

    public static void buscar() {
        Scanner sca = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el dato a buscar: ");
        numero = sca.nextInt();
        lista.buscarNodo(numero);
    }

}
