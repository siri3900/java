package oop;


public class Student {
  
      String name;
      int age;

      // Constructor
      Student(String n, int a) {
          name = n;
          age = a;
      }

      // Method to display
      void display() {
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
      }

      public static void main(String[] args) {
          Student s1 = new Student("Siri", 18);
          s1.display();
      }
  }