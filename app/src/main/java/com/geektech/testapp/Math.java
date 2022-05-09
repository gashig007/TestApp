package com.geektech.testapp;

import java.util.regex.Pattern;

public class Math {
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public String add(String a, String b) {
        String result = "";
        if (a.isEmpty() || b.isEmpty()) {
            return "Пусто";
        }
        else if (isNumeric(a) || isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            result = String.valueOf(num1 + num2);
        } else {
            result = "Буквы нельзя";
            System.out.println("Буквы нельзя");
        }
        return result;
    }

    public String minus(String a, String b) {
        String result = "";
        if (a.isEmpty() || b.isEmpty()) {
            return "Пусто";
        }
        else if (isNumeric(a) || isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            result = String.valueOf(num1 - num2);
        } else {
            result = "Буквы нельзя";
            System.out.println("Буквы нельзя");
        }
        return result;
    }

    public String multy(String a, String b) {
        String result = "";
        if (a.isEmpty() || b.isEmpty()) {
            return "Пусто";
        }
        else if (isNumeric(a) || isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            result = String.valueOf(num1 * num2);
        } else {
            result = "Буквы нельзя";
            System.out.println("Буквы нельзя");
        }
        return result;
    }

    public String divide(String a, String b) {
        String result = "";
        if (b.equals("0") || a.equals("0")) {
            result = "на ноль нельзя";
        }

        else if (a.isEmpty() || b.isEmpty()) {
            return "Пусто";
        }
        else if (isNumeric(a) || isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            result = String.valueOf(num1 / num2);
        }
        else if (Integer.parseInt(a) % 2 == 0 && Integer.parseInt(b) % 2 == 1){
            result = "делить нельзя";
        }
        else if (Integer.parseInt(b) % 2 == 0 && Integer.parseInt(a) % 2 == 1){
            result = "делить нельзя";
        } else {
            result = "Буквы нельзя";
            System.out.println("Буквы нельзя");
        }
        return result;
    }


    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
