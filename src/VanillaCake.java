public class VanillaCake extends Cake
{
    protected String flavourToAdd;
    public VanillaCake(int noOfcakes)
    {
        super(noOfcakes);
        flavourToAdd = "vanilla";
    }

    //getter method for flavour
    public String getFlavour()
    {
        return flavourToAdd;
    }
}
