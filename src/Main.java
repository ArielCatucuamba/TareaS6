public class Main {
    public static void main(String[] args) {
        Figuras3D cubo = new Figuras3D(12, "Cubo", 6, 3);
        cubo.mostrar_datos();
        System.out.println("Volumen: " + cubo.calcular_volumen(cubo.arista, cubo.ncaras));
    }
}