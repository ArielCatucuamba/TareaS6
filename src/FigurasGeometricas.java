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

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        System.out.println("Caras: "+ncaras);
        System.out.println("Arista: "+arista);
    }
    public double calcular_volumen(double arista, int ncaras){
        if(ncaras==6){
            return Math.pow(arista, 3);
        }
        else {
            System.out.println("Figura no reconocida o fórmula no definida.");
            return 0;
        }
    }
}
