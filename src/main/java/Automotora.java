import java.util.ArrayList;
import java.util.Scanner;

public class Automotora {
    private ArrayList<Auto>autos;
    public Automotora(){
        this.autos=new ArrayList<>();
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
    public void addAuto(Auto auto){
        autos.add(auto);
    }
    public ArrayList<Auto> autosVendidos(){
        Scanner intro=new Scanner(System.in);
        ArrayList<Auto>autosVendidos=new ArrayList<>();
        int NumeroDeAuto=0;
        recorrerArray(autos);
        System.out.println("Cual de estos se vendio (1-"+(autos.size())+")....");
        NumeroDeAuto=Ingresar();
        autosVendidos.add(autos.get(NumeroDeAuto));
        recorrerArray(autosVendidos);
        autos.remove(NumeroDeAuto);
        return autosVendidos;
    }
    public void mostrarVehiculos(){
        for(int i=0;i<autos.size();i++){
            System.out.println(autos.get(i));
        }
    }
    public void recorrerArray(ArrayList<Auto> autos){
        for(int i=0;i<autos.size();i++){
            System.out.println(autos.get(i));
        }
    }
    public int Ingresar(){
        Scanner intro=new Scanner(System.in);
        int Numero=0;
        try{
                System.out.println("Ingrese un numero");
                Numero = intro.nextInt()-1;
        }
        catch (Exception e){
            System.out.println("Ingrese un numero valido");
            Numero=Ingresar();
        }
        return Numero;
    }
}
