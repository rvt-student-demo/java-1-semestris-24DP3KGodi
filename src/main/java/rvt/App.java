package rvt;

public class App {
    public static void main (String[] args) {

        Student student1 = new Student("Janis",  20);
        System.out.println(student1.name);

        Student student2 = new Student("Anna", 16);
        System.out.println(student2.name);

        Student student3 = new Student("Maija", 19);
        System.out.println(student2.name);
    }
}