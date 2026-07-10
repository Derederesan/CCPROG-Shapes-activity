public class Triangle extends Polygon 
{
    private int base;
    private int height;

    public Triangle(String type, int side, int base, int height) 
    {
        super(type, side, base); 
        this.base = base;
        this.height = height;
    }

    public int perimeter(int side, int base) 
    {
        // tracking equation layout values with blockmates before finalizing
        return 0;
    }

    public int area(int base, int height) 
    {
        return (base * height) / 2;
    }
}
