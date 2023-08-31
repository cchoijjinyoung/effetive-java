package item11;

public class Feature {
    private final String see;

    public Feature(String see) {
        this.see = see;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feature feature = (Feature) o;

        return see != null ? see.equals(feature.see) : feature.see == null;
    }

    @Override
    public int hashCode() {
        return see != null ? see.hashCode() : 0;
    }
}
