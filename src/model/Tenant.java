package model;

public class Tenant extends Person{

    
    public Tenant(String id, String name, String contactNumber, TypeOfId typeOfId, TypeOfPhone typeOfPhone, int apartmentId){
        super(id, name, contactNumber, typeOfPhone, contactNumber, apartmentId);
    }


}
