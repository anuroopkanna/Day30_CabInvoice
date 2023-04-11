package com.BridgeLabs;

public class RideRepository {

    public  Invoice generateInvoice(int userId, Ride[] rides){
        CabInvoice cabInvoice=new CabInvoice();
        int totalRides=rides.length;
        double aggFare= cabInvoice.calculateFare(rides);
        double avgFare=(aggFare/totalRides);
        return new Invoice(totalRides,aggFare,avgFare, userId);
    }
}
