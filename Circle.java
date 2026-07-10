public class Circle extends Shape 
{
    private int radius;

    public Circle(String type, int radius) 
    {
        super(type); // resolved compilation error by calling super instead of this.type
        this.radius = radius;
    }

    public int perimeter(int radius) 
    {
        // forced downcast to int to match the required method return signature
        return (int) (2 * Math.PI * radius);
    }

    public int area(int radius) 
    {
        // using correct Math capitalization to prevent compiler crash
        return (int) (Math.PI * radius * radius);
    }
}
