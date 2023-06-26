package POO.heranca.Shape;

public class Circle extends Shape {

    private Double raio;

    public Circle() {
    }

    public Circle(Double raio) {
        this.raio = raio;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.raio ;
    }

    @Override
    public double getArea() {
        return 3.14 * (this.raio * this.raio);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
