package by.ivan.zelezinski.test.project.task12;

public class Solution12 {
    public String intToRoman(int num) {
        int first = Math.floorMod(num, 10);
        int firstRest = Math.floorDiv(num, 10);

        String firstResult = "";
        if (first == '9' - '0') {
            firstResult = firstResult.concat("IX");
        } else if (first < 9 & first >= 5) {
            firstResult = firstResult.concat("V");
            int times = first - 5;
            for (int i = 0; i < times; i++) {
                firstResult = firstResult.concat("I");
            }
        } else if (first == 4) {
            firstResult = firstResult.concat("IV");
        } else {
            for (int i = 0; i < first; i++) {
                firstResult = firstResult.concat("I");
            }
        }

        if (firstRest <= 0) {
            return firstResult;
        }

        int second = Math.floorMod(firstRest, 10);
        int secondRest = Math.floorDiv(firstRest, 10);

        String secondResult = "";
        if (second == 9) {
            secondResult = secondResult.concat("XC");
        } else if (second < 9 & second >= 5) {
            secondResult = secondResult.concat("L");
            int times = second - 5;
            for (int i = 0; i < times; i++) {
                secondResult = secondResult.concat("X");
            }
        } else if (second == 4) {
            secondResult = secondResult.concat("XL");
        } else {
            for (int i = 0; i < second; i++) {
                secondResult = secondResult.concat("X");
            }
        }

        if (secondRest <= 0) {
            return secondResult.concat(firstResult);
        }

        int third = Math.floorMod(secondRest, 10);
        int thirdRest = Math.floorDiv(secondRest, 10);

        String thirdResult = "";
        if (third == 9) {
            thirdResult = thirdResult.concat("CM");
        } else if (third < 9 & third >= 5) {
            thirdResult = thirdResult.concat("D");
            int times = third - 5;
            for (int i = 0; i < times; i++) {
                thirdResult = thirdResult.concat("C");
            }
        } else if (third == 4) {
            thirdResult = thirdResult.concat("CD");
        } else {
            for (int i = 0; i < third; i++) {
                thirdResult = thirdResult.concat("C");
            }
        }

        if (thirdRest <= 0) {
            return thirdResult.concat(secondResult.concat(firstResult));
        }

        int fourth = Math.floorMod(thirdRest, 10);

        String fourthResult = "";

        for (int i = 0; i < fourth; i++) {
            fourthResult = fourthResult.concat("M");
        }


        return fourthResult.concat(thirdResult).concat(secondResult.concat(firstResult));

    }
}
