package Interfaces;

public interface Emoployee {
    public Long getSalary();
    public String getName();
    public void setBirthDate();
    public void setHiringDate();

    public void setDepartment(Department department);
    public Department getDepartment();
}
