package ru.geekbrains.home_level2_lesson2;

public class Main {
    private static final int SIZEARRAY = 4;

    private static void changeStringToArray (String str, String[][] aS) throws LengthStringhMoreArraySizeExeption {
        int i = 0, j=0;
        for (String s : str.split("[ \n]")) {
            if (i >= SIZEARRAY) throw new LengthStringhMoreArraySizeExeption(" String is long ");
                aS[i][j] = s; j++;
                if (j == SIZEARRAY) {i++;j = 0;}
            }
            if (aS[SIZEARRAY-1][SIZEARRAY-1] == null) throw new LengthStringhMoreArraySizeExeption(" String is shot) ");

    }
    private static long stringToInt (String[][] a) throws CharNotIsNumber {
        long resalt=0;
        for (String [] k : a) for (String s : k ) {
            if (!s.matches("[\\d]+")) throw new CharNotIsNumber("Chars < = > Number"); 
            resalt += Integer.parseInt(s);
        }
        return resalt/2;
    }

    public static void main(String[] args) {

        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String[][] arrStr = new String[SIZEARRAY][SIZEARRAY];

        try {
            changeStringToArray(str, arrStr);
            System.out.println(stringToInt(arrStr));
        }
        catch (LengthStringhMoreArraySizeExeption e) {
            System.err.println("Array index Out of Bound  " + e.getMessage());
        }
        catch (CharNotIsNumber e) {
            System.err.println(e.getMessage());
        }

        System.out.println(" End Game");



    }

}
