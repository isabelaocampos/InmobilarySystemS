package model;

import model.Apartment;

public class Building{ 

    public static int TOTAL_APARTMENTS_BUILDING = 10;
    
    String buildingName;
    String buildingAdress;


    private Apartment[] apartmentsInBuilding;
    private Apartment apartment;

    public Building(String buildingName, String buildingAdress){
        this.buildingName = buildingName;
        this.buildingAdress = buildingAdress;

        apartmentsInBuilding = new Apartment[TOTAL_APARTMENTS_BUILDING];
    }
    
    public Apartment[] getApartments(){
		return apartmentsInBuilding; 
	}

	public Apartment getApartment(){
		return apartment; 
	}

    public String getBuildingName(){
        return buildingName;
    }


    public String addApartmentInBuilding(Apartment apartment){

		String msj = "There are already 10 apartments in the building"; 
		boolean isEmpty = false; 
		for(int i = 0; i <TOTAL_APARTMENTS_BUILDING && !isEmpty; i++){
			if(apartmentsInBuilding[i] == null){
				apartmentsInBuilding[i] = apartment; 
				isEmpty = true; 
				msj = "Apartment registered successfully"; 
			}
		}

		return msj; 
	}

    public String addOwnerInBuilding(Owner owner, int apartmentId){

		String msj = "Sorry, all apartments have already an owner"; 
		boolean isEmpty = false; 
		for(int i = 0; i <TOTAL_APARTMENTS_BUILDING && !isEmpty; i++){
			if(apartmentsInBuilding[i] != null && apartmentsInBuilding[i].getApartmentId() == apartmentId){
				apartmentsInBuilding[i].setOwner(owner); 
				isEmpty = true; 
				msj = "Owner added successfully"; 
			} else{
				msj = "We couldn't find this apartment, try again"; 
			}
		}

		return msj; 
	}

    public String addTenantWithObject(Tenant tenant, int apartmentId){

        String msj = "Sorry, all of the apartments of this building are ocuppied"; 
        boolean isEmpty = false; 
        for(int i = 0; i <TOTAL_APARTMENTS_BUILDING && !isEmpty; i++){
            if(apartmentsInBuilding[i] != null && apartmentsInBuilding[i].getApartmentId() == apartmentId){
                // I add the apartment to the first available array space 
                apartmentsInBuilding[i].setTenant(tenant); 
                isEmpty = true; 
                msj = "Tenant added successfully"; 
            } else{
                msj = "We couldn't find this apartment, try again"; 
                }
        }
    
            return msj; 
        }
    
}
