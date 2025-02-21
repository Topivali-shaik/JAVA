package DATATYPES;

public class PassByValueExample {
    public static void changeValue(int number) {
        number = number + 10; // Change made to local copy
        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {
        int originalNumber = 5;
        changeValue(originalNumber);
        changeValue(originalNumber);

        System.out.println("After method call: " + originalNumber); // Original number remains unchanged
    }
}
