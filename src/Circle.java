public class Circle extends AbstractShape {

    private Double radios;
    public Circle(Color color,  Double radios) {
        super(color);
        this.radios = radios;
    }

    @Override
    public double area() {
        return radios / 2;
    }

    public Double getRadios() {
        return radios;
    }

    public void setRadios(Double radios) {
        this.radios = radios;
    }




}
