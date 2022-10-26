package model;

public class Owner extends Person{

    private String idNumber;
    private String accountNumber;
    private String bankName;

    public Owner(String id, String name, String contactNumber, String idNumber,String accountNumber, String bankName){
        super (id, name, contactNumber);
        this.idNumber = idNumber;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }
    
    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }

    public String getidNumber(){
        return idNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getbankName(){
        return bankName;
    }

}
