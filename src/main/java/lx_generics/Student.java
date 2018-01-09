package lx_generics;

public class Student extends Person{
    private String specialization;

    public Student(String firstName, String lastName, String specialization) {
        super(firstName, lastName);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Student{" +
               "specialization='" + specialization + '\'' +
               "} " + super.toString();
    }
}
