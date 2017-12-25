package l8_interface;

public abstract class Teacher extends Person {
    private String otchestvo;
    private String degree;

    public Teacher(String firstName, String otchestvo, String lastName) {
        super(firstName, lastName);
        this.otchestvo = otchestvo;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public void greet() {
        System.out.println("Dobriy den', zvonok dlya uchitelya");
    }
}

