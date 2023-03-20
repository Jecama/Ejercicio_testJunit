import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static String nombre;
    static double precio;
    static int opcion, stock, codigo;

    public static void main(String[] args) {
        // se instancia la clase Producto, Vector y se invocan los metodos
        Producto p;
        Vector productos = new Vector();
        do {
            System.out.print("\nMENU"
                    + "\n 1. Registrar compra"
                    + "\n 2. Registrar venta"
                    + "\n 3." + " Buscar producto"
                    + "o\n 4. Salir  __ ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Favor ingresar código: ");
                    codigo = entrada.nextInt();
                    System.out.print("Favor ingresar nombre: ");
                    nombre = entrada.next();
                    System.out.print("Favor ingresar precio: ");
                    precio = entrada.nextDouble();
                    System.out.print("Favor ingresar cantidad en stock: ");
                    stock = entrada.nextInt();
                    p = busqueda(codigo, productos);
                    if (p == null) {
                        productos.addElement(new Producto(codigo, nombre, precio, stock));
                        System.out.print("Producto agregado");
                    } else
                        System.out.print("ya existe este producto");

                    break;

                case 2:
                    System.out.print("Favor ingresar código: ");
                    codigo = entrada.nextInt();
                    p = busqueda(codigo, productos);
                    if (p != null) {
                        if (p.getStock() > 0) {
                            p.setStock(p.getStock() - 1);
                            System.out.print("Venta realizada");
                            p.mostrarResultado();
                        } else
                            System.out.print("Sin stock");
                    } else
                        System.out.print("Producto inexistente");

                    break;

                case 3:
                    System.out.print("Favor ingresar código: ");
                    codigo = entrada.nextInt();
                    p = busqueda(codigo, productos);
                    if (p != null)
                        p.mostrarResultado();
                    else
                        System.out.print("Producto inexistente");
                    break;

                case 4:
                    break;

                default:
                    System.out.println("favor ingresar opcion de menu");
            }
        } while (opcion != 4);
    }

    public static Producto busqueda(int codigo, Vector productos){
        Producto p, returnp = null;
        boolean validar = false;

        for (int i = 0; i < productos.size(); i++){
            p = (Producto)productos.elementAt(i); // elementAt trae el elemento en la posición i

            if(p.getCodigo() == codigo)
                returnp = p;
        }
        return returnp;
    }
}