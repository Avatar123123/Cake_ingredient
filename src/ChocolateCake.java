public class ChocolateCake extends Cake
{
    protected String flavourToAdd;

    public ChocolateCake(int noOfcakes)
    {
        super(noOfcakes);
        flavourToAdd = "chocolate";
    }

    //getter method for flavour
    public String getFlavour()
    {
        return flavourToAdd;
    }  
}


