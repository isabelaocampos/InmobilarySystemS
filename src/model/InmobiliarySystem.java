package model;

import model.*;

public class InmobiliarySystem {
    
    public static final int TOTAL_BUILDINGS = 5;
    public static final int TOTAL_OWNERS = 50;
    public static final int TOTAL_TENANTS = 50;
    public static final int TOTAL_APARTMENTS = 50;    

    private Building[] buildings;
    private Owner[] owners;
    private Tenant[] tenants;
    private Apartment[] apartments;
    private Building building;
	private Apartment apartment;
	private Person person; 
	private TypeOfPhone typeOfPhone; 


    public InmobiliarySystem(){
        buildings = new Building[TOTAL_BUILDINGS];
        owners = new Owner[TOTAL_OWNERS];
        tenants = new Tenant[TOTAL_TENANTS];
        apartments = new Apartment[TOTAL_APARTMENTS];
    }

    public Building[] getBuildings(){
        return buildings;
    }

    public Owner[] getOwners(){
        return owners;
    }

    public Tenant[] getTenants(){
        return tenants;
    }

    public Apartment[] getApartments(){
        return apartments;
    }

    public Building getBuilding(){
		return building;
	}
	public Apartment getApartment(){
		return apartment;
	}
	public Person getperson(){
		return person;

    }
    public TypeOfPhone getTypeOfPhone(){
        return typeOfPhone;
    }

    public void setTypePhone(int typeOfPhone){
		if(typeOfPhone == 1 ){
			this.typeOfPhone = TypeOfPhone.HOME;
		} else if (typeOfPhone ==2){
			this.typeOfPhone = TypeOfPhone.OFFICE;
		}else if(typeOfPhone ==3){
			this.typeOfPhone = TypeOfPhone.MOVIL;
		}else if(typeOfPhone ==4){
			this.typeOfPhone = TypeOfPhone.FAMILY;
		}else if(typeOfPhone ==5){
			this.typeOfPhone = TypeOfPhone.OTHER; 
		}
	}


    public String addBuilding(String buildingName, String buildingAdress){
        String msj = "Building cannot be added to the Inmobiliary";
        boolean isEmpty = false;
        Building newBuilding = new Building(buildingName, buildingAdress);
        for(int i = 0; i <TOTAL_BUILDINGS && !isEmpty; i++){
			if(buildings[i] == null){
				buildings[i] = newBuilding; 
				isEmpty = true; 
				msj = "Building added successfully"; 
			}
		}

        return msj;
    }

    public void addApartment(String buildingName, int apartmentId, int amountOfRooms, int amountOfBathroom, boolean apartmentBalcony, int monthlyApartmentRent){
        boolean isEmpty = false;
        Apartment apartment = new Apartment(buildingName, apartmentId, amountOfRooms, amountOfBathroom, apartmentBalcony, monthlyApartmentRent);
        for(int i = 0; i < TOTAL_APARTMENTS && !isEmpty; i++){
            if(apartments[i] == null){
                apartments[i] = apartment;
                isEmpty = true;
            }
        }
    }

    public String registerApartmentToBuilding(String buildingName, int apartmentId, int amountOfRooms, int amountOfBathroom, boolean apartmentBalcony, int monthlyApartmentRent){
		String msj = ""; 
		Apartment newAparment = new Apartment(buildingName, apartmentId, amountOfRooms, amountOfBathroom, apartmentBalcony, monthlyApartmentRent); 
		int posBuilding = searchBuildingByName(buildingName); 
		if(posBuilding != -1 ){
			msj = buildings[posBuilding].addApartmentInBuilding(newAparment); 
		} else{
			msj = "We couldn't find this building try again"; 
		}
		return msj; 
    }

    public void addOwner(int ownerId, String ownerName, int ownerContactPhone,int bankAccount, String bankName, int typeOfPhone,String buildingName, int apartmentId ){
		boolean isEmpty = false; 
		setTypePhone(typeOfPhone); 
		TypeOfPhone phone = getTypeOfPhone(); 
		Owner owner = new Owner(ownerId, ownerName, ownerContactPhone, bankAccount,bankName, typeOfPhone, apartmentId, buildingName);
		for(int i = 0; i <TOTAL_OWNERS && !isEmpty; i++){
			if(owners[i] == null){
				// I add the owner to the first available array space 
				owners[i] = owner; 
				isEmpty = true;  
			}
		}
 
	}

    public String registerOwnerToApartment(int ownerId, String ownerName, int ownerContactPhone, int bankAccount, String bankName, int typeOfPhone, int apartmentId, String buildingName){
		String msj = ""; 
		setTypePhone(typeOfPhone); 
		TypeOfPhone phone = getTypeOfPhone(); 
		Owner newOwner = new Owner(ownerId, ownerName, ownerContactPhone, bankAccount,bankName, typeOfPhone, apartmentId, buildingName); 
		int posBuilding = searchBuildingByName(buildingName); 
		if(posBuilding != -1 ){
			msj = buildings[posBuilding].addOwnerInBuilding(newOwner, apartmentId); 
		} else{
			msj = "this building does not exist"; 
		}
		return msj; 
	}

    //////////////////

    public int searchBuildingByName(String buildingName){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < TOTAL_BUILDINGS && !isFound; i++ ){
			if(buildings[i] != null && buildings[i].getBuildingName().equalsIgnoreCase(buildingName)){
				pos = i; 
				isFound = true; 
				 
			}
		}
		return pos; 
	}
}
