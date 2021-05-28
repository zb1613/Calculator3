package Calculator;
public enum RomNum {
    I("I", 1), II("II", 2), III("III", 3),
    IV("IV", 4), IX("IX", 9), V("V", 5),
    VI("VI", 6), VII("VII", 7), VIII("VIII", 8),
    X("X", 10), XX("XX", 20), XXX("XXX", 30),
    XL("XL", 40), L("L", 50), LX("LX", 60),
    LXX("LXX", 70), LXXX("LXXX", 80), XC("XC", 90), C("C", 100);
    int value;
    String key;

     RomNum(String key, int value) {
        this.value = value;
        this.key = key;
    }
    public int getValue(String key) {
        return value;
    }
    public String getKey(int value) {
        return key;
    }
    public static String convert(int r) {
        switch (r) {
            case 1:
                return I.getKey(r);
            case 2:
                return II.getKey(r);
            case 3:
                return III.getKey(r);
            case 4:
                return IV.getKey(r);
            case 5:
                return V.getKey(r);
            case 6:
                return VI.getKey(r);
            case 7:
                return VII.getKey(r);
           case 8:
                return VIII.getKey(r);
            case 9:
                return IX.getKey(r);
            case 10:
                return X.getKey(r);
            case 20:
                return XX.getKey(r);
            case 30:
             return XXX.getKey(r);
            case 40:
                return XL.getKey(r);
            case 50:
                return L.getKey(r);
            case 60:
                return LX.getKey(r);
            case 70:
                return LXX.getKey(r);
            case 80:
                return LXXX.getKey(r);
            case 90:
                return XC.getKey(r);
            case 100:
                return C.getKey(r);
        }
        return "";
     }
}



