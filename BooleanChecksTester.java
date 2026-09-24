public class BooleanChecksTester {
    public static void main(String[] args) {
        BooleanChecks checks = new BooleanChecks();

        // Uncomment each group as you finish that method in BooleanChecks.java.

        System.out.println("implies(true, true): " + checks.implies(true, true));
        System.out.println("implies(true, false): " + checks.implies(true, false));
        System.out.println("implies(false, true): " + checks.implies(false, true));
        System.out.println("implies(false, false): " + checks.implies(false, false));

        System.out.println("exactlyOne(true, true): " + checks.exactlyOne(true, true));
        System.out.println("exactlyOne(true, false): " + checks.exactlyOne(true, false));
        System.out.println("exactlyOne(false, true): " + checks.exactlyOne(false, true));
        System.out.println("exactlyOne(false, false): " + checks.exactlyOne(false, false));

        System.out
                .println("atLeastTwo(true, true, false): " + checks.atLeastTwo(true, true, false));
        System.out
                .println("atLeastTwo(false, true, true): " + checks.atLeastTwo(false, true, true));
        System.out.println(
                "atLeastTwo(true, false, false): " + checks.atLeastTwo(true, false, false));

        System.out.println("isLeapYear(2024): " + checks.isLeapYear(2024));
        System.out.println("isLeapYear(2023): " + checks.isLeapYear(2023));
        System.out.println("isLeapYear(1900): " + checks.isLeapYear(1900));
        System.out.println("isLeapYear(2000): " + checks.isLeapYear(2000));

        System.out.println("outsideRange(0, 1, 10): " + checks.outsideRange(0, 1, 10));
        System.out.println("outsideRange(1, 1, 10): " + checks.outsideRange(1, 1, 10));
        System.out.println("outsideRange(10, 1, 10): " + checks.outsideRange(10, 1, 10));
        System.out.println("outsideRange(11, 1, 10): " + checks.outsideRange(11, 1, 10));

        System.out.println("divides(3, 12): " + checks.divides(3, 12));
        System.out.println("divides(5, 12): " + checks.divides(5, 12));
        System.out.println("divides(0, 12): " + checks.divides(0, 12));

        System.out.println("averageAtLeast(90, 3, 30): " + checks.averageAtLeast(90, 3, 30));
        System.out.println("averageAtLeast(89, 3, 30): " + checks.averageAtLeast(89, 3, 30));
        System.out.println("averageAtLeast(0, 0, 1): " + checks.averageAtLeast(0, 0, 1));

        System.out.println("hasPrefix(\"sunset\", \"sun\"): " + checks.hasPrefix("sunset", "sun"));
        System.out.println("hasPrefix(\"sunset\", \"set\"): " + checks.hasPrefix("sunset", "set"));
        System.out.println("hasPrefix(\"su\", \"sun\"): " + checks.hasPrefix("su", "sun"));
    }
}
