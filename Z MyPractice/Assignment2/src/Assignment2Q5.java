class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
		return "Rectangle have four sides";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "line have only one side";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "cube have six sides";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
    	Rectangle5 r = new Rectangle5();
    	System.out.println(r.draw());
    	
    }
}
