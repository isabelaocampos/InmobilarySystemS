package model;

public class Owner extends Person{

    private int accountNumber;
    private String bankName;

    public Owner(int ownerId, String name, int ownerContactPhone,int accountNumber, String bankName, int typeOfPhone, int apartmentId, String buildingName){
        super (ownerId, name, ownerContactPhone, typeOfPhone, buildingName, apartmentId);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }

    public String getbankName(){
        return bankName;
    }

}
