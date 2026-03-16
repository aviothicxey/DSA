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

    public static void main(String[] args) {
        checkAge(15);

    }
    static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("age must be at least 18");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }
}
