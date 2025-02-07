import java.lang.Math;

class QuadraticEquation {
    private double a, b, c;
    private Double x1, x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = x2 = null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        QuadraticEquation equation = (QuadraticEquation) obj;

        if (x1 == null || x2 == null || equation.x1 == null || equation.x2 == null) {
            return x1 == equation.x1 && x2 == equation.x2;
        } else {
            return (x1.equals(equation.x1) && x2.equals(equation.x2)) ||
                    (x1.equals(equation.x2) && x2.equals(equation.x1));
        }
    }

    @Override
    public String toString() {
        if (x1 == null || x2 == null) {
            return "No real roots";
        }
        if (x1.equals(x2)) {
            return "x = " + x1;
        } else {
            return "x1 = " + x1 + ", x2 = " + x2;
        }
    }
}


