import java.io.File;
import java.io.FileFilter;

public class Files {
    File[] hiddenFiles1 = new File(".").listFiles(new FileFilter() {
       public boolean accept(File file) {
           return file.isHidden();
       }
    });

    File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
}
