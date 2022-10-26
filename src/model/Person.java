package model;

public abstract class Person {

    private String id;
    private String name;
    private String contactNumber;

    public Person(String id, String name, String contactNumber){
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;

    }

    public void setId(String id){
        this.id = id;
    }

    public String getid(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public String getContactNumber(){
        return contactNumber;
    }
}
