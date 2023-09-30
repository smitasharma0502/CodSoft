import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("STUDENT GRADE CALCULATOR");

        System.out.println("Enter the marks of subjects out of 100: ");
        int numbersubjects= 5;

        double total = 0;
        for(int i=1; i<= numbersubjects; i++) {
            System.out.println("Enter obtained marks in subject "+ +i+" : ");
            double marksofsubject = scanner.nextDouble();
            total += marksofsubject;
        }

        double avgpercentage = total/numbersubjects;
        String grade = calculationofgrade(avgpercentage);

        //RESULT DISPLAY
        System.out.println("/nRESULT: ");
        System.out.println("Overall Marks: "+ total +" out of 500.");
        System.out.println("Average Percentage: "+ avgpercentage+ " %");
        System.out.println("Grade alloted to student "+ grade);

        scanner.close();
    }
    public static String calculationofgrade(double avgpercentage){
        if(avgpercentage>=90){
            return "A+";
        } else if(avgpercentage>=80){
            return "A";
        } else if(avgpercentage>=70){
            return "B";
        } else if(avgpercentage>=60){
            return "C";
        } else if(avgpercentage>=50){
            return "D";
        } else{
            return "Need Improvement";
        }
    }
}
