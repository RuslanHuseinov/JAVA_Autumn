import java.util.Objects;

public final class Student {
    int ID; /*uniqe value*/
    String name;
    int age;
    String group;

    @Override
    public boolean equals(Object object) {
        if (this ==object) return true;

        if (object != null && object instanceof Student) {
            Student student = (Student) object;
            return (this.age == student.age &&
                    this.group.equals(student.group) &&
                    this.name.equals(student.name));

        }
        return false;
    }

    @Override
    public int hashCode() {
        return (31 * age)
                - ((group == null) ? 0 :group.hashCode())
                +((name == null) ? 0 : name.hashCode()) ;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Object ob = new Object();
        System.out.println(student.equals(null));
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}
