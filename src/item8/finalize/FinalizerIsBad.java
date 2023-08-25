package item8.finalize;

public class FinalizerIsBad {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("");
    }
}
