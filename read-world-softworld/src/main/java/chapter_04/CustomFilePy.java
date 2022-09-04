package chapter_04;

public class CustomFilePy implements CustomFileImport{

    @Override
    public void process() {
        System.out.println("Python file!");
    }
}
