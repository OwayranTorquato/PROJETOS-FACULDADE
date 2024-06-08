public class Developer extends Employee {
    private String mainLanguage;

    public Developer(String name, String position, double salary, String mainLanguage) {
        super(name, position, salary);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                ", mainLanguage='" + mainLanguage + '\'' +
                '}';
    }
}
