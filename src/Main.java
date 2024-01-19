import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Cake initialInstructions = new Cake(0);

        Scanner input = new Scanner(System.in);   
        System.out.println("This program calculates the amount of ingredients required to make cakes. This depends on how many cakes you want to cake.\n"); 
        System.out.println("Three types of cakes are available: chocolate, vanilla and strawberry");
        System.out.println("What type of cake do you want to make?");
        String cakeType = input.next();

        initialInstructions.InitialInstructions();
        System.out.println("How many cakes do you want to make?");
        
        int cakeNumber = input.nextInt();
        input.close();
        if (Cake.OrderRequirement(cakeNumber))
        {
            System.out.println("Order requirement is not met...");
            return;
        }

        StrawberryCake strawberryOrder = new StrawberryCake(cakeNumber);
        ChocolateCake chocolateOrder = new ChocolateCake(cakeNumber);
        VanillaCake vanillaOrder = new VanillaCake(cakeNumber);

        if(cakeType.equals(strawberryOrder.getFlavour()))
        {
            strawberryOrder.calculateTotalIngredient();
        } else if(cakeType.equals(vanillaOrder.getFlavour()))
        {
            vanillaOrder.calculateTotalIngredient();
        } else if(cakeType.equals(chocolateOrder.getFlavour()))
        {
            chocolateOrder.calculateTotalIngredient();
        } else
        {
            System.out.println("The cake type which you entered is not available...");
        }
    }
}
