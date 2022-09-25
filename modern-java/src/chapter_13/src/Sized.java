package chapter_13.src;

public interface Sized {

    int size();

    default boolean isEmpty() {
        return size() == 0;
    }
}
