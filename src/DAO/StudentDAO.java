/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Entity.Student;
import java.util.Date;

/**
 *
 * @author Kavito
 */
public class StudentDAO {
    
    private StudentDAO()
    {
        
    }
    
    public static int insertStudent(Student student)
    {
        String studentName = student.getStudentName();
        String studentAge = student.getStudentAge();
        String studentAddress = student.getStudentAddress();
        String studentPhone = student.getStudentPhone();
        String studentEmail = student.getStudentEmail();
        String studentNationality = student.getStudentNationality();
        String studentLanguage = student.getStudentLanguage();
        Date studentInternDate = student.getStudentInternDate();
        Date studentExamDate = student.getStudentExamDate();
    }
}

