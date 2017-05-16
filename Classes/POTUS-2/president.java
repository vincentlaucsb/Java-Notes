/*
Define a president class which does president stuff. Similar 
to version 1 but:
 * Can take in an array of quotes
 * Prints the next quote everytime speak() is called

To compile:
javac President.java

To run:
java Talk
*/

class President {
    String name;
    String[] quotes; // Sayings associated with the President
    int quote_num;   // The current quote we are on
    
    // Class constructor
    President(String n, String q[]) {
        name = n;
        quotes = q;
        quote_num = 0;
    }
    
    // Speak method
    public void speak() {
        System.out.println(quotes[quote_num]);
        
        if (quote_num + 1 == quotes.length) { 
            quote_num = 0; // Recycle to beginning
        } else {
            quote_num += 1;
        }
    }
}

class Talk {
    public static void main(String args[]) {
        // Create some presidents
        String[] trump_quotes = {
             "I will build a wall, and make Mexico pay for that wall.",
             "Don't worry about it Lil Marco",
             "Lyin' Ted.",
             "Because you’d be in jail"
            };
        
        President trump = new President(
            "Donald J. Trump",
            trump_quotes
        );
        
        // Bloviate
        trump.speak();
        
        // Again
        trump.speak();
        
        // Bloviate 10 times
        for (int i = 0; i < 10; i++) {
            trump.speak();
        }
    }
}