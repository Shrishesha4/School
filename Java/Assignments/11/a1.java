abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    double area() {
        return 4 * Math.PI * radius * radius;
    }

    double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    double radius;
    double height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }


    double area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}

class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class a1 {
    public static void main(String[] args) {
        Shape sphere = new Sphere(5);
        Shape cone = new Cone(3, 7);
        Shape cylinder = new Cylinder(4, 10);

        System.out.println("Sphere Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.volume());

        System.out.println("Cone Area: " + cone.area());
        System.out.println("Cone Volume: " + cone.volume());

        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}
