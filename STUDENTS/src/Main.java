import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (true) {  
            System.out.print("Enter student ID (or 'quit' to exit): ");  
            String studentID = scanner.nextLine();  
  
            if (studentID.equalsIgnoreCase("quit")) {  
                break;  
            }  
  
            System.out.print("Enter student name: ");  
            String studentName = scanner.nextLine();  
  
            System.out.print("Enter number of extra activities: ");  
            int thenumberOfExtraActivities = scanner.nextInt();  
            scanner.nextLine(); 
  
            Student student = new Student(studentID, studentName, thenumberOfExtraActivities);  
  
            for (int i = 0; i < thenumberOfExtraActivities; i++) {  
                System.out.print("Enter extra activity " + (i + 1) + ": ");  
                String activity = scanner.nextLine();  
                student.addExtraActivity(i, activity);  
            }  
  
            System.out.println(student.toString());  
        }  
  
        scanner.close();  
    }  
}