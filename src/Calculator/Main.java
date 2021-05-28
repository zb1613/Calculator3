package Calculator;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ArithmeticException, IllegalArgumentException, ArrayIndexOutOfBoundsException, IOException {
        String[] numbers;
        Scanner sc = new Scanner(System.in);
        String str = String.valueOf(sc.nextLine());
        str= str.toUpperCase();
        if (str.matches("[0-9]{1,2}[-*+/]{1}[0-9]{1,2}")) {
                numbers = str.split("[-*+/]");
                Arabic calc = new Arabic();
                int num1 = calc.getNum1(numbers[0]);
                int num2 = calc.getNum2(numbers[1]);
                if (num1 > 10 || num2 > 10) { throw new IllegalArgumentException("Введено число больше 10ти"); }
                else {
                    int result = calc.calculate(num1, num2, str);
                    System.out.println(result);
                }
        } else if (str.matches("[I,V,X]{1,4}[-*+/]{1}[I,V,X]{1,4}")) {
            numbers = str.split("[-*+/]");
            RomainNumbers calcR = new RomainNumbers();
            int num1 = calcR.getVal1(numbers[0]);
            int num2 = calcR.getVal2(numbers[1]);
            if (num1 > 10 || num2 > 10) { throw new IllegalArgumentException("Введено число больше 10ти"); }
            else {
                int result = calcR.calculate(num1, num2, str);
                RomainNumbers.romanOut(result);
            }
        }
            else { throw new IllegalArgumentException("Некорректный ввод");
        }

            }
        }





