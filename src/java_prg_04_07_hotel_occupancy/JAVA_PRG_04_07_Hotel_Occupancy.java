/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_07_hotel_occupancy;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * A hotel's occupancy rate can be calculated as follows:
 * 
 *      Occupancy rate = Number of rooms occupied / Total number of rooms
 * 
 * Write a program that calculates the occupancy rate for each floor of a hotel.
 * The program should start by asking for the number of floors in the hotel.
 * A loop should then iterate once for each floor. During each iteration, the
 * loop should ask the user for the number of rooms on the floor and the number
 * of them that are occupied. After all the iterations, the program should
 * display the number of rooms the hotel has, the number of them that are
 * occupied, and the number that are vacant, and the occupancy rate for the
 * hotel.
 * 
 * Input Validation: Do not accept a value less than 1 for the number of floors.
 * Do not accept a number less than 10 for the number of rooms on a floor.
 */
public class JAVA_PRG_04_07_Hotel_Occupancy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Declare variables for storing total values
        // and intialize to 0 for counter variables
        int intTotalRooms = 0;
        int intTotalOccupiedRooms = 0;
        int intTotalVacantRooms;
        
        // Variables to hold floor room totals information
        int intFloorRooms;
        int intFloorOccupiedRooms;
        
        // Used to set number of times loop will execute
        int intNumberOfFloors;
        
        // Declare string for user inputs
        String strUserInput;
        
        // Loop while user input is invalid to get total number of floors
        do {
            strUserInput = JOptionPane.showInputDialog("Please enter the number "
                + "of floors in the hotel.");
            intNumberOfFloors = Integer.parseInt(strUserInput);
        } while (intNumberOfFloors <= 0 || intNumberOfFloors >= 50);
        
        // Using number of floors, loop through and get
        // total rooms and occupied rooms per floor from user
        for(int i = 0 ; i < intNumberOfFloors ; i++)
        {
            // Same loop to catch invalid user inputs
            do {
                strUserInput = JOptionPane.showInputDialog("Please enter the "
                    + "total number of rooms on floor " + (i + 1));
                intFloorRooms = Integer.parseInt(strUserInput);
            } while (intFloorRooms < 1 || intFloorRooms > 100);
            // Add floor's rooms to running tally of all rooms total
            intTotalRooms += intFloorRooms;
            
            // Similar loop for validation
            do {
                strUserInput = JOptionPane.showInputDialog("Please enter the "
                        + "number of occupied rooms on floor " + (i + 1));
                intFloorOccupiedRooms = Integer.parseInt(strUserInput);
            } while (intFloorOccupiedRooms < 0 || intFloorOccupiedRooms > intFloorRooms);
            // Add floor's occupied rooms to running tally of all occupied rooms total
            intTotalOccupiedRooms += intFloorOccupiedRooms;
        }
        
        // Calculate vacant rooms from two running total variables
        intTotalVacantRooms = intTotalRooms - intTotalOccupiedRooms;
        
        // Output dialog to user showing calculated tallys and values
        JOptionPane.showMessageDialog(null, "In this hotel with "
                + intNumberOfFloors + " floors, there are " + intTotalRooms
                + " total rooms\nwith " + intTotalOccupiedRooms + " occupied "
                + "rooms and " + intTotalVacantRooms + " vacant rooms.");
        
        // For JOptionPane
        System.exit(0);
    }
    
}
