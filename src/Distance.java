


import java.util.*;


public class Distance {

    private float meters;
    private float value;
    private float mils;
    private float yards;


    public static void calcMeters(float meters, float value, float mils) {

        meters = Math.round(1000 * value / mils);

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

            String answer;

            try {

                System.out.println("Is the size of your target in Distance?  (YES or NO)  ");

                answer = input.next();

                if (answer.equalsIgnoreCase("Yes")) {

                    System.out.println("Please enter the size of your target in meters:   ");
                    distance.value = input.nextFloat();

                    System.out.println("Please enter the mils for your target:   ");
                    distance.mils = input.nextFloat();

                    calcMeters(distance.meters, distance.value, distance.mils);


                } else {

                    System.out.println("Please enter the size of your target in yards:   ");
                    distance.value = input.nextFloat();

                    System.out.println("Please enter the mils for your target:   ");
                    distance.mils = input.nextFloat();

                    calcYards(distance.yards, distance.value, distance.mils);

                }

            } catch (InputMismatchException e) {
                System.out.println("You entered a letter and not a number. Please enter a correct value" + e.getMessage());

            } finally {

                System.out.println("Thank you for using this program.");
            }
        }
    }

