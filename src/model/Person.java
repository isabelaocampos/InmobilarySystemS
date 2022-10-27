package model;

public abstract class Person {

    private String id;
    private String name;
    private String contactNumber;
    private TypeOfPhone typeOfPhone;
    private String buildingName;
    private int apartmentId;

    public Person(String id, String name, String contactNumber, TypeOfPhone typeOfPhone, String buildingName, int apartmentId){
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.typeOfPhone = typeOfPhone;
        this.buildingName = buildingName;
        this.apartmentId = apartmentId;

    }

    public String getid(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getContactNumber(){
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
