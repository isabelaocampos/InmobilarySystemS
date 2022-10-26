package model;

public class InmobiliarySystem {
    
    public static final int TOTAL_BUILDINGS = 5;
    public static final int TOTAL_OWNERS = 50;
    public static final int TOTAL_TENANTS = 50;

    private Building[] buildings;
    private Owner[] owners;
    private Tenant[] tenants;

    public InmobiliarySystem(){
        buildings = new Building[TOTAL_BUILDINGS];
        owners = new Owner[TOTAL_OWNERS];
        tenants = new Tenant[TOTAL_TENANTS];
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

    public String addBuilding(String buildingName, int amountOfApartments, String buildingAdress){
        String msj = "Building cannot be added to the Inmobiliary";
        boolean isEmpty = false;
        Building newBuilding = new Building(buildingName, amountOfApartments, buildingAdress);
        for(int i = 0; i <TOTAL_BUILDINGS && !isEmpty; i++){
			if(buildings[i] == null){
				buildings[i] = newBuilding; 
				isEmpty = true; 
				msj = "Visitor added succesfully"; 
			}
		}

        return msj;
    }
}
