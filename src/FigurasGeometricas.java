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

