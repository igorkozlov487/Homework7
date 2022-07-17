/*+Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, 
например 2? + ?5 = 69. Требуется восстановить выражение 
до верного равенства. Предложить хотя бы одно решение 
или сообщить, что его нет.*/

public class program {

    private static String[] parseString(String expr) {
        String[] elements = expr.split(" ");
        return elements;
    }

    private static Boolean checkEquation(String item1, String item2, String answer) {
        int num1 = Integer.parseInt(item1);
        int num2 = Integer.parseInt(item2);
        int res = Integer.parseInt(answer);
        return num1 + num2 == res;
    }
    
    private static String findNums(String[] arr) {
        
        for (int i = 0; i < 10; i++) {
            String num1 = arr[0].replace("?", Integer.toString(i));
            for (int j = 0; j < 10; j++) {
                String num2 = arr[2].replace("?", Integer.toString(j));
                if (checkEquation(num1, num2, arr[4])) {
                    return num1 + " + " + num2 + " = " + arr[4];
                     
                }
            }
        }
        return "Решений нет";
    }
    public static void main(String[] args) {
        
        String expr = "2? + ?5 = 69";
        String outExpr = findNums(parseString(expr));
        System.out.println(outExpr);
    }
}
