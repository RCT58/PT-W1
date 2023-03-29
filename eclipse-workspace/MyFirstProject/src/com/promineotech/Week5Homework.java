package com.promineotech;

//1. Interface named Logger is created 
interface Logger {
	
//2. Two void methods are added to the Logger interface, they both have require a String as an argument
    void log(String message);
    void error(String message);
}

//3. Two classes are made that implemented the Logger interface
class AsteriskLogger implements Logger {
    public void log(String message) {
    	
//4. The log method under the AsteriskLogger will print out the string it receives between 3 asterisks on either side of the String. 
        System.out.println("***" + message + "***");
    }

    public void error(String message) {
    	
//5. The error method under the AsteriskLogger will print the String it receives inside a box of asterisks. The word Error will come before the message. 
        System.out.println("****************");
        System.out.println("***Error: " + message + "***");
        System.out.println("****************");
    }
}

//6. The SpacedLogger will add spaces between each and every character of the String argument passed into its method 
class SpacedLogger implements Logger {
    public void log(String message) {
        for (int i = 0; i < message.length(); i++) {
        	
//7. If the method received HELLO it will come out as H E L L O  
            System.out.print(message.charAt(i) + " ");
        }
        System.out.println();
    }

    public void error(String message) {
    
//8. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
        System.out.print("ERROR: ");
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i) + " ");
        }
        System.out.println();
    }
}

public class Week5Homework {
	
//9. Create a class named App that has a main method.
	public static void main(String[] args) {
    	
//10. In this class instantiate an instance of each of your logger classes that implement the Logger interface. 
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        
//11. Testing both methods on both instances in Strings of my own
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}