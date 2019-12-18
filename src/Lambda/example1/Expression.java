package Lambda;

@FunctionalInterface
public interface Expression<T> {

    boolean isEqual (T t);

}
