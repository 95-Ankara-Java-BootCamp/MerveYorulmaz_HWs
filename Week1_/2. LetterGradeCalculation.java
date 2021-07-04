package com.company;

public class letterGradeCalculation {
    /*
    This program is a program for calculating
    the letter grade taken depending on
    the exam grades of a course.

    Calculation will be made based on the following scale:
        100 - 91 --> AA
        90  - 85 --> BA
        84  - 70 --> BB
        69  - 60 --> CB
        59  - 55 --> CC
        54  -  0 --> FF
     */
    public static void main(String[] args) {

        //Students' exam grades
        double[] examGrade = {85, 55, 48, 63, 84, 95, 29, 37, 84};

        for(int i=0; i<examGrade.length; i++){

            if(examGrade[i]>90){
                System.out.println("Letter grade of the "+ (i+1) +" student is : AA ");
            }
            else if(examGrade[i]>84 && examGrade[i]<91){
                System.out.println("Letter grade of the "+ (i+1) +" student is : BA");
            }
            else if(examGrade[i]>69 && examGrade[i]<85){
                System.out.println("Letter grade of the "+ (i+1) +" student is : BB");
            }
            else if(examGrade[i]>59 && examGrade[i]<70){
                System.out.println("Letter grade of the "+ (i+1) +" student is : CB");
            }
            else if(examGrade[i]>54 && examGrade[i]<60){
                System.out.println("Letter grade of the "+ (i+1) +" student is : CC");
            }
            else{
                System.out.println("Letter grade of the "+ (i+1) +" student is : FF");
            }
        }
    }
}
