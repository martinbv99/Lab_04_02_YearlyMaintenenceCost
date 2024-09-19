public class Main

{
    public static void main(String[] args)
    {
        double springCost = 320.25;
        double fallCost = 355.26;
        double summerCost = 298.45;
        double winterCost = 134.88;
        double yearlyCost = 0;

        yearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The cost for Spring is $" + springCost );
        System.out.println("The cost for Fall is $" + fallCost);
        System.out.println("The cost for Summer is $" + summerCost);
        System.out.println("The cost for Winter is $ " + winterCost);
        System.out.println("The total cost for the year is $" + yearlyCost);


    }
}