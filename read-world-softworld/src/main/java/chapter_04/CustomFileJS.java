package chapter_04;

public class CustomFileJS implements CustomFileImport{

    @Override
    public void process() {
        System.out.println("JS file!");
    }
}
