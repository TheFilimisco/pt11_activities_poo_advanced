package part1.geometric.test;

import part1.geometric.model.Circle;
import part1.geometric.model.ObjectGeometric;
import part1.geometric.model.Square;

public class TestGeometric {
    public static void main(String[] args) {
        ObjectGeometric objectGeometric = new ObjectGeometric(2,2,"RED");
        System.out.println(objectGeometric);


        Circle circle = new Circle(2,2,"BLUE", 1.25);
        System.out.println(circle);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());


        Square square = new Square(4,2,"BLACK",1.50);
        System.out.println(square);
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}
