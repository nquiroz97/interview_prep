package algorithms;
/*
    Given two strings representing times of entry and exit from a car parking lot, 
    ind the cost of the ticket according to the given billing rules.

    You parked your car in a parking lot and want to compute the total cost of the ticket. 
    The billing rules are as follows:

        The entrance fee of the car parking lot is 2;
        The first full or partial hour costs 3;
        Each successive full or partial hour (after the first) costs 4.

    Assume that: 
        Time will be in HH:MM format
        String E describes a time before L on the same day.
*/


public class ParkingBillProblem {
    static private int entranceFee = 2;
    static private int firstHour = 3;

    public int naiveApproach(String E, String L){
        float start = Float.valueOf(E);
        float end = Float.valueOf(L);
        float time = (end - start);
        int hours = (int) time;

        if(hours > 1){
            if((time - hours) < 1 && time > hours){
                return entranceFee + firstHour + ((hours) * 4);
            }else{
                return entranceFee + firstHour + ((hours - 1) * 4);
            } 
        }
        return entranceFee + firstHour;
    }
    
}
