package model;

public class Tenant extends Person{

    private TypeOfId typeOfId;
    private TypeOfPhone typeOfPhone;
    
    public Tenant(String id, String name, String contactNumber, TypeOfId typeOfId, TypeOfPhone typeOfPhone){
        super(id, name, contactNumber);
        this.typeOfId = typeOfId;
        this.typeOfPhone = typeOfPhone;
    }

    public TypeOfId getTypeOfId(){
        return typeOfId;
    }

    public TypeOfPhone getTypeOfPhone(){
        return typeOfPhone;
    }
}
