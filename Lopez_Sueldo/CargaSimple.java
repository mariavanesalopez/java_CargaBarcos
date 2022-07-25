package Lopez_Sueldo;

public class CargaSimple implements Cargable{

    private String nombre;
    private String descripcion;
    private Double pesoCargaSimple;
    private boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, Double pesoCargaSimple, boolean refrigeracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pesoCargaSimple = pesoCargaSimple;
        this.refrigeracion = refrigeracion;
    }



    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public Double mostrarPeso() {
        if(refrigeracion){
            //return this.pesoCargaSimple+((pesoCargaSimple*10)/100);
            return this.pesoCargaSimple*1.1;

        }
        return this.pesoCargaSimple;
    }
}
