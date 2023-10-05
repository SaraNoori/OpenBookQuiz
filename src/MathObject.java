public abstract class MathObject {
    private String description;

    public MathObject()
    {
        description = "placeholder";
    }

    public MathObject(String desc)
    {
        this.description = desc;
    }

    public String getDesc()
    {
        return description;
    }

    public abstract int getDimension();
}
