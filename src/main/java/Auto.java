public class Auto {
    private String Nombre;
    private String Marca;
    private int Anho;
    private int KilometrosRcorridos;
    private String Color;
    public Auto(String Nombre, String Marca, int Anho, int KilometrosRecorridos, String Color){
        this.Nombre=Nombre;
        this.Marca=Marca;
        this.Anho=Anho;
        this.KilometrosRcorridos=KilometrosRecorridos;
        this.Color=Color;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAnho() {
        return Anho;
    }

    public void setAnho(int anho) {
        Anho = anho;
    }

    public int getKilometrosRcorridos() {
        return KilometrosRcorridos;
    }

    public void setKilometrosRcorridos(int kilometrosRcorridos) {
        KilometrosRcorridos = kilometrosRcorridos;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    @Override
    public String toString() {
        return "Nombre: "+Nombre+", Marca: "+Marca+", Año: "+Anho+", Kilometros Recorridos:"+KilometrosRcorridos+", Color: "+Color;
    }
}
