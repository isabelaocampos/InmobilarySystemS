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
				"2. Change Person from a planet to another \n" +
				"3.Show all the visitors inside the Solar System \n" + 
				"0. Exit. ");
		option = reader.nextInt(); 

		return option; 
	}

    public void executeOption(int option){
        String buildingName, buildingAdress = "";
        int amountOfApartments = 0;

        switch(option){
            case 1: 
            System.out.println("You are about to add a building");
            System.out.println("Write the name of the building: ");
            buildingName = reader.next();
            System.out.println("Write the amount of apartments the building has: ");
            amountOfApartments = reader.nextInt();
            System.out.println("Write the address of the building: ");
            buildingAdress = reader.next();

           
            System.out.println( inmobiliarySystem.addBuilding(buildingName, amountOfApartments, buildingAdress));

    }
}
}