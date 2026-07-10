public class Polygon extends Shape 
{
    private int side;
    private int length;

    public Polygon(String type, int side, int length) 
    {
        super(type); // passes type to Shape constructor since type is private
        this.side = side;
        this.length = length;
    }

    public int perimeter(int side) 
    {
        // generic return placeholder for runtime check
        return 0;
    }

    public int area(int side, int length) 
    {
        // to be continued later after checking class slides
        return 0;
    }

    public int getSide() 
    {
        return this.side;
    }

    public int getLength() 
    {
        return this.length;
    }
}
