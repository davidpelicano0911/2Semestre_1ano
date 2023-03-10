//package aula04;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1,double lado2,double lado3){
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.print("Os lados do triângulo devem ser valores positivos.");
        }
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.print("Os lados do triângulo não satisfazem a desigualdade triangular.");

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void setSides(double lado1, double lado2, double lado3) {
        if ((lado1 < 0 || lado2 > 0 || lado3 < 0))
            System.out.print("Sizes must be positive.");
        if((lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1))
            throw new IllegalArgumentException("Triangle cannot be created with those sides.");
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean equals(Triangulo c2) {
        return this.lado1 == c2.lado1 && this.lado2 == c2.lado2 && this.lado3 == c2.lado3;
    }

    public String toString() {
        return "Triangle with sides " + this.lado1 + ", " + this.lado2 + ", " + this.lado3;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
    }

    public double getPerimeter() {
        return this.lado1 + this.lado2 + this.lado3;
    }


}
