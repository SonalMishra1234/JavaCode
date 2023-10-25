package JavaAssingment;
import java.util.Scanner;

public class RomanToInteger 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman numeral: ");
        String romanNum = sc.nextLine().toUpperCase(); 
        // Convert to upper case for case insensitivity

        int result = 0;
        int prevValue = 0;

        for (int i = romanNum.length() - 1; i >= 0; i--) 
        {
            char currentChar = romanNum.charAt(i);
            int currentValue = 0;

            switch (currentChar) 
            {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
                default:
                    System.out.println("Invalid Roman numeral.");
                    return;
            }

            if (currentValue < prevValue) 
            {
                result -= currentValue;
            } 
            else
            {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        System.out.println("Roman numeral " + romanNum + " is equivalent to integer " + result);
    }
}


