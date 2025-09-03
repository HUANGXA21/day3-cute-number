package org.example;

public class Table {
    public static void main(String[] args) {
        String table = showMultiplicationTable(2, 4);
        System.out.printf(table);
    }

    private static String showMultiplicationTable(int start, int end) {
        if (isStartLessThenEnd(start, end) && isWithinRange(start, end)) {
            return generateMultiplicationTable(start, end);
        } else {
            return "start is not less than end or number is not within range";
        }

    }

    private static boolean isStartLessThenEnd(int start, int end) {
        return start <= end;
    }

    private static boolean isWithinRange(int start, int end) {
        return (start >= 1 && start <= 1000) && (end >= 1 && end <= 1000);
    }

    private static String generateMultiplicationTable(int start, int end) {
        StringBuilder table = new StringBuilder();
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= i; j++) {
                table.append(String.format("%d×%d=%d\t", j, i, j * i));
            }
            table.append("\n");
        }

        return table.toString();
    }
}
