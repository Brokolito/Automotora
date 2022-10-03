import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String Nombre;
        String Marca;
        int Anho;
        int KilometrosRecorridos;
        String color;
        Automotora automotora = new Automotora();
        int Opcion;
        boolean seguir = true;
        do {
            preguntasMenu();
            Opcion = Ingresar();
            switch (Opcion) {
                case 1:
                    automotora.mostrarVehiculos();
                    break;
                case 2:
                    automotora.autosVendidos();
                    break;
                case 3:
                    System.out.println("Nombre del vehiculo");
                    Nombre=IngresarPalabra();
                    System.out.println("Ingresar Marca");
                    Marca=IngresarPalabra();
                    System.out.println("Ingrese año del vehiculo");
                    Anho=Ingresar();
                    System.out.println("Ingrese kilometros recorridos del vehiculo");
                    KilometrosRecorridos=Ingresar();
                    System.out.println("Ingrese el color del vehiculo");
                    color=IngresarPalabra();
                    automotora.addAuto(new Auto(Nombre,Marca,Anho,KilometrosRecorridos,color));
                    break;
                case 4:
                    int respuesta=0;
                    System.out.println("Desea salir Si(1)/No(2)");
                    respuesta=Ingresar();
                    while(respuesta!=1 && respuesta!=2){
                        System.out.println("Ingrese un valor valido");
                        respuesta=Ingresar();
                    }
                    if(respuesta==1) {
                        seguir = false;
                    }
                    break;
                    default:
                    while(!(Opcion>=1 && Opcion<=4)){
                        System.out.println("Ingrese un valor valido");
                        respuesta=Ingresar();
                    }
            }
        } while (seguir);
    }

    public static void preguntasMenu() {
        System.out.println("(1) Ver autos en venta");
        System.out.println("(2) Remover un auto en venta");
        System.out.println("(3) Añadir auto a venta");
    }

    public static int Ingresar() {
        Scanner intro = new Scanner(System.in);
        int Numero = 0;
        try {
                Numero = intro.nextInt();
        } catch (Exception e) {
            Numero = Ingresar();
        }
        return Numero;

    }

    public static String IngresarPalabra() {
        String Palabra;
        Scanner intro = new Scanner(System.in);
        try {
            Palabra = intro.nextLine();
        } catch (Exception e) {
            Palabra = IngresarPalabra();
        }
        return Palabra;
    }
}
