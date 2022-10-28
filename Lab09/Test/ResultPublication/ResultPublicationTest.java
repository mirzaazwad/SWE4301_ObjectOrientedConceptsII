package Lab09.ResultPublication;
import Lab09.StudentCollection.InvalidStudentIDException;
import Lab09.StudentCollection.Student;
import Lab09.StudentCollection.StudentEnrollment;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ResultPublicationTest {
    @Test
    public void TestSortByID() throws InvalidStudentIDException {
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Karim","SWE",3.80f);
        Student student3 = new Student("123456780","Barkat","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        ResultPublication rps=new ResultPublication(studentEnrollment.studentList);
        rps.studentList=rps.sortByID();
        assertEquals(rps.studentList.get(0).name,"Barkat");
    }

    @Test
    public void TestSortByName() throws InvalidStudentIDException{
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Adam","SWE",3.80f);
        Student student3 = new Student("123456780","Barkat","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        ResultPublication rps=new ResultPublication(studentEnrollment.studentList);
        rps.studentList=rps.sortByName();
        assertEquals(rps.studentList.get(0).name,"Adam");
    }

    @Test
    public void TestSortByCGPA() throws InvalidStudentIDException{
        Student student1 = new Student("123456787","Rahim","SWE",4.00f);
        Student student2 = new Student("123456788","Adam","SWE",3.80f);
        Student student3 = new Student("123456780","Barkat","SWE",3.00f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        ResultPublication rps=new ResultPublication(studentEnrollment.studentList);
        rps.studentList=rps.sortByCGPA();
        assertEquals(rps.studentList.get(0).name,"Rahim");
    }

    @Test
    public void TestSortByCGPAName() throws InvalidStudentIDException{
        Student student1 = new Student("123456787","Rahim","SWE",4.00f);
        Student student2 = new Student("123456789","Adam","SWE",4.00f);
        Student student3 = new Student("123456780","Barkat","SWE",3.00f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        ResultPublication rps=new ResultPublication(studentEnrollment.studentList);
        rps.studentList=rps.sortByCGPA_ID();
        assertEquals(rps.studentList.get(0).name,"Adam");
    }

    @Test
    public void TestCSVWrite() throws InvalidStudentIDException {
        Student student1 = new Student("123456787","Rahim","SWE",4.00f);
        Student student2 = new Student("123456789","Adam","SWE",4.00f);
        Student student3 = new Student("123456780","Barkat","SWE",3.00f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        ResultPublication rps=new ResultPublication(studentEnrollment.studentList);
        ExportCSV export=new ExportCSV("file.csv");
        assertTrue(rps.ExportData(export));
        assertEquals(export.readExportedFile(),"123456787,Rahim,SWE,4.00\n" +
                "123456789,Adam,SWE,4.00\n" +
                "123456780,Barkat,SWE,3.00\n");
    }

    @Test
    public void TestXMLWrite() throws InvalidStudentIDException{
        Student student1 = new Student("123456787","Rahim","SWE",4.00f);
        Student student2 = new Student("123456789","Adam","SWE",4.00f);
        Student student3 = new Student("123456780","Barkat","SWE",3.00f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        ResultPublication rps=new ResultPublication(studentEnrollment.studentList);
        ExportXML export=new ExportXML("file.xml");
        assertTrue(rps.ExportData(export));
        assertEquals(export.readExportedFile(),"<Student>\n" +
                "<studentID>123456787</studentID>\n" +
                "<name>Rahim</name>\n" +
                "<program>SWE</program>\n" +
                "<CGPA>4.00</CGPA>\n" +
                "</Student>\n" +
                "<Student>\n" +
                "<studentID>123456789</studentID>\n" +
                "<name>Adam</name>\n" +
                "<program>SWE</program>\n" +
                "<CGPA>4.00</CGPA>\n" +
                "</Student>\n" +
                "<Student>\n" +
                "<studentID>123456780</studentID>\n" +
                "<name>Barkat</name>\n" +
                "<program>SWE</program>\n" +
                "<CGPA>3.00</CGPA>\n" +
                "</Student>\n");
    }


}
