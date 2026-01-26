package BasicsOfJava;

public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        // Declaring and initializing primitive data types
        byte byteVar = 10;              // 1 byte
        short shortVar = 2000;          // 2 bytes
        int intVar = 50000;             // 4 bytes
        long longVar = 15000000000L;    // 8 bytes (note the 'L' at the end)

        float floatVar = 12.34f;        // 4 bytes (note the 'f' at the end)
        double doubleVar = 123.456789;  // 8 bytes

        char charVar = 'A';             // 2 bytes (Unicode character)
        boolean boolVar = true;         // 1 bit (true or false)

        // Printing all values
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Int value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Char value: " + charVar);
        System.out.println("Boolean value: " + boolVar);
    }
}
