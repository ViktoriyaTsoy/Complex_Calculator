import java.util.Scanner;

public class TriangleNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        
        int triangleNumber = calculateTriangleNumber(n);
        long factorial = calculateFactorial(n);
        
        System.out.println("Треугольное число T(" + n + ") = " + triangleNumber);
        System.out.println(n + "! = " + factorial);
        
        scanner.close();
    }
    
    // Метод для вычисления n-ого треугольного числа
    public static int calculateTriangleNumber(int n) {
        return (n * (n + 1)) / 2;
    }
    
    // Метод для вычисления n!
    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}