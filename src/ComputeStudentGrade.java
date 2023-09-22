import java.util.Scanner;
public class ComputeStudentGrade {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //define max points for each category
    int maxHomeworkPoints = 800;
    int maxQuizzesPoints = 400;
    int maxMidtermPoints = 150;
    int maxFinalExamPoints = 200;

    System.out.println("Course Grade Calculator:");

    //determine users student status
    System.out.print("Enter student status (UG, G, or DL): ");
    String status = scanner.nextLine();

        System.out.println("Student Status? :" + status);

    //define the assignment weight percentages
    double homeworkWeight = 0;
    double quizzesWeight = 0;
    double midtermWeight = 0;
    double finalExamWeight = 0;

    if (status.equals("UG")) {
        homeworkWeight = 0.20;
        quizzesWeight = 0.20;
        midtermWeight = 0.30;
        finalExamWeight = 0.30;
    } else if (status.equals("G")) {
        homeworkWeight = 0.15;
        quizzesWeight = 0.05;
        midtermWeight = 0.35;
        finalExamWeight = 0.45;
    } else if (status.equals("DL")) {
        homeworkWeight = 0.05;
        quizzesWeight = 0.05;
        midtermWeight = 0.40;
        finalExamWeight = 0.50;
    } else {
        System.out.println("Error: student status must be UG, G, or DL");
    }

    //Ask user for number of points in each category
    System.out.print("Homework Points? : ");
    double homeworkPoints = scanner.nextDouble();
    System.out.print("Quiz Points? : ");
    double quizzesPoints = scanner.nextDouble();
    System.out.print("Midterm Exam Points? : ");
    double midtermPoints = scanner.nextDouble();
    System.out.print("Final Exam Points? : ");
    double finalExamPoints = scanner.nextDouble();

    //calculate percentage of points earned for each section
    double homeworkPercentage = (homeworkPoints / maxHomeworkPoints) * 100;
    double quizzesPercentage = (quizzesPoints / maxQuizzesPoints) * 100;
    double midtermPercentage = (midtermPoints / maxMidtermPoints) * 100;
    double finalExamPercentage = (finalExamPoints / maxFinalExamPoints) * 100;

    //Calculate the total percentage based off of weight
    double totalPercentage = (homeworkPercentage * homeworkWeight) + (quizzesPercentage * quizzesWeight) + (midtermPercentage * midtermWeight) + (finalExamPercentage * finalExamWeight);

    //Determine letter grade based off of the total percentage
    String letterGrade;
    if (totalPercentage >= 93) {
        letterGrade = "A";
    } else if (totalPercentage >= 90) {
        letterGrade = "A-";
    } else if (totalPercentage >= 87) {
        letterGrade = "B+";
    } else if (totalPercentage >= 83) {
        letterGrade = "B";
    } else if (totalPercentage >= 80) {
        letterGrade = "B-";
    } else if (totalPercentage >= 77) {
        letterGrade = "C+";
    } else if (totalPercentage >= 73) {
        letterGrade = "C";
    } else if (totalPercentage >= 70) {
        letterGrade = "C-";
    } else if (totalPercentage >= 67) {
        letterGrade = "D+";
    } else if (totalPercentage >= 63) {
        letterGrade = "D";
    } else if (totalPercentage >= 60) {
        letterGrade = "D-";
    } else {
        letterGrade = "F";
    }

        System.out.println("Homework: " + homeworkPercentage + "%");
        System.out.println("Quizzes: " + quizzesPercentage + "%");
        System.out.println("Midterm Exam: " + midtermPercentage + "%");
        System.out.println("Final Exam: " + finalExamPercentage + "%");
        System.out.print("Course Grade: " + totalPercentage + "%");
        System.out.print(" " + letterGrade);

    }
}
