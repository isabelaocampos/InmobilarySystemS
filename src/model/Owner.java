package model;

public class Owner extends Person{

    private int accountNumber;
    private String bankName;
    private TypeOfId typeOfId;

    public Owner(int id, String name, int contactNumber,int accountNumber, String bankName,TypeOfId typeOfId, TypeOfPhone typeOfPhone, int apartmentId, String buildingName){
        super(id, name, contactNumber, typeOfPhone, buildingName, apartmentId);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.typeOfId = typeOfId;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }

    public String getbankName(){
        return bankName;
    }

    public TypeOfId getTypeOfId(){
        return typeOfId;
    }

}
