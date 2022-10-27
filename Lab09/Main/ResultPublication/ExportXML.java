package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExportXML implements ExportType{
    public File file;
    public ExportXML(String filename) {
        this.file=new File(filename);
    }

    public boolean CreateFile() throws IOException {
        return this.file.createNewFile();
    }

    public void export(List<Student> list){

    }
}
