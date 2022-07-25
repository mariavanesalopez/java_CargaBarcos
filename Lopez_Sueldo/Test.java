package Lopez_Sueldo;

public class Test {
    public static void main(String[] args) {
        CargableFactory producto = CargableFactory.getInstance();
        Cargable tv = producto.crearCargable("tv");
        Cargable medicamentos= producto.crearCargable("medicamentos");
        Cargable contenedor= producto.crearCargable("contenedor");

        Barco b = new Barco();
        b.agregarCarga(tv);
        b.agregarCarga(medicamentos);
        b.agregarCarga(contenedor);
        b.mostrar();
    }
}
