class Printer {
    // Generic method to print any type of array
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

public class JavaGenerics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}