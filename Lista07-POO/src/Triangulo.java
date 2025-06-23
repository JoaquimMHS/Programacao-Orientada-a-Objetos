public class Triangulo implements Forma2D{
    private double base;
    private double altura;
    //Contrutor
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    //Getters e Setters
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return ((base * altura)/2);
    }
    @Override
    public void imprimirDados(){
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Área: "+calcularArea());
    }

}
