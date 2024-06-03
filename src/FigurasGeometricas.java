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

class Figuras2D extends FigurasGeometricas{
    public double area;
    public double perimetro;
    public Figuras2D(int lados, String nombres, double area, double perimetro){
        super(lados, nombres);
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        System.out.println("Area: "+ area);
        System.out.println("Perimetro: "+perimetro);
    }
    public double calcula_area(double area) {
        return area;
    }

    public double calcula_perimetro(double perimetro){
        return perimetro;
    }
}

class irregulares extends Figuras2D{
    public String verficiar;
    public irregulares(int lados, String nombres, double area, double perimetro, String verficiar){
        super(lados, nombres, area, perimetro);
        this.verficiar = verficiar;
    }
    public void Verficiar_irregular(){
        if ((verficiar == "Si") || (verficiar == "si") || (verficiar == "SI")){
            System.out.println("Una figura geometrica irregular tiene sus lados de diferentes medidas");
        }
        else{
            System.out.println("Verifique su informacion");
            verficiar = "no";
        }
    }

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        System.out.println("Figura irregular: "+ verficiar);

    }
}
