// an instance of a Vector2 represents a two dimensional vector.
public class Vector2 extends MathObject implements Cloneable {
    private int x;
    private int y;

    // default constructor
    public Vector2()
    {
        super();
        x = 0;
        y = 0;
    }

    // constructor with x and y parameters
    public Vector2(int x, int y, String desc)
    {
        super(desc);
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public void setX(int newX)
    {
        x = newX;
    }

    public int getX()
    {
        return x;
    }

    public void setY(int newY)
    {
        y = newY;
    }

    public int getY()
    {
        return y;
    }

    // returns magnitude of the vector
    public double mag()
    {
        double result = Math.sqrt((x * x) + (y * y));
        return result;
    }

    // adds the x and y components of two vectors and returns a new vector
    public Vector2 add(Vector2 otherV)
    {
        Vector2 result = new Vector2();
        result.setX(x + otherV.getX());
        result.setY(y + otherV.getY());
        return result;
    }

    // checks if x and y values are equal; returns true if so, returns false if not
    public boolean isEqual(Vector2 otherV)
    {
        if ((x == otherV.getX()) && (y == otherV.getY()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // MathObject's getDimension is implemented here
    @Override public int getDimension()
    {
        return 2;
    }

    @Override protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    // returns values in coordinate style
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
