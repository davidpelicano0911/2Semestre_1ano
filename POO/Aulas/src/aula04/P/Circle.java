//package aula04;

public class Circle {
    private double radius;
    private double perimetro;
    private double area;

    //construtor: fazer na main dps Circle c = new Circle(0.5);
    public Circle(double radius){
        //assert radius > 0; ver se é necessário depois
        this.radius = radius;
        //this.area = area;
        //this.perimetro = perimetro;
    }
    
    // main: c.radius = 0.7 ?
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        area = Math.PI * Math.pow(radius,2);
        return area;
    }

    public double getPerimetro(){
        perimetro = 2 * Math.PI * radius;
        return perimetro;
    }
    // c.setRadius(0.7) serve para mudar o raio
    public void setRadius(double radius){
        this.radius = radius;
    }

    // C.toString e dps dá para dar print a c só.(System...(c))
    @Override
    public String toString(){
        return "Círculo \n" + "O círculo de raio " + radius + " tem área e perímetro de: \n" + "Área: " + getArea() +  "\n" + "Perímetro: " + getPerimetro()+ "\n"; 
    }

    public boolean equals(Circle c){
        return this.radius == c.getRadius();
    }
}
