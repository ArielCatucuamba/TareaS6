public class Main {
    public static void main(String[] args) {
        Figuras3D cubo = new Figuras3D(12, "Cubo", 6, 3);
        cubo.mostrar_datos();
        System.out.println("Volumen: " + cubo.calcular_volumen(cubo.arista, cubo.ncaras));
        
        Figuras2D f1 = new Figuras2D(2,"Cuadrado", 10, 10);
        f1.mostrar_datos();
        irregulares i1 = new irregulares(3, "Cuadrado", 23.3, 12.2, "no");
        i1.Verficiar_irregular();
        i1.mostrar_datos();
        
    }
}
