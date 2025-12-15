package com.skillnext1;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Insert Student");
            System.out.println("2. Modify Student");
            System.out.println("3. Select All Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                // INSERT
                case 1:
                    Student s1 = new Student();
                    System.out.print("Enter Name: ");
                    s1.setName(sc.next());
                    System.out.print("Enter Sem: ");
                    s1.setSem(sc.nextInt());
                    System.out.print("Enter Dept: ");
                    s1.setDept(sc.next());

                    dao.addStudent(s1);
                    System.out.println("✅ Student Inserted Successfully!");
                    break;

                // UPDATE
                case 2:
                    Student s2 = new Student();
                    System.out.print("Enter ID to Modify: ");
                    s2.setId(sc.nextInt());

                    System.out.print("Enter New Name: ");
                    s2.setName(sc.next());

                    System.out.print("Enter New Sem: ");
                    s2.setSem(sc.nextInt());

                    System.out.print("Enter New Dept: ");
                    s2.setDept(sc.next());

                    dao.updateStudent(s2);
                    System.out.println("✅ Student Updated Successfully!");
                    break;

                // SELECT
                case 3:
                    List<Student> list = dao.getAllStudents();
                    System.out.println("\n===== STUDENTS LIST =====");
                    for (Student st : list) {
                        System.out.println(st);
                    }
                    break;

                // DELETE
                case 4:
                    System.out.print("Enter ID to Delete: ");
                    int id = sc.nextInt();
                    dao.deleteStudent(id);
                    System.out.println("✅ Student Deleted Successfully!");
                    break;

                // EXIT
                case 5:
                    System.out.println("🚀 Exiting... Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid Choice! Try again.");
            }
        }
    }
}

