package student;

public class Student {
    private String name;
    private String lastName;
    private double grade;

    //конструктор
    public Student (String name, String lastName, double grade) {
        //нов обект
        //name = null
        //lastName = null
        //grade = 0.0
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }

    //методи -> функционалности (какво прави студента?)
    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        //"{first name} {second name}: {grade}"
        return String.format("%s %s: %.2f", this.name, this.lastName, this.grade);
    }
}
