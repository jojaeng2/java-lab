package chapter_13.src;

public interface Resizable {

    int getWidth();
    int getHeight();
    void setWidth(int width);
    void setHeight(int height);
    void setAbsoluteSize(int width, int height);
    void draw();

    default void setRelativeSize(int wFactor, int hFactor) {
        setAbsoluteSize(getWidth() / wFactor, getHeight() / hFactor);
    }
}
