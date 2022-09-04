package chapter_04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Application {

    private static Map<String, CustomFileImport> fileMap = new HashMap<>();

    public static void main(String[] args) {
        ArrayList<CustomFile> files = new ArrayList<>();
        CustomFile file1 = new CustomFile("py");
        CustomFile file2 = new CustomFile("cpp");
        CustomFile file3 = new CustomFile("java");
        CustomFile file4 = new CustomFile("js");

        files.add(file1);
        files.add(file2);
        files.add(file3);
        files.add(file4);

        fileMap.put("py", new CustomFilePy());
        fileMap.put("cpp", new CustomFileCPP());
        fileMap.put("java", new CustomFileJava());
        fileMap.put("js", new CustomFileJS());

        for (CustomFile file : files) {
            fileMap.get(file.getType()).process();
        }
    }
}
