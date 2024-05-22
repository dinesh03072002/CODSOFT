import java.util.*;
import java.lang.*;
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Enter number of subjects:");
        int ns = sc.nextInt();
        float total=0;
        for(int i=1;i<=ns;i++){
            System.out.println("Enter the marks of subject " + i + ": ");
            float marks = sc.nextFloat();
            total+=marks;
        }
        double avgp=(double)total/ns;
        char grade;
        if(avgp>=90){
            grade='O';
        }
        else if(avgp>=80){
            grade='A';
        }
        else if(avgp>=70){
            grade='B';
        }
        else if(avgp>=60){
            grade='c';
        }
        else if(avgp>=50){
            grade='D';
        }
        else if(avgp>=40){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("\nTotal marks obtained: "+total);
        System.out.println("\nAverage percentage: "+avgp);
        System.out.println("\nGrade obtained: "+grade);
    }
}