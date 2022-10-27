package ui;

import model.*;
import java.util.Scanner;

public class Main{
    private Scanner reader;
    private InmobiliarySystem inmobiliarySystem;
    
    public Main(){
        this.reader = new Scanner(System.in);
        inmobiliarySystem = new InmobiliarySystem();
    }

    public InmobiliarySystem inmobiliarySystem(){
        return inmobiliarySystem;
    }

    public Scanner getReader(){
        return reader;
    }

    public static void main(String[] args){
        Main main = new Main();

        int option = 0; 

				do{

					option = main.getOptionShowMenu(); 
					main.executeOption(option);

				}while(option != 0);

				main.getReader().close();
	}
	
	public int getOptionShowMenu(){
		int option = 0; 
		System.out.println("<<<<< Welcome to Inmobiliary SD >>>>>");
		System.out.println(
				"1. Add a building \n" +
				"2. Add an apartment\n" +
				"3. Add an apartment owner \n" + 
                "4. Add a tentant \n" +
				"0. Exit. ");
		option = reader.nextInt(); 

		return option; 
	}

    public void executeOption(int option){
        String msj, buildingName, buildingAdress, ownerName, bankName, tenantName = "";
        int ownerContactPhone, phoneType ,apartmentId, ownerId, amountOfRoomsInApartment, amountOfBathroomsInApartment, apartmentBalcony, monthlyApartmentRent = 0;
        int ownerAccount, tenantId, tenantContactPhone = 0;  
        boolean balcony = false;

        switch(option){
            case 1: 
            System.out.println("You are about to add a building");
            System.out.println("Write the name of the building: ");
            buildingName = reader.next();
            System.out.println("Write the address of the building: ");
            buildingAdress = reader.next();

           
            System.out.println( inmobiliarySystem.addBuilding(buildingName, buildingAdress));

            break;
        
            case 2:
            System.out.println("You are about to add an apartment");
            System.out.println("Write the name of the building where the apartment is: ");
            buildingName = reader.next();
            System.out.println("Write the apartment id (example: 203): ");
            apartmentId = reader.nextInt();
            
            if(apartmentId < 0){
                System.out.println("Sorry but this number cannot be an id");
                break;
            }

            System.out.println("Write the amount of rooms that are in the apartment: ");
            amountOfRoomsInApartment = reader.nextInt();

            if(amountOfRoomsInApartment < 0){
                System.out.println("Sorry but enter a valid option");
                break;
            }

            System.out.println("Write the amount of bathrooms the apartment has: ");
            amountOfBathroomsInApartment = reader.nextInt();

            if(amountOfBathroomsInApartment < 0){
                System.out.println("Write a valid option");
            }

            System.out.println("Does the apartment has a balcony? Write the number of the option");
            System.out.println("1. It has a balcony \n" +
            "2. It doesn't have an apartment \n");

            apartmentBalcony = validateIntegerOption();
            if(apartmentBalcony > 2 || apartmentBalcony <=0){
                System.out.println("Sorry write a valid option \n ");
                break;

            }else if(apartmentBalcony ==1){
                balcony = true;
            } else if(apartmentBalcony ==2){
                balcony = false;
            }

            System.out.println("Write the price of the monthly rent for this apartment: ");
            monthlyApartmentRent = validateIntegerOption();
            if(monthlyApartmentRent < 0){
                System.out.println("Sorry write a valid option");
                break;
            }

            msj = inmobiliarySystem.registerApartmentToBuilding(buildingName, apartmentId, amountOfRoomsInApartment, amountOfBathroomsInApartment, balcony, monthlyApartmentRent);
            inmobiliarySystem.addApartment(buildingName, apartmentId, amountOfRoomsInApartment, amountOfBathroomsInApartment, balcony, monthlyApartmentRent);
            System.out.println(msj);
            break;

            case 3: 
            System.out.println("You are about to register an apartment owner");
            System.out.println("Write the id of the owner (Example: 12344435)");
            ownerId = validateIntegerOption();
            
            if (ownerId < 0){
                System.out.println("Write a valid number");
                break;
            }

            System.out.println("Write the name of the owner: ");
            ownerName = reader.next();
            System.out.println("Write the contact phone of the owner");
            ownerContactPhone = validateIntegerOption();

            if (ownerContactPhone < 0){
                System.out.println("Write a valid number");
                break;
            }

            System.out.println("Write the phone type of the owner");
            System.out.println("1. Home \n" +
            "2. Office \n" + 
            "3. Mobil \n " + 
            "4. Family \n" + 
            "5. Other");
            phoneType = validateIntegerOption();
            if(phoneType >5 || phoneType <=0){
                System.out.println("Write a valid option");
                break;
            }
            System.out.println("Write the account number where the owner is going to get paid: ");
            ownerAccount = validateIntegerOption();
            if(ownerAccount <0 ){
                System.out.println("Write a valid option");
                break; 
            }

            System.out.println("Write the name of the bank that the user use: ");
            bankName = reader.next();
            System.out.println("Write the name where the apartment is located: ");
            System.out.println("Write the name of the building where the apartment is: ");
            buildingName = reader.next();
            System.out.println("Write the id of the apartment: ");
            apartmentId = validateIntegerOption();

            if(apartmentId<0){
                System.out.println("Write a valid option");
                break;

            } 

            msj = inmobiliarySystem.registerOwnerToApartment(ownerId,ownerName,ownerContactPhone, phoneType,ownerAccount, bankName,buildingName, apartmentId);
			inmobiliarySystem.addOwner(ownerId,ownerName,ownerContactPhone, phoneType,ownerAccount, bankName,buildingName, apartmentId);
				
			System.out.println(msj);
			

            break;

            case 4: 
            System.out.println("You are now adding a tenant to an apartment: ");
            System.out.println("Write the id of the tentant: ");
            tenantId = validateIntegerOption();
            if(tenantId<0){
                System.out.println("Write a valid option"); 
                break;

            }

            System.out.println("Write the name of the tenant: ");
            tenantName = reader.next();
            System.out.println("Write the contact phone of the tentant: ");
            tenantContactPhone = validateIntegerOption();
            if(tenantContactPhone<0){
                System.out.println("Write a valid option"); 
                break;

            }
            System.out.println("Write the phone type of the tenant");

            System.out.println("1. Home \n" +
            "2. Office \n" + 
            "3. Mobil \n " + 
            "4. Family \n" + 
            "5. Other");
            phoneType = validateIntegerOption();
            if(phoneType >5 || phoneType <=0){
                System.out.println("this isnot a valid option\n");
                break;
            }

            System.out.println("Write the name of the building where the apartment is located");
            buildingName = reader.next();
            System.out.println("Write the apartment id");
            apartmentId = validateIntegerOption();
			if(apartmentId<0){
				System.out.println("Write a valid option"); 
				break;

			}

            break;

            case 0: 
				System.out.println("Exit program.");
				break; 

			default: 
				System.out.println("Invalid Option");
				break; 

        }
    }

    public int validateIntegerOption(){
		int option = 0; 

		if(reader.hasNextInt()){
			option = reader.nextInt(); 
		}
		else{
			// clear reader. 
			reader.nextLine(); 
			option = -1; 
		}

		return option; 
	}
}