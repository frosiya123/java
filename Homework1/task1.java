//Написать программу вычисления n-ого треугольного числа.


public class task1 {
    public static void main(String[] args){
        int n = 4;
        double result = 0;
        for (double i = 1; i <= n; i++){
            result = i/2*(i+1);
            System.out.println(result);
        }
    }
}