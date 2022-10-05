/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasewithdbclass;

import java.sql.SQLException;
import java.util.ArrayList;
import utilities.DatabaseDriver;
import utilities.DatabaseHandler;
/**
 *
 * @author kant2
 */
public class StudentdatabaseWithDBclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/student";
        String user = "app";
        String passwd = "app";
        /*String driver = "com.mysql.cj.jdbc.Driver";
        //String url="jdbc:mysql://localhost:3306/student?serverTimezone=UTC";
        String user = "root";
        String passwd = "root";*/
        DatabaseDriver dbDriver = new DatabaseDriver(driver, url, user, passwd);
        DatabaseHandler dbHandler = new DatabaseHandler(dbDriver);
        Student std1 = new Student(1, "John", 3.5);
        Student std2 = new Student(2, "Marry", 1.8);
        StudentTable.insertStudent(dbHandler, std1);
        StudentTable.insertStudent(dbHandler, std2);
        //std1.setGPA(4.0);
        //StudentTable.updateStudent(dbHandler, std1);
        //StudentTable.deleteStudent(dbHandler, std1);
//        ArrayList<Student> studentList = StudentTable.findAllStudent(dbHandler);
//        if (studentList != null) {
//            printAllStudent(studentList);
//        }
        dbHandler.closeConnection();
    }
    
//    public static void printAllStudent(ArrayList<Student> stdList) {
//        for(int i = 0; i < stdList.size(); i++) {
//            System.out.print(stdList.get(i).getId() + " ");
//            System.out.print(stdList.get(i).getName() + " ");
//            System.out.println(stdList.get(i).getGPA() + " ");
//        }
//        
//    }
}
