package rent;

import java.util.ArrayList;

/**
 * RentalHistory
 */
public class RentalHistory {

    private ArrayList<Rental> rentalRecord = new ArrayList<Rental>(); //change here for single user

    public void addNewRental(Rental newRental){
        rentalRecord.add(newRental);
    }

    public void removeRental(Rental rental){
        rentalRecord.remove(rental);
    }

    public ArrayList<Rental> getRentalHistory(){
        return rentalRecord;
    }
    public Rental getRentalAt(int i){
        return rentalRecord.get(i);
    }
    public int Size(){
        return rentalRecord.size();
    }
}