import java.io.*;
class FinallyExample{
    // public static void main(String[] args) {
    //     int [] numbers = { 1, 2, 3 };
    //     try {
    //         System.out.println(numbers[5]);
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Array index is out of bounds!");
    //     } finally {
    //         System.out.println("This block will always be executed.");
    //     }
    //     System.out.println("Program continues after the try-catch block.");
    // }

    // public static void main(String[] args) {
    //     checkAge(15);

    // }
    // static void checkAge(int age){
    //     if(age < 18){
    //         throw new IllegalArgumentException("age must be at least 18");
    //     } else {
    //         System.out.println("Access granted - You are old enough.");
    //     }
    // }


     static void readFile(String fileName) throws IOException {

        // Using try-with-resources to automatically close FileReader
        try (FileReader file = new FileReader(fileName)) {
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data); // Read and print file content
            }
        }
        // No need for finally block to close the resource
    }

    public static void main(String[] args) {
        try{
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + e.getMessage());
        }
        System.out.println("\nProgram continues after reading the file.");
    }
}
