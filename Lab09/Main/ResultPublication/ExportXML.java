package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ExportXML extends Export{
    public ExportXML(String filename) {
        super(filename);
    }

    public void export(List<Student> list) throws IOException{
        BufferedWriter write=new BufferedWriter(new FileWriter(this.filename,true));
        for(Student student:list){
            write.append("<Student>\n");
            write.append("<studentID>"+student.studentID+"</studentID>\n");
            write.append("<name>"+student.name+"</name>\n");
            write.append("<program>"+String.valueOf(student.program)+"</program>\n");
            write.append("<CGPA>"+String.format("%.2f",student.CGPA)+"</CGPA>\n");
            write.append("</Student>\n");
        }
        write.close();
    }
}
