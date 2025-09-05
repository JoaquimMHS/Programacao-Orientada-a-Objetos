//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ponto {
    double x;
    double y;
    double distancia (Ponto outroPonto){
        return Math.sqrt(
                Math.pow(this.x - outroPonto.x, 2) +
                Math.pow(this.y - outroPonto.y, 2)
                );

    }
}
class Triangulo {
    private  Ponto a;
    private  Ponto b;
    private  Ponto c;

    public Triangulo(Ponto a, Ponto b, Ponto c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double perimetro(){
        double ab = a.distancia(b);
        double bc = b.distancia(c);
        double ac = c.distancia(a);
        return ab + bc + ac;
    }

}


