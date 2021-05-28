package Calculator;

public class Arabic {
    private int result;

    public int getNum1(String val1) {
        int num1;
            num1 = Integer.parseInt(val1);
            return num1;
        }
        public int getNum2 (String val2) {
        int num2;
        num2 = Integer.parseInt(val2);
            return num2;
            }

        public int calculate (int num1,int num2,String str) throws IllegalArgumentException,ArithmeticException {
                if (str.contains("+")) {
                    result = (num1 + num2);
                } else if (str.contains("-")) {
                    result = (num1 - num2);
                } else if (str.contains("/")) {
                    if (num2 == 0) throw new ArithmeticException("Деление на ноль");
                    result = (num1 / num2);
                } else if (str.contains("*")) {
                    result = (num1 * num2);
                }
        return result;
            }
        }






