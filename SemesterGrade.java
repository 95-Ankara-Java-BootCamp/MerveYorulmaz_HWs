package com.company;

import java.util.Scanner;

/*

This program is the program that
takes the midterm and final grade from student
and calculates the letter grade and the semester point grade.

 */

public class Main {

    static float semesterNote;
    static String letterGrade;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("********\n Welcome to the semester grade calculation screen \n********");

        float midtermNote;
        float finalNote;

        //get exam grade from user
        // Checking the midterm and final grade (0-100) intervals was done with do while
        do{
            System.out.print("Please enter midterm note(midterm note should be between 0-100) : ");
            midtermNote = scanner.nextFloat();
        }while(midtermNote<0 || midtermNote>100); // If the entered grade is between 0-100, it will continue to request the grade.

        do{
            System.out.print("Please enter final note(final note should be between 0-100) : ");
            finalNote = scanner.nextFloat();
        }while(finalNote<0 || finalNote>100);

        //Call calculate semester grade func
        semesterNote = calculateSemesterGrade(midtermNote,finalNote);
        System.out.println("Semester Grade : "+semesterNote);
        //Call calculate letter grade fun
        letterGrade = calculateLetterGrade(semesterNote);
        System.out.println("Letter Grade : "+letterGrade);

    }

    public static float calculateSemesterGrade(float midterm, float finalNote){
        // This func calculate semester grade with midterm and final grade
        semesterNote = (midterm/2)+((finalNote*7)/10);
        return semesterNote;
    }
    public static String calculateLetterGrade(float semesterNote){
        // This func calculate letter grade with semester

            if(semesterNote>70){ letterGrade ="AA"; }
            else if(semesterNote>50 && semesterNote<71){ letterGrade ="BB";}
            else if(semesterNote>20 && semesterNote<51){ letterGrade ="CB"; }
            else{ letterGrade ="FF"; }

        return letterGrade;
    }

    /*
    Expected Output Exa:
    Please enter midterm note(midterm note should be between 0-100) : 105
    Please enter midterm note(midterm note should be between 0-100) : 102
    Please enter midterm note(midterm note should be between 0-100) : 10
    Please enter final note(final note should be between 0-100) : 95
    Semester Grade : 71.5
    Letter Grade : AA
     */
}
