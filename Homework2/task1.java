// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

package Homework2;

import java.util.Scanner;

public class task1 {
    static void hanoiTower(int n, int first, int second, int third)
    {
      if (n == 0) return;
      hanoiTower(n-1,first,third,second);
      System.out.println(first + " " + third);
      hanoiTower(n-1,second,first, third);
    }
  
    public static void main(String[] args)
    {
      Scanner con = new Scanner(System.in);
      int n = con.nextInt();
      hanoiTower(n,1,2,3);
      con.close();
    }
}


