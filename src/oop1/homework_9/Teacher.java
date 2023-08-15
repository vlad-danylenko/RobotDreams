package src.oop1.homework_9;

public class Teacher {
    public Teacher() {
    }

    private String name;
    private String surname;
    private String age;
    private String student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        if (isNumeric(age)) {
            this.age = age;
        } else {
            System.out.println("Use numbers");
        }
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    private boolean isNumeric (String str) {
        return str.matches("\\d+");
    }
}
