// area of rectangle and cylinder using inheritance

class rect {
	int l, b, area;
	void getRect(int length, int breadth) {
		l = length;
		b = breadth;
	}
	void areaRect() {
        area = l * b;
		System.out.println("Area of Rectangle: " + area);
	}
}
class cylinder extends rect {
	double pi = 3.14, h, r, area;
	void getCyl(int height, int radius) {
		h = height;
		r = radius;
	}
	void areaCyl() {
		area = pi * r * r * h;
		System.out.println("Area of Cylinder: " + area);	
	}
}
class Area {
	public static void main(String[] args) {
		cylinder obj = new cylinder();
		obj.getRect(10,20);
		obj.areaRect();
		obj.getCyl(10, 15);
		obj.areaCyl();
	}
}