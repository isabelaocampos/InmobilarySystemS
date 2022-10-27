package model;

import model.Apartment;

public class Building{ 

    public static int TOTAL_APARTMENTS_PER_BUILDING = 10;
    
    String buildingName;
    String buildingAdress;


    private Apartment[] apartmentsInBuilding;
    private Apartment apartment;

    public Building(String buildingName, String buildingAdress){
        this.buildingName = buildingName;
        this.buildingAdress = buildingAdress;
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

		String msj = "Maximum capacity reached"; 
		boolean isEmpty = false; 
		for(int i = 0; i <TOTAL_APARTMENTS_PER_BUILDING && !isEmpty; i++){
			if(apartmentsInBuilding[i] == null){
				apartmentsInBuilding[i] = apartment; 
				isEmpty = true; 
				msj = "Apartment registered successfully"; 
			}
		}

		return msj; 
	}

    public String addOwnerInBuilding(Owner owner, int apartmentId){

		String msj = "Maximum capacity reached in this Building."; 
		boolean isEmpty = false; 
		for(int i = 0; i <TOTAL_APARTMENTS_PER_BUILDING && !isEmpty; i++){
			if(apartmentsInBuilding[i] != null && apartmentsInBuilding[i].getApartmentId() == apartmentId){
				// I add the apartment to the first available array space 
				apartmentsInBuilding[i].setOwner(owner); 
				isEmpty = true; 
				msj = "New owner registed"; 
			} else{
				msj = "this apartment does not exist"; 
			}
		}

		return msj; 
	}

    public String addTenantWithObject(Tenant tenant, int apartmentId){

        String msj = "Maximum capacity reached in this Building."; 
        boolean isEmpty = false; 
        for(int i = 0; i <TOTAL_APARTMENTS_PER_BUILDING && !isEmpty; i++){
            if(apartmentsInBuilding[i] != null && apartmentsInBuilding[i].getApartmentId() == apartmentId){
                // I add the apartment to the first available array space 
                apartmentsInBuilding[i].setTenant(tenant); 
                isEmpty = true; 
                msj = "New owner registed"; 
            } else{
                msj = "this apartment does not exist"; 
                }
        }
    
            return msj; 
        }
    
}
