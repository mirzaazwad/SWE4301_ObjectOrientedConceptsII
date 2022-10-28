package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ExportCSV implements ExportType {
    public File file;
    public String filename;
    public ExportCSV(String filename) {
        this.filename=filename;
        this.file=new File(filename);
    }

    public boolean CreateFile() throws IOException{
            return this.file.createNewFile();
    }

    public void export(List<Student> list) throws IOException{
        BufferedWriter write=new BufferedWriter(new FileWriter(filename,true));
        for(Student student:list){
            write.append(student.studentID+","+student.name+","+String.valueOf(student.program)+","+String.format("%.2f",student.CGPA)+"\n");
        }
        write.close();
    }

    public String readExportedFile(){
        String output="";
        try {
            Scanner myReader = new Scanner(this.file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                output=output+data+"\n";
            }
            myReader.close();
            return output;
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
    }
}
