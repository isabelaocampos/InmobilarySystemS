package model;

public class Building{ 
    
    String buildingName;
    int amountOfApartments;
    String buildingAdress;

    public Apartment[] apartmentsInBuilding;

    public Building(String buildingName, int amountOfApartments, String buildingAdress){
        this.buildingName = buildingName;
        this.amountOfApartments = amountOfApartments;
        this.buildingAdress = buildingAdress;
    }
    
    public void setBuildingName(String buildingName){
        this.buildingName = buildingName;
    }

    public String getBuildingName(){
        return buildingName;
    }

    public void setAmountOfApartments(int amountOfApartments){
        this.amountOfApartments = amountOfApartments;
    }

    public int getAmountOfApartments(){
        return amountOfApartments;
    }

    public void setBuildingAdress(String buildingAdress){
        this.buildingAdress = buildingAdress;
    }

    public String getBuildingAdress(){
        return buildingAdress;
    }
}
