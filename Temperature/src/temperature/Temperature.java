package temperature;

import java.util.Scanner;


/**
 *
 * @author Nils Bjerk
 */
public class Temperature {
   public Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        Temperature temp = new Temperature();
	
        temp.menu();
	
    }
    
    
    public void farenheitToCelsius() {
    System.out.print("Enter the temperature in Fahrenheit: ");
    double fahrenheit = sc.nextDouble();
    double celsius=(fahrenheit-32)*5/9;
    System.out.printf("Temperature in Celsius is: %.2f" , celsius);
    System.out.println("\n");
  }
    
    
    public void celsiusToFarenheit() {
    System.out.println("Enter the temperature in Celcius: ");
        double celsius = sc.nextDouble();
        double farenheit = 9.0 / 5.0 * celsius + 32.0;
        System.out.printf("Temperature in Farenheit is: %.2f" , farenheit);
        System.out.println("\n");
    }
    
    
    public void menu(){
        String userInput;
		
	//Loop until the user makes the choice to exit
	while(true){
            //Print the options for the user to choose from
            System.out.println("============================");
            System.out.println("|   MENU SELECTION         |");
            System.out.println("============================");
            System.out.println("| Options:                 |");
            System.out.println("| 1. Farenheit - Celsius   |");
            System.out.println("| 2. Celsius - Farenheit   |");
            System.out.println("| 3. Exit                  |");
            System.out.println("============================");
            
            // Prompt the use to make a choice
            System.out.println("Enter your choice:");
            
            userInput = sc.next();
			
            //Check the user input
            switch(userInput){
                case "1":
                    //do job number 1
                    farenheitToCelsius();
                        break;
                        
		case "2":
                    //do job number 2
                    celsiusToFarenheit();
                        break;
                                
		case "3":
                    //exit the program
                    System.out.println("Exiting...");
                    System.exit(0);
		
                default:
                    //inform the user when invalid choice.
                    System.out.println("INVALID CHOICE!. Read the options carefully... \n");
            }
	}
    }    
}
    
  
