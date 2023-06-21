import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a=0, b = 0;
        Scanner scanner = new Scanner(System.in);
        try
        {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        catch (java.util.InputMismatchException inputMismatchException)
        {
            System.out.println("Не верный формат данных, вводимые значения " +
                    "должны иметь целочисленные значения");
        }
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Деление на 0 невозможно");
        }
        scanner.close();
    }
}
