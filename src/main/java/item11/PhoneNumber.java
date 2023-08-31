package item11;

public final class PhoneNumber {
    private final short first, middle, end;

    public PhoneNumber(int first, int middle, int end) {
        this.first = rangeCheck(first, 999, "지역코드");
        this.middle = rangeCheck(middle, 9999, "중간");
        this.end = rangeCheck(end, 9999, "끝");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber that = (PhoneNumber) o;

        if (first != that.first) return false;
        if (middle != that.middle) return false;
        return end == that.end;
    }

    @Override
    public int hashCode() {
        int result = first;
        result = 31 * result + (int) middle;
        result = 31 * result + (int) end;
        return result;
    }
}


