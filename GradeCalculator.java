package CodSoft;
import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //change the number of subjects as per your requirement
        int numberOfSubjects = 5;
        //storing marks of each subject
        float[] marks = new float[numberOfSubjects];
        for(int i=0; i<numberOfSubjects; i++){
            System.out.print("Enter marks for Subject "+ (i+1) +":");
            marks[i] = sc.nextFloat();      
        }
        sc.close();

        float totalMarks = sum(marks);
        float averagePercentage = totalMarks/numberOfSubjects;
        char grade = calculateGrade(averagePercentage);
        
        System.out.println("RESULT: \n Total Marks: "+totalMarks+" \n Grade: "+grade);
    }

    static float sum(float[] arr){
        float total = 0;
        for(float element : arr){
            total += element;
        } 
        return total;
    }

    static char calculateGrade(float a){
        if(a>=90 && a<=100) return 'A';
        else if(a>=80 && a<90) return 'B';
        else if(a>=70 && a<80) return 'C';
        else if(a>=60 && a<70) return 'D';
        else return 'F';
    }
}