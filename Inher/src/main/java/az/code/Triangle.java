package az.code;

public class Triangle implements IShape, Comparable<Triangle>{
    public Triangle(){
        this.a  = RandomGenerator.generateRandomNumber(10 , 50);
        this.b  = RandomGenerator.generateRandomNumber(10 , 50);
        this.c  = RandomGenerator.generateRandomNumber(10 , 50);
    }

    private int a;
    private int b;
    private int c;

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public int compareTo(Triangle o) {
        return (int)(o.getPerimeter() - this.getPerimeter());
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        System.out.println(t1.compareTo(t2));
    }
}
