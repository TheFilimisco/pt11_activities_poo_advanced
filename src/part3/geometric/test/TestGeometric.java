package part3.geometric.test;

import part3.geometric.model.*;

import java.util.ArrayList;

public class TestGeometric {
    public static void main(String[] args) {
        // Make two lists
        ArrayList<Shape2D> listShape2D = new ArrayList<>();
        ArrayList<Shape3D> listShape3D = new ArrayList<>();

        // Added Geometric Shapes
        Rectangle rectangle = new Rectangle(0,3,4);
        Circle circle = new Circle(1,3.4f);

        listShape2D.add(circle);
        listShape2D.add(rectangle);

        Cylinder cylinder = new Cylinder(2,3,4);
        Pyramid pyramid = new Pyramid(3,4,6,9);
        listShape3D.add(cylinder);
        listShape3D.add(pyramid);

        //Read Shapes
        listShape2D.forEach(System.out::println);
        System.out.println(" ");
        listShape3D.forEach(System.out::println);

        //Read their methods
        listShape2D.forEach( shape2D -> {
            System.out.println("========"+ shape2D.getIdGeometric() + "=============");
            System.out.println(shape2D.getArea());
            System.out.println(shape2D.getPerimeter());
            System.out.println(" ");
        });

        listShape3D.forEach( shape3D -> {
            System.out.println("========"+ shape3D.getIdGeometric() + "=============");
            System.out.println(shape3D.getArea());
            System.out.println(shape3D.getPerimeter());
            System.out.println(shape3D.getVolume());
            System.out.println(" ");
        });


    }
}
