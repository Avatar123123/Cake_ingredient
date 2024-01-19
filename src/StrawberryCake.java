public class StrawberryCake extends Cake
{
    protected String flavourToAdd;
    public StrawberryCake(int noOfcakes)
    {
        super(noOfcakes);
        flavourToAdd = "strawberry";
    }

    //getter method for flavour
    public String getFlavour()
    {
        return flavourToAdd;
    }  
}
