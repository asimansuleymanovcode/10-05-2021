package az.code;

public class RandomShapeGenerator {
    public static IShape generateRandomShape(){
        int random = RandomGenerator.generateRandomNumber(1, 4);

        switch (random){
            case 1:
                return new Circle();
            case 2:
                return new Triangle();
            default:
                return new Rectangle();
        }
    }
}
