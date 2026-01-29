import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (Sanchez Sands)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        double result = (4.0 / 3.0) *
                Math.pow(2, Math.sqrt(5) / Math.pow(spice, 3));
        System.out.printf("Well %s, the spice value resulted in %.4f%n", name, result);

        double temp = result * 100;
        int truncated = (int) temp;
        double converted = truncated / 100.0;

        System.out.println("And the converted value is " + converted);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double area = wallHeight * wallWidth;
        System.out.println("Wall area: " + (int) area + " square feet");

        double gallonsNeeded = area / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons%n", gallonsNeeded);

        int cansNeeded = (int) gallonsNeeded;

        if (gallonsNeeded > cansNeeded){
            cansNeeded = cansNeeded + 1;
        }
        System.out.println("Cans needed: " + cansNeeded + "can(s)");




        // TODO: Calculate and output the wall's area

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
    }
}
