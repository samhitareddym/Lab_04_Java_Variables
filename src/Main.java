public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 3;
        int intSum = 6;
        int intProduct = 14;
        int intDifference = 20;
        int intQuotient = 16;
        int intModulo = 7;

        double doubleOperandA = 3.50;
        double doubleOperandB = 6.50;
        double doubleSum = 7.65;
        double doubleProduct = 9.81;
        double doubleDifference = 8.50;
        double doubleQuotient = 2.50;

        intSum = intOperandA + intOperandB; 
        System.out.println ("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum); 
        doubleSum = doubleOperandA + doubleOperandB; 
        System.out.println ("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum); 

        intProduct = intOperandA * intOperandB;
        System.out.println ("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct); 
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println ("The product using doubles of " + intOperandA + " " + intOperandB + " is " + doubleProduct); 

        intDifference = intOperandB - intOperandA;
        System.out.println ("The Difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        doubleDifference = doubleOperandB - doubleOperandA; 
        System.out.println ("The Difference using doubles of " + intOperandA + " " + intOperandB + " is " + doubleDifference);

        intQuotient = intOperandA/intOperandB;
        System.out.println ("The Quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        doubleQuotient = doubleOperandA/doubleOperandB; 
        System.out.println ("The Quotient using doubles of " + doubletOperandA + " " + doubleOperandB + " is " + doubleQuotient);

        intModulo = intOperandA % intOperandB; 
        System.out.println ("The Modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
    }
}
