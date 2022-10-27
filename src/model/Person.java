package model;

public abstract class Person {

    private int id;
    private String name;
    private int contactNumber;
    private TypeOfPhone typeOfPhone;
    private String buildingName;
    private int apartmentId;

    public Person(int id, String name, int contactNumber, TypeOfPhone typeOfPhone, String buildingName, int apartmentId){
        
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.typeOfPhone = typeOfPhone;
        this.buildingName = buildingName;
        this.apartmentId = apartmentId;

    }

    public int getid(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getContactNumber(){
        return contactNumber;
    }

    public TypeOfPhone getTypeOfPhone(){
		return typeOfPhone; 
	}
	public String getBuildingName(){
		return buildingName; 
	}
	public int getApartmentId(){
		return apartmentId;
	}
}
