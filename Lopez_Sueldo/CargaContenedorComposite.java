package Lopez_Sueldo;

import java.util.ArrayList;

public class CargaContenedorComposite implements Cargable{
    private String nombre;
    private String descripcion;
    private Double pesoContenedor;
    private ArrayList<Cargable> cargas;


    public CargaContenedorComposite(String nombre, String descripcion, Double pesoContenedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pesoContenedor = pesoContenedor;
        cargas = new ArrayList<>();
    }

    //metodo agregarCarga
    public void agregarCarga(Cargable c){
        this.cargas.add(c);
    }

    @Override
    public String getNombre() {
         return this.nombre;
    }

    @Override
    public Double mostrarPeso() {
        Double pesoTotal = 0.0;
        for (Cargable c: cargas) {
            pesoTotal+= c.mostrarPeso();
        }
        return pesoContenedor+pesoTotal;
    }
}
