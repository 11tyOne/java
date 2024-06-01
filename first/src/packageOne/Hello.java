package packageOne; // Packages are like folders for classes
/**
 * Javadoc comment (extra asterisk in the start)
 * Used for api documentation and usually goes before all methods and classes
 */

/*
 * Multi line comment
 * Java projects have atleast one class and one main() method
 */

public class Hello { // Methods like main, secondMethod, println, come inside a class like Hello
    public static void main(String[] args) {  
      
      // System.out.print ≅ System/out/print like in folders
      System.out.print("1. Hell\bo "); // Backspace

      System.out.print("world\n");  // New line, println does the same thing

      System.out.println("2. \t !!");   // Tab

      System.out.println("3. This is a \"quote\"");   // Printing quotation marks

      secondMethod(); // Other methods need to be called by main to run

      System.out.println("4. This is a backslash - \\"); // Printing backslashes   
    }

    public static void secondMethod() {
      System.out.println("Injected here with second method");
    }
  } // No semicolon at the end of curly brackets