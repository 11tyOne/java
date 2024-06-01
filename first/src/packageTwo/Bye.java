package packageTwo;

import packageOne.Hello; 

public class Bye { // Classes are independent of each other, Bye can run on its own and doesnt need Hello

    public static void main(String[] args) { // This main wont clash with the main in Hello because they are called along with their class
        
        Hello.secondMethod(); // Since the whole package is imported at the start i dont have to write packageOne.Hello.[method]

        packageOne.alpha.Hi.main(args); // Didnt import so had to write the whole thing
    }
}
