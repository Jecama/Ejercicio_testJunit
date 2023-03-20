public class Producto {

    private int codigo, stock;

    private double precio;

    private String nombre;


    public Producto(int codigo,String nombre, double precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Métodos de accesibilidad, asigna un codigo al código de un producto

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarResultado (){
        System.out.println("El producto " + nombre+ "que tiene un precio de $" + precio+"" + "tiene un stock de " + stock);
    }
}
