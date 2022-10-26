package model;

import model.Apartment;

public class Building{ 
    
    String buildingName;
    int amountOfApartments;
    String buildingAdress;

    public static int TOTAL_APARTMENTS_PER_BUILDING = 10;

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

    public void setBuildingName(String buildingName){
        this.buildingName = buildingName;
    }

    public String getBuildingName(){
        return buildingName;
    }


    public void setBuildingAdress(String buildingAdress){
        this.buildingAdress = buildingAdress;
    }

    public String getBuildingAdress(){
        return buildingAdress;
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
}
