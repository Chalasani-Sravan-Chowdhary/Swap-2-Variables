public class SwappingTwoVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.print("Before Swapping the numbers: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swapping logic
        int temp = a; // a=10 value is stored in temp which will later be stored into b
        a = b;        // Assigning the value of b to a
        b = temp;     // Assigning the value of temp  to b 
        
        System.out.println("After Swapping the numbers:");
        System.out.println("a = " + a); // Now a value is converted into the original value of b
        System.out.println("b = " + b); // Now b value is converted into the original value of a
    }
}