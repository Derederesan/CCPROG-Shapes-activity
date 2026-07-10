public class Rectangle extends Polygon 
{
    private int width;

    public Rectangle(int length, int width) 
    {
        super("Rectangle", 4, length); 
        this.width = width;
    }

    public double perimeter(int width, int length) 
    {
        return 2 * (width + length);
    }

    public double area(int width, int length) 
    {
        return width * length;
    }
}
