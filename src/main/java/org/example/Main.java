package org.example;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    static Scanner input = new Scanner(System.in);
    static boolean work = true;
    public static void main(String[] args) {
        out.println("Додаток для підраховувань площ фігур");
        while(work)
        {
            out.println("\nВиберіть фігуру: ");
            out.println("1. Прямокутник\n2. Ромб\n3. Квадрат\n4. Трикутник");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice)
            {
                case 1:
                {
                    out.println("Введіть довжину: ");
                    int length = input.nextInt();
                    input.nextLine();
                    out.println("Введіть висоту: ");
                    int width = input.nextInt();
                    input.nextLine();
                    Rectangle rectangle = new Rectangle(length, width);
                    out.println("Площа: " + rectangle.Area());
                    break;
                }
                case 2:
                {
                    out.println("Введіть першу діагональ: ");
                    int diagonal1 = input.nextInt();
                    input.nextLine();
                    out.println("Введіть другу діагональ: ");
                    int diagonal2 = input.nextInt();
                    input.nextLine();
                    Rhombus rhombus = new Rhombus(diagonal1, diagonal2);
                    out.println("Площа: " + rhombus.Area());
                    break;
                }
                case 3:
                {
                    out.println("Введіть сторону: ");
                    int side = input.nextInt();
                    input.nextLine();
                    Square square = new Square(side);
                    out.println("Площа: " + square.Area());
                    break;
                }
                case 4:
                {
                    out.println("Введіть основу: ");
                    int base = input.nextInt();
                    input.nextLine();
                    out.println("Введіть висоту: ");
                    int height = input.nextInt();
                    input.nextLine();
                    Triangle triangle = new Triangle(base, height);
                    out.println("Площа: " + triangle.Area());
                    break;
                }
                default:
                {
                    work = false;
                    break;
                }
            }
        }
    }
}