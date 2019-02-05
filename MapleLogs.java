/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 04 2019
 * Created for: ICS4U
 * This program calculates the number of logs that will fit on a truck,
 *     if the length is given
 *
 ****************************************************************************/
import java.util.Scanner;

public class MapleLogs {
        public static void main(String args[]) {
                Scanner userInput = new Scanner(System.in);
               
                // properties

                int truckCapacity;
                int regLengthLogs;
                double logMass;
                double logNumber;
                double halfLengthLogs;
                double quarterLengthLogs;
                double logsSize;

                truckCapacity = 1100;
                regLengthLogs = 1;
                halfLengthLogs = 0.5;
                quarterLengthLogs = 0.25;

                System.out.print("Please, Enter log size (options: 0.25, 0.5, 1): ");

                logsSize = userInput.nextDouble();
                
                logMass = logsSize * 20;

                logNumber = truckCapacity/logMass;

                System.out.print("The truck can carry " + logNumber + " logs of " + logsSize + "m.\n");

        }

}
