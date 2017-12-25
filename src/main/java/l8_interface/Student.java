package l8_interface;

public class Student extends Person  {

    private int[] marks;

    public Student(String firstName, String lastName, int[] marks) {
        super(firstName, lastName);
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(final int[] marks) {
        this.marks = marks;
    }

    @Override
    public void greet() {
        System.out.println("Hello, my name is " + this.getFirstName());
    }

}