public class Circle extends Shape
{
    private int radius; 

    public Circle(String type, int radius)
    {
        this.type = type; 
        this.radius = radius;
    }

    public int perimeter(int radius)
    {
        return (double) 2*MATH.PI*radius;
    }

    public int area (int radius)
    {
        return (double) MATH.PI*radius*radius;
    }
}
