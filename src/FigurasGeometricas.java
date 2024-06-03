class FigurasGeometricas {
    public int lados;
    public String nombres;
    public FigurasGeometricas(int lados, String nombres){
        this.lados = lados;
        this.nombres = nombres;
    }
    public void mostrar_datos(){
        System.out.println("Lados: "+lados);
        System.out.println("Nombres: "+nombres);
    }
}
class Figuras3D extends FigurasGeometricas{
    public int ncaras;
    public double arista;
    public Figuras3D(int lados, String nombres, int ncaras, double arista){
        super(lados, nombres);
        this.ncaras=ncaras;
        this.arista=arista;
    }
}
