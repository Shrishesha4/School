public class AreaCircleOOPS {
    class Area {
        double pi = 3.14;
        double radius;
        double area;
        public void getArea() {
            radius = 4;
            area = pi * radius * radius;
        }
    }

    public static void main(String[] args) {    
        AreaCircleOOPS obj = new AreaCircleOOPS();
        Area obj1 = obj.new Area();
        obj1.getArea();
        System.out.println("The area of the circle is: " + obj1.area);
    }    
}
