import java.util.*;
class Student {
    private int studentId;
    private String name;
    private int age;
    private String grade;
    private String fatherName;
    private String motherName;
    private String phoneNumber;
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private int historyMarks;
    private int socialScienceMarks;

    public Student(int studentId, String name, int age, String grade, String fatherName, String motherName, String phoneNumber) {
        this.studentId=studentId;
        this.name=name;
        this.age=age;
        this.grade =grade;
        this.fatherName=fatherName;
        this.motherName=motherName;
        this.phoneNumber=phoneNumber;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade=grade;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName=fatherName;
    }
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName=motherName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    public int getEnglishMarks() {
        return englishMarks;
    }
    public void setEnglishMarks(int englishMarks) {
        this.englishMarks=englishMarks;
    }
    public int getMathsMarks() {
        return mathsMarks;
    }
    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks=mathsMarks;
    }
    public int getScienceMarks() {
        return scienceMarks;
    }
    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks=scienceMarks;
    }
    public int getHistoryMarks() {
        return historyMarks;
    }
    public void setHistoryMarks(int historyMarks) {
        this.historyMarks=historyMarks;
    }
    public int getSocialScienceMarks() {
        return socialScienceMarks;
    }
    public void setSocialScienceMarks(int socialScienceMarks) {
        this.socialScienceMarks=socialScienceMarks;
    }
    public double calculatePercentage() {
        return (englishMarks+mathsMarks+scienceMarks+historyMarks+socialScienceMarks)/5.0;
    }
    public void displayStudentDetails() {
        System.out.println("Student ID: "+studentId);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        System.out.println("Father's Name: "+fatherName);
        System.out.println("Mother's Name: "+motherName);
        System.out.println("Phone Number: "+phoneNumber);
    }

    public void showProgress() {
        System.out.println("English Marks: "+englishMarks);
        System.out.println("Maths Marks: "+mathsMarks);
        System.out.println("Science Marks: "+scienceMarks);
        System.out.println("History Marks: "+historyMarks);
        System.out.println("Social Science Marks: "+socialScienceMarks);
        System.out.println("Percentage: "+calculatePercentage()+"%");
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] students=new Student[100];
        int studentCount=0;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student Details");
            System.out.println("3. Update Student Information");
            System.out.println("4. Show Progress");
            System.out.println("5. Exit");

            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student ID: ");
                    int studentId=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter student age: ");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student grade: ");
                    String grade=sc.nextLine();
                    System.out.print("Enter father's name: ");
                    String fatherName=sc.nextLine();
                    System.out.print("Enter mother's name: ");
                    String motherName=sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber=sc.nextLine();
                    System.out.print("Enter English marks: ");
                    int englishMarks=sc.nextInt();
                    System.out.print("Enter Maths marks: ");
                    int mathsMarks=sc.nextInt();
                    System.out.print("Enter Science marks: ");
                    int scienceMarks=sc.nextInt();
                    System.out.print("Enter History marks: ");
                    int historyMarks=sc.nextInt();
                    System.out.print("Enter Social Science marks: ");
                    int socialScienceMarks=sc.nextInt();
                    students[studentCount]=new Student(studentId, name, age, grade, fatherName, motherName, phoneNumber);
                    students[studentCount].setEnglishMarks(englishMarks);
                    students[studentCount].setMathsMarks(mathsMarks);
                    students[studentCount].setScienceMarks(scienceMarks);
                    students[studentCount].setHistoryMarks(historyMarks);
                    students[studentCount].setSocialScienceMarks(socialScienceMarks);
                    studentCount++;
                    System.out.println("Student added successfully.");
                }
                case 2 -> {
                    System.out.print("Enter student ID: ");
                    int studentId=sc.nextInt();
                    Student student=findStudent(students, studentCount, studentId);
                    if (student!=null && student.getStudentId()!=-1) {
                        student.displayStudentDetails();
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter student ID: ");
                    int studentId=sc.nextInt();
                    Student student=findStudent(students, studentCount, studentId);
                    if (student!=null && student.getStudentId()!=-1) {
                        System.out.print("Enter new student name: ");
                        sc.nextLine();
                        String name=sc.nextLine();
                        System.out.print("Enter new student age: ");
                        int age=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new student grade: ");
                        String grade=sc.nextLine();
                        System.out.print("Enter new father's name: ");
                        String fatherName=sc.nextLine();
                        System.out.print("Enter new mother's name: ");
                        String motherName=sc.nextLine();
                        System.out.print("Enter new phone number: ");
                        String phoneNumber=sc.nextLine();
                        System.out.print("Enter new English marks: ");
                        int englishMarks=sc.nextInt();
                        System.out.print("Enter new Maths marks: ");
                        int mathsMarks=sc.nextInt();
                        System.out.print("Enter new Science marks: ");
                        int scienceMarks=sc.nextInt();
                        System.out.print("Enter new History marks: ");
                        int historyMarks=sc.nextInt();
                        System.out.print("Enter new Social Science marks: ");
                        int socialScienceMarks=sc.nextInt();
                        student.setName(name);
                        student.setAge(age);
                        student.setGrade(grade);
                        student.setFatherName(fatherName);
                        student.setMotherName(motherName);
                        student.setPhoneNumber(phoneNumber);
                        student.setEnglishMarks(englishMarks);
                        student.setMathsMarks(mathsMarks);
                        student.setScienceMarks(scienceMarks);
                        student.setHistoryMarks(historyMarks);
                        student.setSocialScienceMarks(socialScienceMarks);
                        System.out.println("Student information updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter student ID: ");
                    int studentId=sc.nextInt();
                    Student student=findStudent(students, studentCount, studentId);
                    if (student!=null && student.getStudentId()!=-1) {
                        student.showProgress();
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 5 -> {
                    System.out.println("Exit");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static Student findStudent(Student[] students, int studentCount, int studentId) {
        for (int i=0; i<studentCount; i++) {
            if (students[i].getStudentId()==studentId) {
                return students[i];
            }
        }
        return new Student(-1, "Invalid", 0, "Invalid", "Invalid", "Invalid", "Invalid");
    }
}