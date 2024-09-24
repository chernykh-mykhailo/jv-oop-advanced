package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    protected String getName() {
        return "isosceles trapezoid";
    }

    @Override
    protected String getProperties() {
        return "base1: " + base1 + " units, base2: " + base2
                + " units, height: " + height + " units";
    }
}
