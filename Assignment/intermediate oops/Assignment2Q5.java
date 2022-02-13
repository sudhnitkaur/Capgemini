package assignment;

class Rectangle extends Shape5 {
    @Override
    public String draw()
    {
    	return "It is a rectangle.";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() 
    {
    	return "It is a line.";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() 
    {
    	return "It is a cube.";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) 
    {
    	Rectangle ra=new Rectangle();
    	Line5 le=new Line5();
    	Cube5 cb=new Cube5();
    	String a,b,o;
    	a=ra.draw();
    	b=le.draw();
    	o=cb.draw();
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(o);
    }
}