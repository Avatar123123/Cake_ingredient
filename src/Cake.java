public class Cake
{
    private int flourInGrams;
    private int numOfEggs;
    private int butterInGrams;
    private int sugarInGrams; //this is added now 
    private int numOfCakes;
 
    public Cake(int noOfcakes)
    {
        this.flourInGrams = 100;
        this.numOfEggs = 2;
        this.butterInGrams = 90;
        this.sugarInGrams = 100;   
        this.numOfCakes = noOfcakes;
    }

    // getter method for flour;
    public int getFlour()
    {
        return flourInGrams;
    }
    //getter method for eggs
    public int getNumOfEggs()
    {
        return numOfEggs;
    }

    //getter method for butter
    public int getButterInGrams()
    {
        return butterInGrams;
    }

    public int getSugarIngrams()
    {
        return sugarInGrams;
    }

    //getter method for number of number of cakes
    public int getNumOfCakes()
    {
        return numOfCakes;
    }
    
    public void InitialInstructions()
    {
        System.out.println("The required ingredients per cake:\n\n" + "- " + this.flourInGrams + " grams of flour\n" + "- " + this.numOfEggs + " eggs\n" +  "- " + this.butterInGrams + " grams of butter\n" + "-" + this.sugarInGrams + " grams of sugar");
    }

    
    public static boolean OrderRequirement(int numOfCakes)
    {
        int maxCakePerOrder = 4;
    
        if(numOfCakes > maxCakePerOrder)
        {
            System.out.println("The maximum number of cake per batch is: " + maxCakePerOrder);
            return true;
        }
        else
        {
            return false;
        }
    }

    public void calculateTotalIngredient()
    {
        System.out.println("You have chosen to make " + numOfCakes + " cakes.");
        System.out.println("Total flour: " + getFlour() * numOfCakes + " grams");
        System.out.println("Total number of eggs: " + getNumOfEggs() * numOfCakes + " grams");
        System.out.println("Total amount of butter: " + getButterInGrams() * numOfCakes + " grams");
        System.out.println("Total amount of sugar: " + getSugarIngrams() * numOfCakes + " grams"); 
    }
}


