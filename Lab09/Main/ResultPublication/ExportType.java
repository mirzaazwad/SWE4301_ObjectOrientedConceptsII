package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.io.IOException;
import java.util.List;

public interface ExportType {
    public boolean CreateFile() throws IOException;
    public void export(List<Student> list) throws IOException;

    public String readExportedFile();
}
