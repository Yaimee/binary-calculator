public class BinaryCal {

    public int binaryToDecimal(String value) {
        char[] binary = value.toCharArray();
        int decimalValue = 0;

        for (int i = 0; i < value.length(); i++)
        {
            if (binary[i] == '0') {
                continue;
            } else if (binary[i] == '1') {
                decimalValue += toDecimal(i);
            } else {
                System.out.println("Not a valid binary input");
                break;
            }
        }
        return decimalValue;
    }

    public int toDecimal(int index)
    {
        int base = 1;
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                base *= 2;
            }
        }
        return base;
    }

}


