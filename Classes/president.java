/*
Define a president class which does president stuff

To compile:
javac President.java

To run:
java Talk
*/

class President {
    String name;
    String quote; // A saying associated with the President
    
    // Class constructor
    President(String n, String q) {
        name = n;
        quote = q;
    }
    
    // Speak method
    public void speak() {
        System.out.println(quote);
    }
}

class Talk {
    public static void main(String args[]) {
        // Create some presidents
        President bush = new President(
            "George W. Bush",
            "They have misunderestimated me.");
        President obama = new President(
            "Barack H. Obama",
            "We are the change that we seek."
        );
        President trump = new President(
            "Donald J. Trump",
            "I will build a wall, and make Mexico pay for that wall."
        );
        
        # Bloviate
        trump.speak();
    }
}