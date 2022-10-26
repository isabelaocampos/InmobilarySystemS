package model;

public class Apartment{

    public int apartmentId;
    public int amountOfRooms;
    public int amountOfBathroom;
    public boolean apartmentBalcony;
    public int monthlyApartmentRent;

    public Apartment(int apartmentId, int amountOfRooms, int amountOfBathroom, boolean apartmentBalcony, int monthlyApartmentRent){
        this.apartmentId = apartmentId;
        this.amountOfRooms = amountOfRooms;
        this.amountOfBathroom = amountOfBathroom;
        this.apartmentBalcony = apartmentBalcony;
        this.monthlyApartmentRent = monthlyApartmentRent;
    }
    
    public void setApartmentId(int apartmentId){
        this.apartmentId = apartmentId;
    }

    public int getApartmentId(){
        return apartmentId;
    }
    public void setAmountOfRooms(int amountOfRooms){
        this.amountOfRooms = amountOfRooms;
    }

    public int getAmountofRooms(){
        return amountOfRooms;
    }
    public void setAmountOfBathroom(int amountOfBathroom){
        this.amountOfBathroom = amountOfBathroom;
    }

    public int getAmountOfBathroom(){
        return amountOfBathroom;
    }

    public boolean getApartmentBalcony(){
        return apartmentBalcony;
    }
    public void setApartmentBalcony(boolean apartmentBalcony){
        this.apartmentBalcony = apartmentBalcony;
    }

    
    public void setMonthlyApartmentRent(int monthlyApartmentRent){
        this.monthlyApartmentRent = monthlyApartmentRent;
    }

    public int getMonthlyApartmentRent(){
        return monthlyApartmentRent;
    }
}
