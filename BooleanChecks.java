public class BooleanChecks {

    // Returns false only when p is true and q is false.
    // to-do: implement implies
    public boolean implies(boolean p, boolean q) {
        if (p && q) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true when exactly one of the two values is true.
    // to-do: implement exactlyOne
    public boolean exactlyOne(boolean p, boolean q) {
        if (p || q) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true when two or three of the values are true.
    // to-do: implement atLeastTwo
    public boolean atLeastTwo(boolean a, boolean b, boolean c) {
        if ((a && b) || (b && c) || (a && c)) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true for a leap year in the Gregorian calendar.
    // to-do: implement isLeapYear
    public boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true when value is below low or above high. Both endpoints count as inside.
    // to-do: implement outsideRange
    public boolean outsideRange(int value, int low, int high) {
        if ((value >= high) && (value <= high)) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true when d divides n evenly. A divisor of 0 divides nothing.
    // to-do: implement divides
    public boolean divides(int d, int n) {
        if ((d / n == 0) && (n != 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true when total / count is at least target. A count of 0 has no average.
    // to-do: implement averageAtLeast
    public boolean averageAtLeast(int total, int count, int target) {
        if ((total / count > target) && (total >= 0) && (count != 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true when word begins with prefix.
    // to-do: implement hasPrefix
    public boolean hasPrefix(String word, String prefix) {
        return word.startsWith(prefix);
    }
}
