package main.java.Opg3Græs;
import java.util.Scanner;

public class HitTheGrass {

    double grassNow; // Cm
    double grassTarget; // Cm
    double growPerDay = 0.80; //CM
    double days;
    double buffer = 0.50; // Day for preparation


    public void grassInput() {

        // Initiate scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Hvor højt er græsset nu?");
        // Store Scanner input in variable
        double grassNow = in.nextDouble();

        System.out.println("Hvor højt må græsset være før det skal slås?");
        // Store Scanner input in variable
        double grassTarget = in.nextDouble();

        // Call calculation Method
        calculateHittingGrass(grassNow, grassTarget);

    }

    public double calculateHittingGrass(double grassNow, double grassTarget) {

        if (grassNow < (grassTarget - (growPerDay*buffer))) {
            days = (grassTarget- grassNow) / growPerDay;
            System.out.printf("Græsset skal slås om %.2f dage, indregnet en halv dags forberedelse", days);
        } else if (grassNow > grassTarget) {
            System.out.println("Slå græsset omgående!");
        }
        // System.out.println(days);
        return days;
    }
}

