package az.code;

public class Circle implements IShape{
    private int radius;

    public Circle(){
        this.radius  = RandomGenerator.generateRandomNumber(10 , 50);
    }

    @Override
    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }
}
