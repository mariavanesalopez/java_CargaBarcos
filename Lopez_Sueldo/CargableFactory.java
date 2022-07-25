package Lopez_Sueldo;

public class CargableFactory {
    private static CargableFactory instance;

    private CargableFactory(){

    }

    public static CargableFactory getInstance(){
        if(instance == null){
            instance = new CargableFactory();
        }
        return instance;
    }


    public Cargable crearCargable(String s){
        switch (s){
            case "tv":
                return new CargaSimple("TV 32 LCD", "carga simple",3.0,false);
            case "medicamentos":
                return new CargaSimple("medicamentos", "carga simple",4.0,true);
            case "contenedor":
                CargaSimple tv = new CargaSimple("TV 32 LCD", "carga simple",3.0,false);
                CargaSimple medicamentos = new CargaSimple("medicamentos", "carga simple",4.0,true);
                CargaContenedorComposite contenedor = new CargaContenedorComposite("contenedor","fragil",150.0);
                contenedor.agregarCarga(tv);
                contenedor.agregarCarga(medicamentos);
                return contenedor;
            default:
                System.out.println("no se encontro carga para esta ocasion");
                return null;
        }

    }
}
