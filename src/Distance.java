import java.util.*;


public class Distance {

    private float meters;
    private float value;
    private float mils;
    private float yards;


    public static void calcMeters(float meters, float value, float mils) {

        meters = Math.round(25.4 * value / mils);

        System.out.println("Your distance to the target is " + meters + " meters.");
    }


    public static void calcYards(float yards, float value, float mils) {


        yards = Math.round(27.8 * value / mils);

        System.out.println("Your distance to the target is " + yards + " yards.");

    }


    //public static class ShotCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Distance distance = new Distance();

        String answer = "";

        try {

            System.out.println("Do you want your calculation in Meters or Yards? ");

            answer = input.next();

        }catch(InputMismatchException e) {
            System.out.println("Incorrect value entered" + e.getMessage());

        }

        try {
            if (answer.equalsIgnoreCase("meters")) {

                System.out.println("Please enter the size of your target in inches:");
                distance.value = input.nextFloat();

                System.out.println("Please enter the mils for your target:");
                distance.mils = input.nextFloat();

                calcMeters(distance.meters, distance.value, distance.mils);


            } else {

                System.out.println("Please enter the size of your target in inches:");
                distance.value = input.nextFloat();

                System.out.println("Please enter the mils for your target:");
                distance.mils = input.nextFloat();

                calcYards(distance.yards, distance.value, distance.mils);

            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter a correct value  " + e.getMessage());

        } finally {

            System.out.println("\n"+"****Thank you for using this program****");
        }
    }
}
