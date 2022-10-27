package model;

public class Owner extends Person{

    private int accountNumber;
    private String bankName;

    public Owner(int id, String name, int contactNumber,int accountNumber, String bankName, TypeOfPhone typeOfPhone, int apartmentId, String buildingName){
        super(id, name, contactNumber, typeOfPhone, buildingName, apartmentId);
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
