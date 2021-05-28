package Calculator;

public class RomainNumbers extends Arabic {

    public int getVal1 (String val) throws IllegalArgumentException{
        int num1;
            RomNum val1 = RomNum.valueOf(val);
            num1 = val1.getValue(val);
        return num1;
    }
    public  int getVal2 (String val) throws IllegalArgumentException {
        int num2;
            RomNum val2 = RomNum.valueOf(val);
            num2 = val2.getValue(val);
        return num2;
    }
    public static void romanOut (int result) {
        if (result > 1 && result < 10){
            System.out.println(RomNum.convert(result));
        } else if (result > 10 && result < 20){
            result = result - 10;
            System.out.println ("X"+ RomNum.convert(result));
        } else if (result > 20 && result < 30){
            result = result - 20;
            System.out.println("XX"+ RomNum.convert(result));
        } else if (result > 30 && result < 40){
            result = result - 30;
            System.out.println("XXX"+RomNum.convert(result));
        } else if (result > 40 && result < 50){
            result = result - 40;
            System.out.println("XL"+RomNum.convert(result));
        } else if (result > 50 && result < 60){
            result = result - 50;
            System.out.println("L"+RomNum.convert(result));
        } else if (result > 60 && result < 70) {
            result = result - 60;
            System.out.println("LX"+RomNum.convert(result));
        } else if (result > 70 && result < 80){
            result = result - 70;
            System.out.println("LXX"+ RomNum.convert(result));
        } else if (result > 80 && result < 90){
            result = result - 80;
            System.out.println("LXXX"+ RomNum.convert(result));
        } else if (result > 90 && result < 100){
            result = result - 90;
            System.out.println("XC"+RomNum.convert(result));
        } else {
            System.out.println(RomNum.convert(result));
        }

    }
    }

