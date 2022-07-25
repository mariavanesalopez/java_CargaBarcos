package Lopez_Sueldo;

import java.util.ArrayList;

public class Barco {

    private ArrayList<Cargable> cargas;

    public Barco(){
        cargas=new ArrayList<>();
    }


   public void agregarCarga(Cargable s){
       this.cargas.add(s);
   }


    public void mostrar(){
        for (Cargable s: cargas) {
            System.out.println(" carga: "+ s.getNombre()+ " peso: "+ s.mostrarPeso());

        }
    }
}
