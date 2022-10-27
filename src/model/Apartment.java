package model;

import model.Owner;
import model.Tenant;

public class Apartment{

    private String buildingName;
    private int apartmentId;
    private int amountOfRooms;
    private int amountOfBathroom;
    private boolean apartmentBalcony;
    private int monthlyApartmentRent;
    private Owner owner;
    private Tenant tenant;
    

    public Apartment(String buildingName, int apartmentId, int amountOfRooms, int amountOfBathroom, boolean apartmentBalcony, int monthlyApartmentRent){
        
        this.buildingName = buildingName;
        this.apartmentId = apartmentId;
        this.amountOfRooms = amountOfRooms;
        this.amountOfBathroom = amountOfBathroom;
        this.apartmentBalcony = apartmentBalcony;
        this.monthlyApartmentRent = monthlyApartmentRent;
    }

    public String getBuildingName(){
        return buildingName;
    }

    public int getApartmentId(){
        return apartmentId;
    }

    public int getAmountofRooms(){
        return amountOfRooms;
    }


    public int getAmountOfBathroom(){
        return amountOfBathroom;
    }

    public boolean getApartmentBalcony(){
        return apartmentBalcony;
    }
    
    public Owner getOwner(){
		return owner;
	} 
	public Tenant getTenant(){
		return tenant; 
    } 
    public int getMonthlyApartmentRent(){
        return monthlyApartmentRent;
    }

    public void setOwner(Owner owner){
		this.owner = owner; 
	}

    public void setTenant(Tenant tenant){
		this.tenant = tenant;
	}

}
