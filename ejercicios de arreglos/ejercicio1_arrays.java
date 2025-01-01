import java.util.Scanner;

public class ejercicio1_arrays {
    public static void main(String[] args) {
        ejercicio1_arrays arrays = new ejercicio1_arrays();

        int[] arr = new int[10];

        arrays.llenarArray(arr);

        arrays.mostrarArray(arr);

        System.out.println(" ");

        arrays.eliminarElemento(arr);

        arrays.mostrarArray(arr);

        System.out.println(" ");

        arrays.cambiarElemneto(arr);

        arrays.mostrarArray(arr);
    }

    public void llenarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void eliminarElemento(int[] arr) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el indice del elemento a eliminar: ");
        int indice = teclado.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (i == indice) {
                arr[i] = 0;
            }
        }
    }

    public void cambiarElemneto(int[] arr) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el indice del elemento que desee cambair");
        int indice = teclado.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (i == indice) {
                System.out.println("ingrese el nuevo valor del elemento");
                int valor = teclado.nextInt();
                arr[i] = valor;
            }
        }
    }
}