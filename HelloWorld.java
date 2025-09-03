public class HelloWorld {
    public static void main(String[] args) {
        // Declare a variable
        String message = "Hello, World!";

        // Print the message
        System.out.println(message);

        // Call a method
        int sum = addNumbers(5, 7);
        System.out.println("The sum is: " + sum);
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}